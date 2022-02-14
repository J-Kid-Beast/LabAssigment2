package com.example.mortgage_calculator_lab_2;
import java.text.DecimalFormat;

public class Mortgage {
    /**Proper format to display an amount of money*/
    public final DecimalFormat MONEY = new DecimalFormat( "$#,##0.00" );
    /**The amount of the loan for the mortgage.*/
    private float amount;
    /**The number of years the mortgage will last.*/
    private int years;
    /**The interest rate of the mortgage.*/
    private float rate;

    public Mortgage( ) {
        setAmount( 100000.0f );
        setYears( 30 );
        setRate( 0.035f );
    }// end default constructor

    public void setAmount( float newAmount ) {
        if( newAmount >= 0 )
        amount = newAmount;
    }// end setAmount()

    public void setYears( int newYears ) {
        if( newYears >= 0 )
            years = newYears;
    }// end setYears()

    public void setRate( float newRate ) {
        if( newRate >= 0 )
            rate = newRate;
    }// end setRate()

    public float getAmount( ) {
        return amount;
    }// end getAmount()

    public String getFormattedAmount( ) {
        return MONEY.format( amount );
    }// end getFormattedAmount()

    public int getYears( ) {
        return years;
    }// end getYears()

    public float getRate( ) {
        return rate;
    }// end getRate()

    /**The calculated monthly payment for the mortgage.
     * @return A float representing the monthly payment.
     */
    public float monthlyPayment( ) {
        float mRate = rate / 12; // monthly interest rate
        double temp = Math.pow( 1/( 1 + mRate ), years * 12 );
        return amount * mRate / ( float ) ( 1 - temp );
    }// end monthlyPayment()

    /**The calculated monthly payment for the mortgage
     * in the proper currency format.
     * @return A string representing the formatted
     * monthly payment.
     */
    public String formattedMonthlyPayment( ) {
        return MONEY.format( monthlyPayment( ) );
    }// end formattedMonthlyPayment()

    /**The total calculated payment of the mortgage.
     * @return A float representing the total amount of the mortgage.
     */
    public float totalPayment( ) {
        return monthlyPayment( ) * years * 12;
    }// end totalPayment()

    /**The total calculated payment of the mortgage
     * in the proper currency format.
     * @return A float representing the total amount
     * of the mortgage.
     */
    public String formattedTotalPayment( ) {
        return MONEY.format( totalPayment( ) );
    }// end formattedTotalPayment()

}// end Mortgage class


package com.example.mortgage_calculator_lab_2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static Mortgage mortgage;

    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        mortgage = new Mortgage(this);
        setContentView(R.layout.activity_main);
    }// end onCreate()

    public void onStart( ) {
        super.onStart( );
        updateView();
    }// end onStart()

    public void updateView( ) {
        TextView amountTV = ( TextView ) findViewById( R.id.amount );
        amountTV.setText( mortgage.getFormattedAmount( ) );
        TextView yearsTV = ( TextView ) findViewById( R.id.years );
        yearsTV.setText("" + mortgage.getYears());

        TextView interestTV = (TextView) findViewById(R.id.rate);
        interestTV.setText("" + mortgage.getRate());
        TextView monthlyPayment = (TextView) findViewById((R.id.monthly_payment));
        monthlyPayment.setText(mortgage.formattedMonthlyPayment());
        TextView totalPayment = (TextView) findViewById(R.id.total_payment);
        totalPayment.setText((mortgage.formattedTotalPayment()));
    }// end updateView()

    public void modifyData( View v ) {
        Intent myIntent = new Intent(this, DataActivity.class);
        this.startActivity(myIntent);
    }// end modifyData()

}// end MainActivity class
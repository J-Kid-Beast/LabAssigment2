package com.example.mortgage_calculator_lab_2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_main);
    }// end onCreate()

    public void modifyData( View v ) {
        Intent myIntent = new Intent(this, DataActivity.class);
        this.startActivity(myIntent);
    }// end modifyData()

}// end MainActivity class
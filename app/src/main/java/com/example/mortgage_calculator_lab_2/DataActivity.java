package com.example.mortgage_calculator_lab_2;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class DataActivity extends AppCompatActivity {
    public void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_data);
    }// end onCreate()

    public void goBack(View v) {
        this.finish();
    }// end goBack()

}// end DataActivity class
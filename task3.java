package com.example.hi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, message(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, addNumbers(3, 5), Toast.LENGTH_LONG).show();
        mySms();
        sum(7,20);

    }


//return method without parameters
    String message(){
        String sms = "Hello world, from return method";
        return sms;
    }

//return method with parameters
    int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

//void method without parameters
    void mySms(){
        String sms = "Hello World, from void method";
        Toast.makeText(this, sms, Toast.LENGTH_LONG).show();
    }

//void method without parameters
    void sum(int num1, int num2) {
        int x = num1;
        int y = num2;
        int result = x + y ;
        Toast.makeText(this, "Sum is: " + result, Toast.LENGTH_LONG).show();
    }
}
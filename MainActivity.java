package com.example.kunalfarmah.coffee_order;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int coffee =1;
    int price =0;

    EditText e = findViewById(R.id.ed1);
    String result = e.getText().toString();




    public void SubmitOrder( View view){
        check(result);
        float total = coffee*price;
        float CGST = total*(float)(9/100);
        float SGST = total*(float)(9/100);

        grandtotal(total + CGST+ SGST);

        Toast.makeText(getApplicationContext(),"Order Successfully Placed", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Thank You ", Toast.LENGTH_LONG).show();
    }

    public void increment (View view){
        check(result);
        display(++coffee);
        displayprice(coffee*price);

        float total = coffee*price;
        float CGST = total*(float)(9/100);
        float SGST = total*(float)(9/100);

        grandtotal(total + CGST+ SGST);

    }

    public void decrement(View view){
        display(--coffee);
        displayprice(coffee*price);

        float total = coffee*price;
        float CGST = total*(float)(9/100);
        float SGST = total*(float)(9/100);

        grandtotal(total + CGST+ SGST);
    }


    private void displayprice (float n){
        TextView t1 = (TextView) findViewById(R.id.textView6);
        t1.setText("" + n );
    }

    private void grandtotal (float n){
        TextView t3 = (TextView) findViewById(R.id.textView9);
        t3.setText("" + n );
    }

    private void display (float n){
        TextView t2 = (TextView) findViewById(R.id.textView3);
        t2.setText("" + n );
    }


    private void check(String result){

        if(result=="Capuccino")
            price = 20;

        else if(result=="latte")
            price = 30;

        else if(result=="dragon")
            price = 50;

        else
            price = 15;
    }
}

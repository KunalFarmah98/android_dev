package com.example.kunalfarmah.compose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity_compose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_compose);
    }

    public void back(View  v){
        Toast.makeText(getApplicationContext(),"Going back",Toast.LENGTH_LONG);
    }
    public void attatch(View  v){
        Toast.makeText(getApplicationContext(),"Attatching",Toast.LENGTH_LONG);
    }
    public void send(View  v){
        Toast.makeText(getApplicationContext(),"Message Send",Toast.LENGTH_LONG);
    }

}

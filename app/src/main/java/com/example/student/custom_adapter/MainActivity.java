package com.example.student.custom_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    Spinner spDS ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spDS = (Spinner)findViewById(R.id.Sp_DS);

        ArrayList <String> lstCauthu = new ArrayList<String>();
        lstCauthu.add("David Beckham");
        lstCauthu.add("Cryff");
        lstCauthu.add("Messi");
        lstCauthu.add("Pele");
        lstCauthu.add("Ronaldo");
        lstCauthu.add("Ronaldo beo");
        lstCauthu.add("zidane");

        ArrayAdapter <String>arraycauthu = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,lstCauthu);
       arraycauthu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDS.setAdapter(arraycauthu);
    }

}

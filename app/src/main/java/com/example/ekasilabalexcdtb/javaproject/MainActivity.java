package com.example.ekasilabalexcdtb.javaproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ekasilabalexcdtb.javaproject.Classes.Pearl;
import com.example.ekasilabalexcdtb.javaproject.Classes.Thabo;

public class MainActivity extends AppCompatActivity {

    //Create the object for Thabo
    private Thabo objThabo;
    private Pearl objPearl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objThabo = new Thabo("Thabo", "Chauke", "91081546478864", "Male", "African", 16);
        objPearl = new Pearl("Pearl", "Maluleke", "910213546124", "Female", "African", 15);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        TextView textView10 = (TextView) findViewById(R.id.textView10);
        TextView textView11 = (TextView) findViewById(R.id.textView11);
        TextView textView12 = (TextView) findViewById(R.id.textView12);

        textView1.setText(objThabo.getName());
        textView2.setText(objThabo.getSurname());
        textView3.setText(objThabo.getId_Nr());
        textView4.setText(objThabo.getGender());
        textView5.setText(objThabo.getRace());
        textView6.setText(Integer.toString(objThabo.getAge()));


        textView7.setText(objPearl.getName());
        textView8.setText(objPearl.getSurname());
        textView9.setText(objPearl.getId_Nr());
        textView10.setText(objPearl.getGender());
        textView11.setText(objThabo.getRace());
        textView12.setText(Integer.toString(objPearl.getAge()));
    }
}

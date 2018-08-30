package com.example.sanketpatel.problem_solver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class chooser extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
                     Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooser);
        b1=(Button)findViewById(R.id.pressone);
        b2=(Button)findViewById(R.id.presstwo);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listenervity.this);
        spinner.setOnItemSelectedListener(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(chooser.this,Instruction.class);
                startActivity(i);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(chooser.this,einstruction.class);
                startActivity(i);
            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapterView.getItemAtPosition(i).toString();

        // Showing selected spinner item
        Toast.makeText(adapterView.getContext(), ""+ item, Toast.LENGTH_LONG).show();

        switch (i)
        {
            case 0:
                break;
            case 1:

                Intent i2 =new Intent(chooser.this,Instruction.class);
                startActivity(i2);

                break;

            case 2:
                Intent i3 =new Intent(chooser.this,einstruction.class);
                startActivity(i3);

                break;


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

package com.example.sanketpatel.problem_solver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class einstruction extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einstruction);
           b=(Button)findViewById(R.id.press);
           b.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent i=new Intent(einstruction.this,eight.class);
                   startActivity(i);
               }
           });
    }
}

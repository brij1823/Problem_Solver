package com.example.sanketpatel.problem_solver;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class puzzle extends AppCompatActivity {

    Button b1,b2,b3,b4,solve,reset,next;
    TextView t;
    int counter=0;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);
        next=(Button)findViewById(R.id.next);
        t=(TextView)findViewById(R.id.write);
        b1=(Button)findViewById(R.id.one);
        b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);
        b4=(Button)findViewById(R.id.four) ;
        solve=(Button)findViewById(R.id.solve);
        reset=(Button)findViewById(R.id.reset);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 =new Intent(puzzle.this,eight.class);
                startActivity(i3);

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundResource(android.R.drawable.btn_default);
                b2.setBackgroundResource(android.R.drawable.btn_default);
                b3.setBackgroundResource(android.R.drawable.btn_default);
                b4.setBackgroundResource(android.R.drawable.btn_default);
                counter=0;
            }
        });

        t.setVisibility(View.GONE);
        solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag=1;
                    t.setVisibility(View.VISIBLE);
            }
        });





              b1.setOnClickListener(new View.OnClickListener() {
                  @SuppressLint("ResourceAsColor")
                  @Override
                  public void onClick(View view) {


                      if (flag == 0) {
                          Toast.makeText(puzzle.this, "First press solve button", Toast.LENGTH_SHORT).show();
                      } else {
                          if (counter == 0) {
                              b1.setBackgroundColor(Color.GREEN);
                              counter++;
                          } else {
                              b1.setBackgroundColor(Color.RED);
                              b2.setBackgroundColor(Color.RED);
                              b3.setBackgroundColor(Color.RED);
                              b4.setBackgroundColor(Color.RED);
                              counter = 0;
                              Toast.makeText(puzzle.this,"Sry Game over !..press the reset button to restart",Toast.LENGTH_SHORT).show();
                          }
                      }
                  }
              });
              b2.setOnClickListener(new View.OnClickListener() {
                  @SuppressLint("ResourceAsColor")
                  @Override
                  public void onClick(View view) {



                      if (flag == 0) {
                          Toast.makeText(puzzle.this, "First press solve button", Toast.LENGTH_SHORT).show();
                      } else {
                          if (counter == 1) {
                              b2.setBackgroundColor(Color.GREEN);
                              counter++;
                          } else {
                              b1.setBackgroundColor(Color.RED);
                              b2.setBackgroundColor(Color.RED);
                              b3.setBackgroundColor(Color.RED);
                              b4.setBackgroundColor(Color.RED);

                              counter = 0;

                              Toast.makeText(puzzle.this,"Sry Game over !..press the reset button to restart",Toast.LENGTH_SHORT).show();
                          }
                      }
                  }
              });

              b3.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {

                      if (flag == 0) {
                          Toast.makeText(puzzle.this, "First press solve button", Toast.LENGTH_SHORT).show();
                      } else {
                          if (counter == 2) {
                              b3.setBackgroundColor(Color.GREEN);
                              counter++;
                          } else {
                              b1.setBackgroundColor(Color.RED);
                              b2.setBackgroundColor(Color.RED);
                              b3.setBackgroundColor(Color.RED);
                              b4.setBackgroundColor(Color.RED);

                              counter = 0;

                              Toast.makeText(puzzle.this,"Sry Game over !..press the reset button to restart",Toast.LENGTH_SHORT).show();
                          }
                      }

                  }
              });

              b4.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {

                      if (flag == 0) {
                          Toast.makeText(puzzle.this, "First press solve button", Toast.LENGTH_SHORT).show();
                      } else {
                          if (counter == 3) {
                              b4.setBackgroundColor(Color.GREEN);
                              Toast.makeText(puzzle.this,"Congrats you solved the puzzle solve the next button to go to next",Toast.LENGTH_SHORT).show();
                              counter++;
                          } else {
                              b1.setBackgroundColor(Color.RED);
                              b2.setBackgroundColor(Color.RED);
                              b3.setBackgroundColor(Color.RED);
                              b4.setBackgroundColor(Color.RED);

                              counter = 0;

                              Toast.makeText(puzzle.this,"Sry Game over !..press the reset button to restart",Toast.LENGTH_SHORT).show();
                          }
                      }

                  }
              });



        
    }
}

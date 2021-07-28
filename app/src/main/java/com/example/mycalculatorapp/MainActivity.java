package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.*;
import android.app.backup.BackupAgent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    static TextView data;
    static TextView output;
    Button addorsub;
    Button brackets;
    Button dot;
    Button percentage;
    Button division;
    Button number7;
    Button number8;
    Button number9;
    Button multiplication;
    Button number4;
    Button number5;
    Button number6;
    Button subtraction;
    Button number1;
    Button number2;
    Button number3;
    Button addition;
    Button clear;
    Button number0;
    Button equal;
    String exp ="";
    static int f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data=findViewById(R.id.data);
        output=findViewById(R.id.output);
        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        number3=findViewById(R.id.number3);
        number4=findViewById(R.id.number4);
        number5=findViewById(R.id.number5);
        number6=findViewById(R.id.number6);
        number7=findViewById(R.id.number7);
        number8=findViewById(R.id.number8);
        number9=findViewById(R.id.number9);
        clear=findViewById(R.id.clear);
        number0=findViewById(R.id.number0);
        brackets=findViewById(R.id.brackets);
        addition=findViewById(R.id.addition);
        subtraction=findViewById(R.id.subtraction);
        multiplication=findViewById(R.id.multiplication);
        percentage=findViewById(R.id.percentage);
        equal=findViewById(R.id.equal);
        addorsub=findViewById(R.id.addorsub);
        division=findViewById(R.id.divison);
        dot=findViewById(R.id.dot);

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp=exp+".";
                output.setText(" ");
                data.setText(exp);
            }
        });

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int g=exp.length();
                if(g==0)
                    exp=exp+"1";
                else if(exp.charAt(g-1)=='('||exp.charAt(g-1)==')'||exp.charAt(g-1)=='+'||exp.charAt(g-1)=='-'||exp.charAt(g-1)=='/'||exp.charAt(g-1)=='*')
                exp=exp+" 1";
                else
                    exp=exp+"1";
                output.setText(" ");
                data.setText(exp);
            }
        });
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int g=exp.length();
                if(g==0)
                    exp=exp+"2";
                else if(exp.charAt(g-1)=='('||exp.charAt(g-1)==')'||exp.charAt(g-1)=='+'||exp.charAt(g-1)=='-'||exp.charAt(g-1)=='/'||exp.charAt(g-1)=='*')
                    exp=exp+" 2";
                else
                    exp=exp+"2";
                output.setText(" ");
                data.setText(exp);
            }
        });
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int g=exp.length();
                if(g==0)
                    exp=exp+"3";
                else if(exp.charAt(g-1)=='('||exp.charAt(g-1)==')'||exp.charAt(g-1)=='+'||exp.charAt(g-1)=='-'||exp.charAt(g-1)=='/'||exp.charAt(g-1)=='*')
                    exp=exp+" 3";
                else
                    exp=exp+"3";
                output.setText(" ");
                data.setText(exp);
            }
        });
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int g=exp.length();
                if(g==0)
                    exp=exp+"4";
                else if(exp.charAt(g-1)=='('||exp.charAt(g-1)==')'||exp.charAt(g-1)=='+'||exp.charAt(g-1)=='-'||exp.charAt(g-1)=='/'||exp.charAt(g-1)=='*')
                    exp=exp+" 4";
                else
                    exp=exp+"4";
                output.setText(" ");
                data.setText(exp);
            }
        });
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int g=exp.length();
                if(g==0)
                    exp=exp+"5";
                else if(exp.charAt(g-1)=='('||exp.charAt(g-1)==')'||exp.charAt(g-1)=='+'||exp.charAt(g-1)=='-'||exp.charAt(g-1)=='/'||exp.charAt(g-1)=='*')
                    exp=exp+" 5";
                else
                    exp=exp+"5";
                output.setText(" ");
                data.setText(exp);
            }
        });
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int g=exp.length();
                if(g==0)
                    exp=exp+"6";
                else if(exp.charAt(g-1)=='('||exp.charAt(g-1)==')'||exp.charAt(g-1)=='+'||exp.charAt(g-1)=='-'||exp.charAt(g-1)=='/'||exp.charAt(g-1)=='*')
                    exp=exp+" 6";
                else
                    exp=exp+"6";
                output.setText(" ");
                data.setText(exp);
            }
        });
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int g=exp.length();
                if(g==0)
                    exp=exp+"7";
                else if(exp.charAt(g-1)=='('||exp.charAt(g-1)==')'||exp.charAt(g-1)=='+'||exp.charAt(g-1)=='-'||exp.charAt(g-1)=='/'||exp.charAt(g-1)=='*')
                    exp=exp+" 7";
                else
                    exp=exp+"7";
                output.setText(" ");
                data.setText(exp);
            }
        });
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int g=exp.length();
                if(g==0)
                    exp=exp+"8";
                else if(exp.charAt(g-1)=='('||exp.charAt(g-1)==')'||exp.charAt(g-1)=='+'||exp.charAt(g-1)=='-'||exp.charAt(g-1)=='/'||exp.charAt(g-1)=='*')
                    exp=exp+" 8";
                else
                    exp=exp+"8";
                output.setText(" ");
                data.setText(exp);
            }
        });
        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int g=exp.length();
                if(g==0)
                    exp=exp+"9";
                else if(exp.charAt(g-1)=='('||exp.charAt(g-1)==')'||exp.charAt(g-1)=='+'||exp.charAt(g-1)=='-'||exp.charAt(g-1)=='/'||exp.charAt(g-1)=='*')
                    exp=exp+" 9";
                else
                    exp=exp+"9";
                output.setText(" ");
                data.setText(exp);
            }
        });
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+" +";
                output.setText(" ");
                data.setText(exp);
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+" -";
                output.setText(" ");
                data.setText(exp);
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+" *";
                output.setText(" ");
                data.setText(exp);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=exp+" /";
                output.setText(" ");
                data.setText(exp);
            }
        });
        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c=exp.length();
                if(c>0&&exp.charAt(c-1)=='/') {
                    output.setText("cannot divide by zero");
                    data.setText(" ");
                    exp="";
                }
                else {
                    int g=exp.length();
                    if(g==0)
                        exp=exp+"0";
                   else if(exp.charAt(g-1)=='('||exp.charAt(g-1)==')'||exp.charAt(g-1)=='+'||exp.charAt(g-1)=='-'||exp.charAt(g-1)=='/'||exp.charAt(g-1)=='*')
                        exp=exp+" 0";
                    else
                        exp=exp+"0";
                    output.setText(" ");
                    data.setText(exp);
                }
            }
        });
        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=" ( "+exp+" ) / 100";
                output.setText(" ");
                data.setText(exp);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp="";
                output.setText(" ");
                data.setText(" ");
            }
        });
        addorsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exp=" ( "+exp+" ) * ( 0 - 1 )";
                output.setText(" ");
                data.setText(exp);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BalancedParan blc=new BalancedParan();
                if(blc.areParanthesisBalanced(exp)){
                    Log.d("current expression" ,exp);
                    f=1;
                    float e=EvaluateString.evaluate(exp);
                    String s=Float.toString(e);
                    if(f==1) {
                        //output.setText((int) eval.evaluate(exp));
                        output.setText(s);
                        exp = s;
                    }

                }
                else {
                    output.setText("unbalanced parenthesis,click on 'clear'");
                    exp="";
                }
            }
        });
        brackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText(" ");
                if(exp=="")
                    exp=exp+" (";
                else{
                    int c=exp.length();
                    char d=exp.charAt(c-1);
                    if(d=='+'||d=='-'||d=='*'||d=='/')
                        exp=exp+" (";
                    else
                        exp=exp+" )";
                }
                data.setText(exp);
            }
        });
    }
}
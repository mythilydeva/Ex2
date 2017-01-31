package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	TextView text;
	EditText ed;
	Button zero;
	Button one;
	Button two;
	Button three,four,five,six;
	Button seven,eight,nine,equal;
	Button add,sub,mul,div,del,dot;
	float ValueOne , ValueTwo ;
	 
    boolean mAdd , mSub ,mMul ,mDiv ;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=(EditText) findViewById(R.id.editText1);
        text=(TextView) findViewById(R.id.text1);
        zero=(Button) findViewById(R.id.zero);
        one=(Button) findViewById(R.id.one);
        two=(Button) findViewById(R.id.two);
        three=(Button) findViewById(R.id.thr);
        four=(Button) findViewById(R.id.four);
        five=(Button) findViewById(R.id.five);
        six=(Button) findViewById(R.id.six);
        seven=(Button) findViewById(R.id.sev);
        eight=(Button) findViewById(R.id.eig);
        nine=(Button) findViewById(R.id.ni);
        equal=(Button) findViewById(R.id.eq);
        add=(Button) findViewById(R.id.plus);
        sub=(Button) findViewById(R.id.minus);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        del=(Button) findViewById(R.id.del);
        dot=(Button) findViewById(R.id.dot);
        
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"1");
            }
        });
        	
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"2");
            }
        });
        
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"3");
            }
        });
        
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"4");
            }
        });
        
       five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"5");
            }
        });
       
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"6");
            }
        });
        
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"7");
            }
        });
        
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"8");
            }
        });
        
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"+");
                if (ed == null){
                    ed.setText("");
                }else {
                    ValueOne = Float.parseFloat(ed.getText() + "");
                    mAdd = true;
                    ed.setText(null);
                }
            }
        });
 
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"-");
                ValueOne = Float.parseFloat(ed.getText() + "");
                mSub = true ;
                ed.setText(null);
            }
        });
 
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"*");
                ValueOne = Float.parseFloat(ed.getText() + "");
                mMul = true ;
                ed.setText(null);
            }
        });
 
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(ed.getText()+"/");
                ValueOne = Float.parseFloat(ed.getText()+"");
                mDiv = true ;
                ed.setText(null);
            }
        });
 
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueTwo = Float.parseFloat(ed.getText() + "");
 
                if (mAdd == true){
 
                    ed.setText(ValueOne + ValueTwo +"");
                    mAdd=false;
                }
 
 
                if (mSub == true){
                    ed.setText(ValueOne - ValueTwo+"");
                    mSub=false;
                }
 
                if (mMul == true){
                    ed.setText(ValueOne * ValueTwo+"");
                    mMul=false;
                }
 
                if (mDiv == true){
                    ed.setText(ValueOne / ValueTwo+"");
                    mDiv=false;
                }
            }
        });
 
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText("");
            }
        });
 
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+".");
            }
        });
    }
 
}   												
   

    
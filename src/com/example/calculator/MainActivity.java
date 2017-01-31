package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	TextView text;
	EditText ed;
	Button zero;
	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight;
	Button nine;
	Button equal;
	Button add;
	Button sub;
	Button mul;
	Button div;
	Button del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=(EditText) findViewById(R.id.edit1);
        text=(TextView) findViewById(R.id.text1);
        zero=(Button) findViewById(R.id.zero);
        one=(Button) findViewById(R.id.one);
        two=(Button) findViewById(R.id.two);
        three=(Button) findViewById(R.id.thr);
        four=(Button) findViewById(R.id.four);
        six=(Button) findViewById(R.id.five);
        seven=(Button) findViewById(R.id.six);
        eight=(Button) findViewById(R.id.sev);
        nine=(Button) findViewById(R.id.eig);
        equal=(Button) findViewById(R.id.eq);
        add=(Button) findViewById(R.id.plus);
        sub=(Button) findViewById(R.id.minus);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        del=(Button) findViewById(R.id.del);
        												
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

package com.learn.android.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public int add(int a,int b)
    {
        return a+b;
    }
    public int mult(int a,int b)
    {
        return a*b;
    }
    public int sub(int a,int b)
    {
         return a-b;
    }
    public void onButtonClick(View v)
    {
        EditText e1=(EditText)findViewById(R.id.numField1);
        EditText e2=(EditText)findViewById(R.id.numField2);
        TextView r1=(TextView)findViewById(R.id.viewResult);
        int number1=Integer.parseInt(e1.getText().toString());
        int number2=Integer.parseInt(e2.getText().toString());
        int sum=add(number1,number2);
        int mult=mult(number1,number2);
        int sub=sub(number1,number2);
        r1.setText(Integer.toString(sum));
    }
}

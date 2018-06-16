package com.github.kycko.kyckorandomizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String intentMaxNum       = "com.github.kycko.kyckorandomizer.max_num";
    public static final String intentActivityType = "com.github.kycko.kyckorandomizer.activityType";
    public static final String intentCubeSize = "com.github.kycko.kyckorandomizer.cubeSize";
    String cubeSizeNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
    // menu (toolbar right cube)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.run_cube_7:
                cubeSizeNum = "7";
                launchIntAndCubeRandomizer("cube");
                return true;
            case R.id.run_cube_6:
                cubeSizeNum = "6";
                launchIntAndCubeRandomizer("cube");
                return true;
            case R.id.run_cube_5:
                cubeSizeNum = "5";
                launchIntAndCubeRandomizer("cube");
                return true;
            case R.id.run_cube_4:
                cubeSizeNum = "4";
                launchIntAndCubeRandomizer("cube");
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }
    // my funcs
    private void launchIntAndCubeRandomizer(String myString) {
        final Intent intent = new Intent(this, IntRandomizerResultActivity.class);
        String typeStringObj = new String("cube");

        if (myString.equals(typeStringObj)) intent.putExtra(intentCubeSize, cubeSizeNum);
        else {
            intent.putExtra(intentMaxNum, myString);
            typeStringObj = new String("int");
        }

        intent.putExtra(intentActivityType, typeStringObj);
        startActivity(intent);
    }
    public void buttonGetFromInputPressed(View view) {
        final EditText reqWidget = findViewById(R.id.input_max_num);
        final String myString = reqWidget.getText().toString();

        if (!myString.isEmpty() && Integer.parseInt(myString) != 1) launchIntAndCubeRandomizer(myString);
        else Toast.makeText(
                getApplicationContext(),
                getString(R.string.int_randomizer_null_input_toast),
                Toast.LENGTH_SHORT
        ).show();
    }
    public void button2Pressed (View view) {extractButtonText(R.id.button2);}
    public void button3Pressed (View view) {extractButtonText(R.id.button3);}
    public void button10Pressed(View view) {extractButtonText(R.id.button10);}

    private void extractButtonText(int ID) {
        final Button reqWidget = findViewById(ID);
        launchIntAndCubeRandomizer(reqWidget.getText().toString());
    }
}

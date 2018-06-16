package com.github.kycko.kyckorandomizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.Random;

public class IntRandomizerResultActivity extends AppCompatActivity {
    private final Random rnd = new Random();
    private cubeVariations cubeVariations;
    private int max;
    private String activityType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int_randomizer_result);

        // Toolbar back button
        Toolbar toolbarObj = findViewById(R.id.toolbar);
        setSupportActionBar(toolbarObj);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        activityType = getIntent().getStringExtra(MainActivity.intentActivityType);
        switch (activityType) {
            case "int":
                final String myString = getIntent().getStringExtra(MainActivity.intentMaxNum);
                max = Integer.parseInt(myString);
                toolbarObj.setTitle(getString(R.string.title_diapasone, myString));
                break;
            case "cube":
                cubeVariations = new cubeVariations(getIntent().getStringExtra(MainActivity.intentCubeSize));
                max = cubeVariations.getLength();
                TextView textViewObj = findViewById(R.id.lbl_result);
                textViewObj.setTextSize(30);
        }
        getNewNum();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }
    private void getNewNum() {
        Integer cur;
        String toDisplay = "";
        final TextView txtViewObj = findViewById(R.id.lbl_result);

        switch (activityType) {
            case "int":
                do cur = rnd.nextInt(max)+1;
                while (cur == Integer.parseInt(txtViewObj.getText().toString()));
                toDisplay = cur.toString();
                break;
            case "cube":
                toDisplay = cubeVariations.getNew(rnd);
        }
        txtViewObj.setText(toDisplay);
    }
    public void buttonIntRandomizerResultRefreshPressed(View view) {
        getNewNum();
        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.abc_grow_fade_in_from_bottom);
        anim.setDuration(500);
        findViewById(R.id.lbl_result).startAnimation(anim);
    }
}

package com.example.svenu.svenuitendaal__pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    View arms, ears, eyebrows, eyes, glasses, hat, nose, mouth, mustache, shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize values
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        nose = findViewById(R.id.nose);
        mouth = findViewById(R.id.mouth);
        mustache = findViewById(R.id.mustache);
        shoes = findViewById(R.id.shoes);
    }



    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        int armsVisibility = arms.getVisibility();
        int earsVisibility = ears.getVisibility();
        int eyebrowsVisibility = eyebrows.getVisibility();
        int eyesVisibility = eyes.getVisibility();
        int glassesVisibility = glasses.getVisibility();
        int hatVisibility = hat.getVisibility();
        int noseVisibility = nose.getVisibility();
        int mouthVisibility = mouth.getVisibility();
        int mustacheVisibility = mustache.getVisibility();
        int shoesVisibility = shoes.getVisibility();

        outState.putInt("arms", armsVisibility);
        outState.putInt("ears", earsVisibility);
        outState.putInt("eyebrows", eyebrowsVisibility);
        outState.putInt("eyes", eyesVisibility);
        outState.putInt("glasses", glassesVisibility);
        outState.putInt("hat", hatVisibility);
        outState.putInt("nose", noseVisibility);
        outState.putInt("mouth", mouthVisibility);
        outState.putInt("mustache", mustacheVisibility);
        outState.putInt("shoes", shoesVisibility);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        int armsVisibilityRestored = inState.getInt("arms");
        int earsVisibilityRestored = inState.getInt("ears");
        int eyebrowsVisibilityRestored = inState.getInt("eyebrows");
        int eyesVisibilityRestored = inState.getInt("eyes");
        int glassesVisibilityRestored = inState.getInt("glasses");
        int hatVisibilityRestored = inState.getInt("hat");
        int noseVisibilityRestored = inState.getInt("nose");
        int mouthVisibilityRestored = inState.getInt("mouth");
        int mustacheVisibilityRestored = inState.getInt("mustache");
        int shoesVisibilityRestored = inState.getInt("shoes");

        arms.setVisibility(armsVisibilityRestored);
        ears.setVisibility(earsVisibilityRestored);
        eyebrows.setVisibility(eyebrowsVisibilityRestored);
        eyes.setVisibility(eyesVisibilityRestored);
        glasses.setVisibility(glassesVisibilityRestored);
        hat.setVisibility(hatVisibilityRestored);
        nose.setVisibility(noseVisibilityRestored);
        mouth.setVisibility(mouthVisibilityRestored);
        mustache.setVisibility(mustacheVisibilityRestored);
        shoes.setVisibility(shoesVisibilityRestored);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        View bodypart;

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBoxArms:
                bodypart = findViewById(R.id.arms);
                if (checked) {
                    bodypart.setVisibility(View.VISIBLE);
                }
                else {
                    bodypart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEars:
                bodypart = findViewById(R.id.ears);
                if (checked) {
                    bodypart.setVisibility(View.VISIBLE);
                }
                else {
                    bodypart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEyebrows:
                bodypart = findViewById(R.id.eyebrows);
                if (checked) {
                    bodypart.setVisibility(View.VISIBLE);
                }
                else {
                    bodypart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEyes:
                bodypart = findViewById(R.id.eyes);
                if (checked) {
                    bodypart.setVisibility(View.VISIBLE);
                }
                else {
                    bodypart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxGlasses:
                bodypart = findViewById(R.id.glasses);
                if (checked) {
                    bodypart.setVisibility(View.VISIBLE);
                }
                else {
                    bodypart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxHat:
                bodypart = findViewById(R.id.hat);
                if (checked) {
                    bodypart.setVisibility(View.VISIBLE);
                }
                else {
                    bodypart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxMouth:
                bodypart = findViewById(R.id.mouth);
                if (checked) {
                    bodypart.setVisibility(View.VISIBLE);
                }
                else {
                    bodypart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxMustache:
                bodypart = findViewById(R.id.mustache);
                if (checked) {
                    bodypart.setVisibility(View.VISIBLE);
                }
                else {
                    bodypart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxNose:
                bodypart = findViewById(R.id.nose);
                if (checked) {
                    bodypart.setVisibility(View.VISIBLE);
                }
                else {
                    bodypart.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxShoes:
                bodypart = findViewById(R.id.shoes);
                if (checked) {
                    bodypart.setVisibility(View.VISIBLE);
                }
                else {
                    bodypart.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}


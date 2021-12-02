package com.ot.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private ImageView logo, background_img;
    private TextView logo_text;
    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);
        logo_text = findViewById(R.id.logo_text);
        background_img = findViewById(R.id.background_img);
        lottieAnimationView = findViewById(R.id.lottie_rubiks);

        logo.animate().translationY(2400).setDuration(2000).setStartDelay(10000);
        logo_text.animate().translationY(2400).setDuration(2000).setStartDelay(10000);
        background_img.animate().translationY(-2600).setDuration(2000).setStartDelay(10000);
        lottieAnimationView.animate().translationY(2400).setDuration(2000).setStartDelay(10000);
    }
}
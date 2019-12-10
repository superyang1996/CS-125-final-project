package com.example.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private MyMusicUtils utils;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] content = {"3212333 222355 3212333322321",
                "1155665 4433221 5544332 5544332 1155665 4433221",
                "333 333 35123 44444333322325 333 333 35123 4444433355421",
                "1231 1231 345 345 565431 565431 151 151", "355 321 23532 355 321 23211"};

        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);
        TextView song = findViewById(R.id.text);
        song.setText(content[index]);

        //setUp buttons.
        Button one = findViewById(R.id.dow);
        Button two = findViewById(R.id.re);
        Button three = findViewById(R.id.mi);
        Button four = findViewById(R.id.fa);
        Button five = findViewById(R.id.so);
        Button six = findViewById(R.id.la);
        Button seven = findViewById(R.id.xi);

        //make sounds when press buttons.
        utils = new MyMusicUtils(getApplicationContext());
        LottieAnimationView animationView = findViewById(R.id.animation_view);
        animationView.setVisibility(View.INVISIBLE);

        one.setOnClickListener(unused -> {
            animationView.setVisibility(View.VISIBLE);
            animationView.playAnimation();
            utils.soundPlay(0);
        });
        two.setOnClickListener(unused -> {
            animationView.setVisibility(View.VISIBLE);
            animationView.playAnimation();
            utils.soundPlay(1);
        });
        three.setOnClickListener(unused -> {
            animationView.setVisibility(View.VISIBLE);
            animationView.playAnimation();
            utils.soundPlay(2);
        });
        four.setOnClickListener(unused -> {
            animationView.setVisibility(View.VISIBLE);
            animationView.playAnimation();
            utils.soundPlay(3);
        });
        five.setOnClickListener(unused -> {
            animationView.setVisibility(View.VISIBLE);
            animationView.playAnimation();
            utils.soundPlay(4);
        });
        six.setOnClickListener(unused -> {
            animationView.setVisibility(View.VISIBLE);
            animationView.playAnimation();
            utils.soundPlay(5);
        });
        seven.setOnClickListener(unused -> {
            animationView.setVisibility(View.VISIBLE);
            animationView.playAnimation();
            utils.soundPlay(6);
        });

    }
}


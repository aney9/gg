package com.example.pract2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Third_activity extends AppCompatActivity {

    private AppCompatButton nazad;
    private ImageView pika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        pika = findViewById(R.id.pika);
        nazad = findViewById(R.id.nazad);

        Animation blinkanim = AnimationUtils.loadAnimation(this, R.anim.blink_animation);

        pika.startAnimation(blinkanim);

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.nazadbtn2);
        nazad.startAnimation(anim1);


        nazad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Third_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.test_prj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but;
    TextView text, msg;

    int value = 0;

    private String msgByValue() {
        if (value < 10) return "Click as fast as you can";
        if (value < 20) return "Try click faster";
        if (value < 30) return "Your target is 1000 clicks";
        if (value < 40) return "Let's go";
        if (value < 50) return "This is a test program";
        if (value < 60) return "You needn't read this text";
        if (value < 70) return "Cause it's useless";
        if (value < 80) return "So, you are clicking so long...";
        if (value < 90) return "The next text will change not so quick";
        if (value < 100) return "First hundred!";
        if (value < 200) return "And second...";
        if (value < 300) return "Hm, are you really so bored?";
        if (value < 400) return "This isn't even a game";
        if (value < 500) return "Click, click, click, click...";
        if (value < 1000) return "And.. You need to do it twice";

        value = 999999;
        return "The end";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but = findViewById(R.id.button);
        text = findViewById(R.id.text);
        msg = findViewById(R.id.textMsg);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value++;
                text.setText(String.valueOf(value));
                msg.setText(msgByValue());
            }
        });

    }

}
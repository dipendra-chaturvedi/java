package com.andrul.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private boolean isLiked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView likeButton = findViewById(R.id.likeButton);

        likeButton.setOnClickListener(v -> {
            isLiked = !isLiked;

            if (isLiked) {
                likeButton.setText("♥  129");
            } else {
                likeButton.setText("♡  128");
            }
        });
    }
}

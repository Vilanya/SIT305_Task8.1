package com.example.youtubevideoplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    EditText edit_text_url;
    Button button_play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_text_url = (EditText) findViewById(R.id.editTextURL);
        button_play = (Button) findViewById(R.id.buttonPlay);


        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start VideoActivity here
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                intent.putExtra("URL", edit_text_url.getText().toString());
                startActivity(intent);
            }
        });

    }



}

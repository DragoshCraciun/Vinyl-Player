package com.galacticcoders.vinyl_player;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by dcx86 on 5/13/18.
 */

public class PlayActivity extends AppCompatActivity {
    private ImageView albumCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        albumCover = (ImageView) findViewById(R.id.albumCover);
    }
}
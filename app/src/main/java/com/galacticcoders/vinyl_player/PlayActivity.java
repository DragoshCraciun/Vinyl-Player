package com.galacticcoders.vinyl_player;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dcx86 on 5/13/18.
 */

public class PlayActivity extends AppCompatActivity {
    private ImageView albumCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Find the ImageView in the album_list.xml layout with the ID backButton
        albumCover = (ImageView) findViewById(R.id.albumCover);
        // Find the TextView in the album_list.xml layout with the ID songName
        TextView songName = (TextView) findViewById(R.id.songName);
        // Find the TextView in the album_list.xml layout with the ID artistName
        TextView artistName = (TextView) findViewById(R.id.artistName);

        //Importing data from the MainActivity.class
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int image = extras.getInt("cover");
            albumCover.setImageResource(image);

            String song = extras.getString("song");
            songName.setText(song);

            String artist = extras.getString("artist");
            artistName.setText(artist);
        }


    }
}
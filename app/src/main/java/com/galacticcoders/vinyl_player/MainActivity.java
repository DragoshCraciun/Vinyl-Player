package com.galacticcoders.vinyl_player;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the album.
        ImageView album = (ImageView) findViewById(R.id.album);

        // Set a click listener on that view.
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will execute when the album category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent albumIntent = new Intent(MainActivity.this, PlayActivity.class);

                // Start the new activity.
                startActivity(albumIntent);
            }
        });


    }
}

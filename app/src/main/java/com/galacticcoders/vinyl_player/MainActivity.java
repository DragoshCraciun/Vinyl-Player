package com.galacticcoders.vinyl_player;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Eric Clapton","Slowhand", "39:06", R.drawable.eric_clapton, "Cocaine 3:38", "Wonderful Tonight 3:41",
                "Lay Down Sally 3:56","Next Time You See Her 4:01", "We're All the Way 2:32", "The Core 8:45",
                "May You Never 3:01", "Mean Old Frisco 4:42", "Peaches and Diesel 4:46"));
        albums.add(new Album("Dire Straits","Brothers in Arms", "55:07", R.drawable.dire_straits,"So Far Away 5:12", "Money for Nothing 08:26",
                "Walk of Life 4:12","Your Latest Trick 6:33", "Why Worry 8:31", "Ride Across the River 6:58",
                "The Man's Too Strong 4:40", "One World 3:40", "Brothers in Arms 7:00"));
        albums.add(new Album("Eddie Vedder","Into the Wild", "33:04", R.drawable.eddie_vedder,"Setting Forth 1:37", "No Ceiling 1:34",
                "Far Behind 2:15","Rise 2:36", "Long Nights 2:31", "Hard Sun 5:22",
                "Society 3:56", "The Wolf 1:32", "Guaranteed 7:22"));
        albums.add(new Album("Eagles","Hotel California", "43:28", R.drawable.eagles,"Hotel California 6:30", "New Kid in Town 5:04",
                "Life in the Fast Lane 4:46","Wasted Time 4:56", "Wasted Time - Reprise 1:23", "Victim of Love 4:09",
                "Pretty Maids All in a Row 3:59", "Try and Love Again 5:11", "The Last Resort 7:29"));
        albums.add(new Album("Pink Floyd","The Dark Side of the Moon", "42:49", R.drawable.pink_floyd,"Speak to Me / Breathe 3:58", "On the Run 3:35",
                "Time 7:05","The Great Gig in the Sky 4:44", "Money 6:23", "Us and Them 7:50",
                "Any Colour You Like 3:26", "Brain Damage 3:47", "Eclipse 2:01"));


        final AlbumAdapter adapter = new AlbumAdapter(this, albums);

        // Find the View that shows the album.
        final ListView albumCover = (ListView) findViewById(R.id.album);

        // Set a click listener on that view.
        albumCover.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // The code in this method will execute when the album category is clicked on.
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
                // Create a new intent to open the {@link PlayActivity}
                Intent albumIntent = new Intent(MainActivity.this, PlayActivity.class);
                int Image = adapter.getItem(position).getImageResourceId();
                String Song = adapter.getItem(position).getSong1();
                String Artist = adapter.getItem(position).getArtistName();
                albumIntent.putExtra("cover", Image);
                albumIntent.putExtra("song", Song);
                albumIntent.putExtra("artist", Artist);
                // Start the new activity.
                startActivity(albumIntent);
            }
        });

        albumCover.setAdapter(adapter);



    }
}

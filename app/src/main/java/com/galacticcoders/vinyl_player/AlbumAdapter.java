package com.galacticcoders.vinyl_player;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.galacticcoders.vinyl_player.Album;
import com.galacticcoders.vinyl_player.R;

import java.util.ArrayList;

//TODO edit all the comments here

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Word} objects.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param words   A List of words objects to display in a list
     */
    public AlbumAdapter(Activity context, ArrayList<Album> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_list, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView ArtistNameTextView = (TextView) listItemView.findViewById(R.id.artistName);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        ArtistNameTextView.setText(currentAlbum.getArtistName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView AlbumNameTextView = (TextView) listItemView.findViewById(R.id.albumName);
        // Get the default translation from the current Word object and
        // set this text on the name TextView
        AlbumNameTextView.setText(currentAlbum.getAlbumName());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView DurationTextView = (TextView) listItemView.findViewById(R.id.duration);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        DurationTextView.setText(currentAlbum.getDuration());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView Song1TextView = (TextView) listItemView.findViewById(R.id.song1);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        Song1TextView.setText(currentAlbum.getSong1());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView Song2TextView = (TextView) listItemView.findViewById(R.id.song2);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        Song2TextView.setText(currentAlbum.getSong2());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView Song3TextView = (TextView) listItemView.findViewById(R.id.song3);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        Song3TextView.setText(currentAlbum.getSong3());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView Song4TextView = (TextView) listItemView.findViewById(R.id.song4);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        Song4TextView.setText(currentAlbum.getSong4());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView Song5TextView = (TextView) listItemView.findViewById(R.id.song5);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        Song5TextView.setText(currentAlbum.getSong5());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView Song6TextView = (TextView) listItemView.findViewById(R.id.song6);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        Song6TextView.setText(currentAlbum.getSong6());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView Song7TextView = (TextView) listItemView.findViewById(R.id.song7);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        Song7TextView.setText(currentAlbum.getSong7());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView Song8TextView = (TextView) listItemView.findViewById(R.id.song8);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        Song8TextView.setText(currentAlbum.getSong8());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView Song9TextView = (TextView) listItemView.findViewById(R.id.song9);
        // Get the miwok translation from the current Word object and
        // set this text on the name TextView
        Song9TextView.setText(currentAlbum.getSong9());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.albumCover);
        // Check if an image is provided for this word or not
        if (currentAlbum.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentAlbum.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

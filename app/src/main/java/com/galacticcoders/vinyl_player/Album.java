package com.galacticcoders.vinyl_player;

/**
 * {@link com.galacticcoders.vinyl_player.Album} represents an album that the user wants to listen.
 * It contains data about, artist names, album name, duration, album cover and list of songs.
 */

public class Album {

    /** Name of artist */
    private String mArtistName;

    /** Name of album */
    private String mAlbumName;

    /** Duration of the entire album */
    private String mDuration;

    /** Image resource ID for the album cover */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this album */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** List of songs */
    private String mSong1;
    private String mSong2;
    private String mSong3;
    private String mSong4;
    private String mSong5;
    private String mSong6;
    private String mSong7;
    private String mSong8;
    private String mSong9;


    /**
     * Create a new Album object.
     * @param ArtistName is the name of the artist
     * @param AlbumName is the name of album
     * @param Duration is the duration of the album
     * @param imageResourceId is the image of the album cover
     * @param Song1 is the name of the first song in the album
     * @param Song2 is the name of the second song in the album
     * @param Song3 is the name of the third song in the album
     * @param Song4 is the name of the fourth song in the album
     * @param Song5 is the name of the fifth song in the album
     * @param Song6 is the name of the sixth song in the album
     * @param Song7 is the name of the seventh song in the album
     * @param Song8 is the name of the eighth song in the album
     * @param Song9 is the name of the ninth song in the album
     */

    public Album(String ArtistName, String AlbumName, String Duration, int imageResourceId, String Song1, String Song2, String Song3,
                 String Song4, String Song5, String Song6, String Song7, String Song8, String Song9 ) {
        mArtistName = ArtistName;
        mAlbumName = AlbumName;
        mDuration = Duration;
        mImageResourceId = imageResourceId;
        mSong1 = Song1;
        mSong2 = Song2;
        mSong3 = Song3;
        mSong4 = Song4;
        mSong5 = Song5;
        mSong6 = Song6;
        mSong7 = Song7;
        mSong8 = Song8;
        mSong9 = Song9;

    }

    /**
     * Get the artist name.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the album name.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the duration of the album.
     */
    public String getDuration() {
        return mDuration;
    }

    /**
     * Return the image resource ID of the album.
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Returns whether or not there is an image for this album.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the name of the songs.
     */
    public String getSong1() {
        return mSong1;
    }
    public String getSong2() {
        return mSong2;
    }
    public String getSong3() {
        return mSong3;
    }
    public String getSong4() {
        return mSong4;
    }
    public String getSong5() {
        return mSong5;
    }
    public String getSong6() {
        return mSong6;
    }
    public String getSong7() {
        return mSong7;
    }
    public String getSong8() {
        return mSong8;
    }
    public String getSong9() {
        return mSong9;
    }

}

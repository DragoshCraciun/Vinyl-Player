package com.galacticcoders.vinyl_player;

//TODO the entire comments on this page

/**
 * {@link com.example.android.miwok.Album} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok transaltion for that word.
 */

public class Album {

    /** Default translation for the word */
    private String mArtistName;

    /** Miwok translation for the word */
    private String mAlbumName;

    /** Default translation for the word */
    private String mDuration;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Miwok translation for the word */
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
     * Create a new Word object.
     * @param defaultTranslation is the word in a language that the user is already
     *                           familiar with (such as English)
     * @param miwokTranslation is the word in the Miwok language
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
     * Get the default translation of the word.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getDuration() {
        return mDuration;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the Miwok translation of the word.
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

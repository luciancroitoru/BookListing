package com.example.android.booklisting;

/**
 * {@link Book} represents a single Book object.
 * Each object has 2 properties: title and author
 */
public class Book {

    // Book title
    private String mBookTitle;

    // Book author name
    private String mAuthorName;

    /** Publisher name */
    private String mPublisher;

    /** Website URL of the book */
    private String mUrl;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param vBookTitle is the book title
     * @param vAuthorName is the author name of the book
     *  @param vPublisher is the website URL to find more details about the earthquake
     *  @param vUrl in the link to get more info about the book
     */
    public Book(String vBookTitle, String vAuthorName, String vPublisher, String vUrl)
    {
        mBookTitle = vBookTitle;
        mAuthorName = vAuthorName;
        mPublisher = vPublisher;
        mUrl = vUrl;
    }

    /**
     * Get the title of the book
     */
    public String getBookTitle() {
        return mBookTitle;
    }

    /**
     * Get the name of the author
     */
    public String getAuthorName() {
        return mAuthorName;
    }

    /**
     * Returns the website URL to find more information about the book.
     */
    public String getPublisher() {
        return mPublisher;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}

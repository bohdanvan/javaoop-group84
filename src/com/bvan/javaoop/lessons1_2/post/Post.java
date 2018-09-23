package com.bvan.javaoop.lessons1_2.post;

/**
 * @author bvanchuhov
 */
public class Post {

    private final String author;
    private final String content;
    private long likes;

    public Post(String author, String content, long likes) {
        checkLikes(likes);
        this.author = author;
        this.content = content;
        this.likes = likes;
    }

    private void checkLikes(long likes) {
        if (likes < 0) {
            throw new IllegalArgumentException("negative likes: " + likes);
        }
    }

    public Post(String author, String content) {
        this(author, content, 0);
    }

    public void like() {
        likes++;
    }

    public void dislike() {
        if (likes == 0) {
            throw new IllegalStateException("zero likes");
        }
        likes--;
    }

    public String show() {
        return "\"" + content + "\" by " + author + ", "
                + likes + " likes";
    }

    public long getLikes() {
        return likes;
    }

    public Post withLikes(long likes) {
        return new Post(this.author, this.content, likes);
    }

//    public void setLikes(long likes) {
//        checkLikes(likes);
//        this.likes = likes;
//    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                '}';
    }
}

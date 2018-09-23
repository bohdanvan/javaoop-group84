package com.bvan.javaoop.lessons7_8.generics;

import com.bvan.javaoop.lessons1_2.post.Post;

import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class LikesPredicate implements Predicate<Post> {

    private final long minLikes;

    public LikesPredicate(long minLikes) {
        this.minLikes = minLikes;
    }

    @Override
    public boolean test(Post post) {
        return post.getLikes() > minLikes;
    }
}

package com.bvan.javaoop.lessons1_2.post;

/**
 * @author bvanchuhov
 */
public class PostRunner {

    public static void main(String[] args) {
        Post p1 = new Post(
                "@s_vakarchuk",
                "Концерт «Океан Ельзи»",
                6
        );
        Post p2 = new Post(
                "@realDonaldTrump",
                "Our relationship with Mexico"
        );

        p1.like();

        p2.like();
        p2.like();
        p2.like();
        p2.like();

        String s = p1.show();
        System.out.println(s);
        System.out.println(p2.show());
    }
}

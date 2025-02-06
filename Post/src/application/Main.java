package application;

import entities.Comment;
import entities.Post;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Comment c1 = new Comment("Hello world!");
        Comment c2 = new Comment("Hello Brazil!");


        Post post = new Post(new Date(), "Traveling to New Zealand", "oiiiiii", 12 );
        post.addComment(c1);
        post.addComment(c2);

        System.out.println(post);
    }
}
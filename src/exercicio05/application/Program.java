package exercicio05.application;

import exercicio05.entities.Comment;
import exercicio05.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);


        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        System.out.println();

        Comment nc1 = new Comment("Good night");
        Comment nc2 = new Comment("May the Force be with you");

        Post np1 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);

        np1.addComment(nc1);
        np1.addComment(nc2);

        System.out.println(np1);
    }
}

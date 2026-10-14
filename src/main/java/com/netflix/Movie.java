package com.netflix;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Movie {
    public static void main(String[] args) {
        String movie = "True romance";
        String movieGenre = "Horror";
        int movieYear = 1993;
        int movieTime = 121;
        boolean isWatched = true;
        String favoritePlatform = "Paramount";
        double hoursPerWeek = 12.5;
        int movieRating = 5;
        double hoursPerMonth = hoursPerWeek * 4;
        String interestingFact = "Quintin Tarantino wrote the original screenplay for the 1993 crime-romance film 'True Romance'. ";

        ArrayList<String> movies = new
                ArrayList<>();
        movies.add("Oldboy");
        movies.add("Titanic");
        movies.add("A Serious Man");
        movies.add("Talented Mr.Ripley");

        System.out.println(movies);


        System.out.println("+==+=++==++=+++=+++==++=+++==+==++++===++===+===+==+=++");
        System.out.println("  My    Personal    Profile (MOVIE EDITION)  ");
        System.out.println("+==+=++==++=+++=+++==++=+++==+==++++===++===+===+==+=++");

        System.out.println("My favorite movie is " + movie + ".");
        System.out.println("My favorite movie genre is " + movieGenre + ".");
        System.out.println("The movie was released in " + movieYear + ".");
        System.out.println("The run time for the movie is " + movieTime + ".");
        System.out.println("A fun fact is " + interestingFact);
        System.out.println("It is " + isWatched +", Ive seen the movie more than 5 times.");
        System.out.println("My favorite streaming platform is " + favoritePlatform + ".");
        System.out.println("I watch about " + hoursPerWeek + " hours per week of movies and shows.");
        System.out.println("That equates to " + hoursPerMonth + " hours per month!");
        System.out.println("I'd give my favorite movie " + movieRating + " stars.");
    }
}

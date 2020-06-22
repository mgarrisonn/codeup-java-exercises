package movies;
import util.Input;


public class MoviesApplication {

    static Input input = new Input();

//    static Movie[] movies = MoviesArray.findall();

    public static void main(String[] args) {
        boolean userDecide = true;
        do {
            System.out.println("What do you want to do?");
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category\n");
            int userDecides = input.getInt(0,5);
            input.getString();
            if (userDecides == 0){
                    System.out.println("Thanks for using the Movie App");
            } else if (userDecides == 1){
                for (Movie movie : MoviesArray.findAll()){
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            } else if (userDecides == 2){
                for (Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equals("animated")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            } else if (userDecides == 3){
                for (Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equals("drama")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            } else if (userDecides == 4){
                for (Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equals("horror")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            } else if (userDecides == 5){
                for (Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equals("scifi")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }
        } while (userDecide);
    }


}

class Movie {
        //Intance variables
        String title;
        String genre;
        int rating;

        //methods
        void playIt() {
                System.out.println("Playing the movie");
        }
}

public class MovieTestDrive {
        //main method
        public static void main(String[] args) {
                Movie one = new Movie(); //Creating object named one
                one.title = "Gone with the Stock"; //Setter (setting title)
                one.genre = "Tragic"; //Setter (setting tragic)
                one.rating = -2; //Setter (setting rating)

                Movie two = new Movie();
                two.title = "Dabang";
                two.genre = "Story";
                two.rating = 2;
                // Accessing the methods.
                two.playIt();
        }
}


                
/* Note:- 
/* Run javac MovieTestDrive.java >> You will get two outputs class. 
/* 1. Movie
/* 2. MovieTestDrive
Run java MovieTestDrive because java Movie will raise an error because of absence of Main method.

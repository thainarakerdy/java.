import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Film myFilm = new Film();
        myFilm.name = "Lorax";
        myFilm.yearOfRelease = 2010;
        myFilm.durationInMinutes = 120;

        myFilm.displayTechnicalSpecifications();
        myFilm.evaluate( 8);
        myFilm.evaluate( 10);
        myFilm.evaluate( 5);

        System.out.println(myFilm.assessment);
        System.out.println(myFilm.totalAssessment);
        System.out.println(myFilm.media());
    }
}

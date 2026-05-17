public class Film {


    String name;
    int yearOfRelease;
    boolean includedInThePlan;
    double assessment;
    int totalAssessment;
    int durationInMinutes;


    void displayTechnicalSpecifications(){
        System.out.println("Name of film: " + name);
        System.out.println("Year of release: " + yearOfRelease);
    }

    void evaluate(double note){
        assessment += note;
        totalAssessment ++;
    }

    double media(){
        return assessment / totalAssessment;
    }
}

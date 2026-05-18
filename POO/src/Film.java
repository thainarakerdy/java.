public class Film {


    String name;
    int yearOfRelease;
    boolean includedInThePlan;
    private double assessment;
    private int totalAssessment;
    int durationInMinutes;


    int getTotalAssessment(){
        return totalAssessment; 
    }

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

package br.com.alura.filmes;

public class Film {


    private String name;
    private int yearOfRelease;
    private boolean includedInThePlan;
    private double assessment;
    private int totalAssessment;
    private int durationInMinutes;

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalAssessment(){
        return totalAssessment; 
    }

    public void displayTechnicalSpecifications(){
        System.out.println("Name of film: " + name);
        System.out.println("Year of release: " + yearOfRelease);
    }

    public void evaluate(double note){
        assessment += note;
        totalAssessment ++;
    }

    double media(){
        return assessment / totalAssessment;
    }
}

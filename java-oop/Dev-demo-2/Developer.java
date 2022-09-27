import java.util.*;
public class Developer {
    //attributes
    private String name;
    private int yearsOfExperience;
    private double hoursOfSleep;
    private ArrayList<String> languages;
    private ArrayList<Project> projects;

    //constructor
    public Developer(){
        this.name="John Doe";
        this.languages=new ArrayList<String>();
        this.projects=new ArrayList<Project>();
    }

    public Developer(String name, int yearsOfExperience, double hoursOfSleep){
        this.name=name;
        this.yearsOfExperience=yearsOfExperience;
        this.hoursOfSleep=hoursOfSleep;
        this.languages=new ArrayList<String>();
        this.projects=new ArrayList<Project>();
    }


    //methods
    public void displayStatus(){
        System.out.println("name: "+this.name);
        System.out.println("Years of Experience: "+this.yearsOfExperience);
        System.out.println("Hours of Sleep: "+this.hoursOfSleep);
        System.out.println("Languages: "+this.languages);
        System.out.println("Projects: ");
        for(Project eachProject: this.projects){
            eachProject.displayInfo();
        }
    }

    public void addProject(Project project){
        this.projects.add(project);
    }

    //getter
    public String getName(){
        return this.name;
    }
    public int getYearsOfExperience(){
        return this.yearsOfExperience;
    }
    public double getHoursOfSleep(){
        return this.hoursOfSleep;
    }
    public Project getProjects(){
        return this.projects;
    }
    

    //setter
    public Developer setName(String name){
        this.name=name;
        return this;
    }
    public Developer setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience=yearsOfExperience;
        return this;
    }
    public Developer setHoursOfSleep(double hoursOfSleep){
        this.hoursOfSleep=hoursOfSleep;
        return this;
    }
    public Project setProjects(){
        this.projects=projects;
        return this;
    }
}

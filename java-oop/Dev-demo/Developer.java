import java.util.*;
public class Developer {
    //attributes
    public String name;
    public int yearsOfExperience;
    public double hoursOfSleep;
    public ArrayList<String> languages;
    public ArrayList<Project> projects = new ArrayList<Project>();

    //methods
    public Developer(){

    }
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
}

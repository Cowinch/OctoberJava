import java.util.*;
public class DevTest {
    public static void main(String[] args) {
        Developer dev1 = new Developer();
        Developer dev2=new Developer("Bobby", 2, 12.5);
        dev1.displayStatus();
        System.out.println("\n**************\n");
        dev2.displayStatus();

        
        Project project1=new Project();
        project1.title="Lookify";
        project1.language="Java";

        Project project2=new Project();
        project2.title="Netflix clone";
        project2.language="MERN";

        dev1.addProject(project1);
        dev1.addProject(project2);
        dev1.displayStatus();
    }
    
}

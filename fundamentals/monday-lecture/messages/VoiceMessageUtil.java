import java.util.Date;
public class VoiceMessageUtil {
    public String greeting(String name){
        return "Hello, " + name;
    }
    public String greeting(int age){
        return "age: " + age;
    }
    public void getTodaysDate(){
        Date today=new Date();
        System.out.println("Hello, the current date is "+ today);
    }
}

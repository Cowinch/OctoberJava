import java.util.Date;
import java.util.ArrayList;
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

    public int countTotalMessages(int[] messageCount){
        int output=0;
        for(int i=0; i< messageCount.length;i++){
            output+=messageCount[i];
        }
        return output;
    }

    public void printAllMessages(String[] messages){
        // for(int i=0;i<messages.length;i++){
        //     System.out.println(messages[i]);
        // }
        for(String message : messages){
            System.out.println(message);
        }
    }

    public void printAllMessages(ArrayList<String> messages){
        for(int i=0;i<messages.size();i++){
            System.out.println(messages.get(i));
        }
    }
}

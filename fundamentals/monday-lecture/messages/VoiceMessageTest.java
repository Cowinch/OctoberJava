import java.util.ArrayList;

public class VoiceMessageTest {
    public static void main(String[] args) {

        VoiceMessageUtil messageUtil=new VoiceMessageUtil();

        System.out.print(messageUtil.greeting("Bobby"));

        System.out.println(messageUtil.greeting(23));

        int[] messagesPerDay= new int[5];
        messagesPerDay[0]=8;
        messagesPerDay[1]=6;
        messagesPerDay[2]=10;
        System.out.println(messagesPerDay);

        String[] messages={"asdf"," f sd","dfg sdfgd dv"};
        messageUtil.printAllMessages(messages);

        ArrayList<String> todoList = new ArrayList<String>();
        todoList.add("Finish Alfred Bot");
        todoList.add("Finish Cafe Business Logic");
        todoList.add("Read ahead for OOP");

        messageUtil.printAllMessages(todoList);
    }

}

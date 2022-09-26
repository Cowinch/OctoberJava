public class VoiceMessageTest {
    public static void main(String[] args) {

        VoiceMessageUtil messageUtil=new VoiceMessageUtil();

        System.out.print(messageUtil.greeting("Bobby"));

        System.out.println(messageUtil.greeting(23));
    }
}

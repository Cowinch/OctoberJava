import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        //YOUR CODE HERE
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date today = new Date();
        return "Todays date is "+today;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis")>=0){
            return conversation+"\nRight away, sir. She certainly isn't sophisticated enough for that.\n";
        } else if(conversation.indexOf("Alfred")>=0){
            return conversation+"\nAt your service. As you wish, naturally.\n";
        } else {
            return conversation+"\nRight. And with that I shall retire.\n";
        }
        // switch(conversation){
        //     case "Alexis": return "Right away, sir. She certainly isn't sophisticated enough for that.";
        //     case "Alfred": return "At your service. As you wish, naturally.";
        //     default: return "Right. And with that I shall retire.";
        // }
    }


    //this code was just me testing what indexOf returns. Ignore.
    public int respondBeforeAlexisInt(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis")>0){
            return conversation.indexOf("Alexis");
        } else {
            return conversation.indexOf("Alexis");
        }
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}

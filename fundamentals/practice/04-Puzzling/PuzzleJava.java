import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava {
    public ArrayList getTenRolls(){
        ArrayList<Integer> rand10=new ArrayList<Integer>();
        Random rand=new Random();
        for (int i=1;i<=10;i++){
            rand10.add(rand.nextInt(20)+1);
        }
        return rand10;
    }

    // public String getRandomLetter(){
    //     //this is a string of the alpahbet
    //     String theAlphabet = "abcdefghijklmnopqrstuvwxyz";

    //     //this makes an array that well fill using the string above, via a for loop
    //     String[] alphabet=new String[26];

    //     for (int i=0;i<26;i++){
    //         alphabet[i]=String.valueOf(theAlphabet.charAt(i));
    //     }
    //     //declare a random object, and then use a random number from 0-25 to get a letter from the array.
    //     Random randNum=new Random();
    //     return alphabet[randNum.nextInt(26)];
    // }

    public String getRandomLetter() {
        //declare a random object
        Random randNum = new Random();

        //declare a string that contains the alphabet
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";

        //declare a char, and use charAt(built in String function) and use the random num generator to get a random index
        char randomChar = alphabetString.charAt(randNum.nextInt(26));

        return String.valueOf(randomChar);
    }

    public String generatePassword(){
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        Random randNum=new Random();

        String password = new String();

        for(int i=0;i<8;i++){
            password+=alphabetString.charAt(randNum.nextInt(26));
        }
        return password;
    }

    public ArrayList generatePasswordSet(int num){
        ArrayList<String> passwordArray= new ArrayList<String>();
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        Random randNum=new Random();

        for(int i = 0;i<num;i++){
            String password = new String();
            for(int x=0;x<8;x++){
                password+=alphabetString.charAt(randNum.nextInt(26));
            }
            passwordArray.add(password);
        }
        return passwordArray;
    }


}

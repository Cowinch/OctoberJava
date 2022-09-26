

public class GenerateRandom {
    public static void main(String args[]) {
        int min = 0;
        int max = 1;
        System.out.println("Random value in int from " + min + " to " + max + ":");
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);
    }
}
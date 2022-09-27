import java.util.*;
public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> trackList= new HashMap<String, String>();
        trackList.put("Country Roads", "Take me home");
        trackList.put("To the place", "I beloooong");
        trackList.put("WEST VIRGINIIIAAAA", "MOUNTAIN MOMAA");
        trackList.put("take me hooome", "country roads");
        Set<String> keys=trackList.keySet();
        for(String key : keys){
            System.out.println("1 "+key);
            System.out.println("2 "+trackList.get(key));
        }
        
    }
}

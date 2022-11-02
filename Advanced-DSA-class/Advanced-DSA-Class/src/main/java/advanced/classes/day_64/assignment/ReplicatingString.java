package advanced.classes.day_64.assignment;

import java.util.HashMap;
import java.util.Map;

public class ReplicatingString {
    public static void main(String[] args) {
        System.out.println(findReplicatingString(2, "bbaabb"));
    }

    private static int findReplicatingString(int a, String input){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            }else {
                map.put(input.charAt(i), 1);
            }
        }

        for (Character value : map.keySet()){
            if (map.get(value) % a != 0)
                return -1;
        }
        return 1;
    }
}

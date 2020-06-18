package collectionsLecture;
import java.util.HashMap;

public class HashMapLecture {
    public static void main(String[] args) {


        HashMap<String, Integer> userIds = new HashMap<>();
        HashMap<String, String> passwords = new HashMap<>();
        HashMap<Integer, String> horses = new HashMap<>();


        userIds.put("skurihara", 1);
        userIds.put("jreich5", 2);
        userIds.put("rorsinger", 3);
        userIds.putIfAbsent("jreich5", 4);

        // replaces id number from 1 to 7
        userIds.replace("skurihara", 7);
        // removes rorsinger
        userIds.remove("rorsinger");

        System.out.println(userIds.isEmpty());
        System.out.println(userIds.get("jreich5"));
        System.out.println(userIds.containsKey("dstephens"));
        System.out.println(userIds.containsValue(2));
        System.out.println(userIds.getOrDefault("dstephens", 4));
        System.out.println(userIds);

        userIds.clear();
        // returns an empty hash map
        System.out.println(userIds);



    }
}

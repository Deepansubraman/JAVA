import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> mp=new HashMap<>();
        mp.put("Virat",85);
        mp.put("Dhoni",72);
        mp.put("Rohit",120);
        mp.put("Dhoni",125);
        System.out.println("Map value: "+mp);
        Map<String,Integer>mp1=new HashMap<>();
        mp1.put("Rahul",91);
        mp1.put("dhawan",143);
        mp1.putAll(mp);
        System.out.println("After Add All value: "+mp1);
        mp1.putIfAbsent("Dhoni", 56);
        mp1.putIfAbsent("Bumrah", 20);
        System.out.println("After putIfAll(): "+mp1);
        System.out.println("Score of Virat: "+mp1.get("Virat"));
        System.out.println("Score of uNKNOWN player: "+mp1.get("Bravo"));
        System.out.println("Score of default: "+mp1.getOrDefault("virat", 77));
        System.out.println("Does dhoni exist? "+mp1.containsKey("Dhoni"));
        System.out.println("Does dhoni exist? "+mp1.containsKey("Dhoni"));
        System.out.println("gayle dhoni exist? "+mp1.containsKey("gayle"));
        System.out.println("Does Any one in the inings? "+mp1.containsValue(72));
        mp1.replace("Dhoni", 72);
        System.out.println("After Replace Doni Run: "+mp1);
         boolean replaced=mp1.replace("Rahul",91,100);
        System.out.println("After replace(key,oldvalue,newvalue): "+mp1);
        System.out.println("Was replace Successful? "+replaced);
        mp1.remove("Bumrah");
        System.out.println("After remove(key): " + mp1);
        boolean removed = mp1.remove("Hardik", 44);
        System.out.println("After remove(key, value): " +mp1);
        System.out.println("Was remove successful? " + removed);
        Set<String> players = mp1.keySet();
        System.out.println("Players: " + players);
        Collection<Integer> scores = mp1.values();
        System.out.println("Scores: " + scores);
        Set<Map.Entry<String,Integer>> entries =mp1.entrySet();
        System.out.println("======ScoreCard :======");
        for(Map.Entry<String,Integer> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue() );
        }
}
    }


package Work.Homework_9;

import java.util.*;

public class Compare {

    public static final int SIZE = 1000000;

    public static void main(String[] args) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        TreeMap<Integer, Integer> three = new TreeMap<>();
        
        HashMap_VS_ThreeMap(hash, three);

    }

    private static void HashMap_VS_ThreeMap(HashMap<Integer, Integer> hash, TreeMap<Integer, Integer> three) {
        long startAddHash = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i <= SIZE; i++) {
            hash.put(i, count);
            count++;
        }
        long resultAddHash = System.currentTimeMillis() - startAddHash;
        System.out.println("Time of Add HashMap: " + resultAddHash);

        long startAddTree = System.currentTimeMillis();
        count = 0;
        for (int i = 0; i <= SIZE; i++) {
            three.put(i, count);
            count++;
        }
        long resultAddThree = System.currentTimeMillis() - startAddTree;
        System.out.println("Time of Add ThreeMap: " + resultAddThree);

        long startFiendKeyHash = System.currentTimeMillis();
        hash.containsKey(900000);
        long resultFiendKeyHash = System.currentTimeMillis() - startFiendKeyHash;
        System.out.println("Time of fiend key HashMap: " + resultFiendKeyHash);

        long startFiendKeyThree = System.currentTimeMillis();
        three.containsKey(900000);
        long resultFiendKeyThree = System.currentTimeMillis() - startFiendKeyThree;
        System.out.println("Time of fiend key ThreeMap: " + resultFiendKeyThree);

        long startRemoveKeyHash = System.currentTimeMillis();
        hash.remove(900000);
        long resultRemoveKeyHash = System.currentTimeMillis() - startRemoveKeyHash;
        System.out.println("Time of remove key HashMap: " + resultRemoveKeyHash);

        long startRemoveKeyThree = System.currentTimeMillis();
        three.remove(900000);
        long resultRemoveKeyThree = System.currentTimeMillis() - startRemoveKeyThree;
        System.out.println("Time of remove key ThreeMap: " + resultRemoveKeyThree);
    }
}

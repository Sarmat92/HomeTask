package Work.Homework_9;

import java.util.*;

public class Task_9_4 {

    public static final int SIZE = 1000000;

    static int random = (int) Math.random() * 5000;

    public static void main(String[] args) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeMap<Integer, Integer> threeMap = new TreeMap<>();

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();


        HashMap_VS_ThreeMap(hashMap, threeMap);

        HashSet_VS_TreeSet(hashSet, treeSet);

    }

    private static void HashSet_VS_TreeSet(HashSet<Integer> hashSet, TreeSet<Integer> treeSet) {

        System.out.println("       HashSet VS TreeSet       ");

        long startAddHashSet = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            hashSet.add(i);
        }
        long stopAddHashSet = System.currentTimeMillis() - startAddHashSet;
        System.out.println("Time of add HashSet: " + stopAddHashSet);


        long startAddTreeSet = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            treeSet.add(i);
        }
        long stopAddTreeSet = System.currentTimeMillis() - startAddTreeSet;
        System.out.println("Time of add TreeSet: " + stopAddTreeSet);

        long startFiendValueHashSet = System.currentTimeMillis();
        for (int i = 0; i < 90000; i++) {
            hashSet.contains(random);
        }
        long stopFiendValueHashSet = System.currentTimeMillis() - startFiendValueHashSet;
        System.out.println("Time of fiend value HashSet: " + stopFiendValueHashSet);

        long startFiendValueTreeSet = System.currentTimeMillis();
        for (int i = 0; i <90000 ; i++) {
            treeSet.contains(random);
        }
        long stopFiendValueTreeSet = System.currentTimeMillis() - startFiendValueTreeSet;
        System.out.println("Time of fiend value TreeSet: "+stopFiendValueTreeSet);


        long startRemoveValueHashSet = System.currentTimeMillis();
        for (int i = 0; i < 90000; i++) {
            hashSet.remove(random);
        }
        long stopRemoveValueHashSet = System.currentTimeMillis() - startRemoveValueHashSet;
        System.out.println("Time of remove HashSet: " + stopRemoveValueHashSet);

        long startRemoveValueTreeSet = System.currentTimeMillis();
        for (int i = 0; i < 90000; i++) {
            treeSet.remove(random);
        }
        long stopRemoveValueTreeSet = System.currentTimeMillis()-startRemoveValueTreeSet;
        System.out.println("Time of remove TreeSet: " + stopRemoveValueTreeSet);

    }

    private static void HashMap_VS_ThreeMap(HashMap<Integer, Integer> hashMap, TreeMap<Integer, Integer> threeMap) {
        System.out.println("      HashMap VS ThreeMap       ");
        long startAddHash = System.currentTimeMillis();
        for (int i = 0; i <= SIZE; i++) {
            hashMap.put(i, i);
        }
        long resultAddHash = System.currentTimeMillis() - startAddHash;
        System.out.println("Time of Add HashMap: " + resultAddHash);

        long startAddTree = System.currentTimeMillis();
        for (int i = 0; i <= SIZE; i++) {
            threeMap.put(i, i);
        }
        long resultAddThree = System.currentTimeMillis() - startAddTree;
        System.out.println("Time of Add ThreeMap: " + resultAddThree);

        long startFiendKeyHash = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hashMap.containsKey(random);
        }
        long resultFiendKeyHash = System.currentTimeMillis() - startFiendKeyHash;
        System.out.println("Time of fiend key HashMap: " + resultFiendKeyHash);

        long startFiendKeyThree = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            threeMap.containsKey(random);
        }
        long resultFiendKeyThree = System.currentTimeMillis() - startFiendKeyThree;
        System.out.println("Time of fiend key ThreeMap: " + resultFiendKeyThree);

        long startRemoveKeyHash = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hashMap.remove(random);
        }
        long resultRemoveKeyHash = System.currentTimeMillis() - startRemoveKeyHash;
        System.out.println("Time of remove key HashMap: " + resultRemoveKeyHash);

        long startRemoveKeyThree = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            threeMap.remove(random);
        }
        long resultRemoveKeyThree = System.currentTimeMillis() - startRemoveKeyThree;
        System.out.println("Time of remove key ThreeMap: " + resultRemoveKeyThree);
        System.out.println();
    }
}

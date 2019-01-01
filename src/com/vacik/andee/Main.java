package com.vacik.andee;


import java.util.*;

import static com.vacik.andee.Data.*;
import static com.vacik.andee.Utils.*;

public class Main {

    public static void main(String[] args) {
        Hobby hobbies[] = new Hobby[100];
        hobbies = gerenateObjects(10000);
        List<Hobby> arrayList = new ArrayList<>();
//        for (Hobby a : hobbies) {
//            arrayList.add(a);
//        }
        long t1 = System.currentTimeMillis();
        addElementsToList(arrayList, hobbies);
        long t2 = System.currentTimeMillis();
        timeAdd = t2 - t1;
        t1 = System.currentTimeMillis();
        getElemFromList(arrayList, hobbies);
        t2 = System.currentTimeMillis();
        timeGet = t2 - t1;
        t1 = System.currentTimeMillis();
        removeElementsToList(arrayList);
        t2 = System.currentTimeMillis();
        timeRemove = t2 - t1;


        System.out.println("----------------------------------------------------\n" +
                "           add            remove         getElement\n" +
                "----------------------------------------------------");
        System.out.println("ArrayList\t" + timeAdd +"              " + timeRemove + "             " + timeGet);

        List<Hobby> linkedList = new LinkedList<>();
        t1 = System.currentTimeMillis();
        addElementsToList(linkedList, hobbies);
        t2 = System.currentTimeMillis();
        timeAdd = t2 - t1;
        t1 = System.currentTimeMillis();
        getElemFromList(linkedList, hobbies);
        t2 = System.currentTimeMillis();
        timeGet = t2 - t1;
        t1 = System.currentTimeMillis();
        removeElementsToList(linkedList);
        t2 = System.currentTimeMillis();
        timeRemove = t2 - t1;
        System.out.println("LinkedList\t" + timeAdd +"              " + timeRemove + "              " + timeGet);

        Set<Hobby> hashSet = new HashSet<>();
        t1 = System.currentTimeMillis();
        addElementsToList(hashSet, hobbies);
        t2 = System.currentTimeMillis();
        timeAdd = t2 - t1;
        t1 = System.currentTimeMillis();
        getElemFromList(hashSet, hobbies);
        t2 = System.currentTimeMillis();
        timeGet = t2 - t1;
        t1 = System.currentTimeMillis();
        removeElementsToList(hashSet);
        t2 = System.currentTimeMillis();
        timeRemove = t2 - t1;
        System.out.println("HashSet \t" + timeAdd +"              " + timeRemove + "              " + timeGet);


        Set<Hobby> treeSet = new TreeSet<Hobby>(
                new Comparator<Hobby>(){
            @Override
            public int compare(Hobby h1, Hobby h2){
                if(h1.getHours() > h2.getHours() ){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        }
        );
        t1 = System.currentTimeMillis();
        addElementsToList(treeSet, hobbies);
        t2 = System.currentTimeMillis();
        timeAdd = t2 - t1;
        t1 = System.currentTimeMillis();
        getElemFromList(treeSet, hobbies);
        t2 = System.currentTimeMillis();
        timeGet = t2 - t1;
        t1 = System.currentTimeMillis();
        removeElementsToList(treeSet);
        t2 = System.currentTimeMillis();
        timeRemove = t2 - t1;
        System.out.println("TreeSet \t" + timeAdd +"              " + timeRemove + "              " + timeGet);


        Map<Date, Hobby> hashMap = new HashMap<>();
        t1 = System.currentTimeMillis();
        addElementsToMap(hashMap, hobbies);
        t2 = System.currentTimeMillis();
        timeAdd = t2 - t1;
        t1 = System.currentTimeMillis();
        getElembyDate(hashMap);
        t2 = System.currentTimeMillis();
        timeGet = t2 - t1;
        t1 = System.currentTimeMillis();
        removeFromMap(hashMap);
        t2 = System.currentTimeMillis();
        timeRemove = t2 - t1;
        System.out.println("hashMap \t" + timeAdd +"              " + timeRemove + "              " + timeGet);


        Map<Date, Hobby> TreeMap = new TreeMap<>();
        t1 = System.currentTimeMillis();
        addElementsToMap(TreeMap , hobbies);
        t2 = System.currentTimeMillis();
        timeAdd = t2 - t1;
        t1 = System.currentTimeMillis();
        getElembyDate(TreeMap );
        t2 = System.currentTimeMillis();
        timeGet = t2 - t1;
        t1 = System.currentTimeMillis();
        removeFromMap(TreeMap );
        t2 = System.currentTimeMillis();
        timeRemove = t2 - t1;
        System.out.println("TreeMap  \t" + timeAdd +"              " + timeRemove + "              " + timeGet);
    }
}

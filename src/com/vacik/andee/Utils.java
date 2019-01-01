package com.vacik.andee;

import java.util.*;

public class Utils {

    static long timeAdd;
    static long timeGet;
    static long timeRemove;



    public static void addElementsToList(Collection<Hobby> col, Hobby[] h){
        for (Hobby obj : h) {
            col.add(obj);
        }
    }

    public static void getElemFromList(Collection<Hobby> col, Hobby[] h){
        if(col instanceof List){
            List<Hobby> col1 = (List)col;
            for(int i = 0; i < 10000; i++) {
                col1.get((int) Math.random() % 10000);
            }
        }
        if(col instanceof Set){
            Set<Hobby> col1 = (Set)col;
            for(int i = 0; i < 10000; i++) {
                Hobby hob = h[(int)Math.random()%10000];
                for (Hobby a : col1) {
                    if(a.equals(hob)){
                        continue;
                    }
                }
            }
        }
    }

    public static void removeElementsToList(Collection<Hobby> col){
        col.removeAll(col);
    }

    public static void addElementsToMap(Map<Date, Hobby> map, Hobby[] h){
        for( Hobby a : h) {
            int i = 0;
            map.put(new Date(new Date().getTime() + i), a);
        }
    }

    public static void getElembyDate(Map<Date, Hobby> map){
        Set<Date> s = map.keySet();
        for(Date d : s){
            map.get(d);
        }
    }

    public static void removeFromMap(Map<Date, Hobby> map){

        for (Iterator<Map.Entry<Date, Hobby>> map1 = map.entrySet().iterator();
             map1.hasNext();) {
            map1.next();
            map1.remove();

        }
    }

    public static void printCollection(Collection<Hobby> collection){
        for(Hobby h: collection)
            System.out.println(h);
    }
    public static void printMap(Map<Integer, Hobby> map) {
        for (Map.Entry<Integer, Hobby> entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}

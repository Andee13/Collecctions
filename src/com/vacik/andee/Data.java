package com.vacik.andee;

import java.util.Collection;
import java.util.Map;


public class Data {


    public static Hobby[] gerenateObjects(int size){
        Hobby[] hobbies = new Hobby[size];
        for(int i = 0; i < size; i++){
            hobbies[i] = new Hobby(i, "My hobby " + i);
        }
        return hobbies;
    }

    static void printTable(String colName){
        System.out.println(colName + "    " );
    }
}

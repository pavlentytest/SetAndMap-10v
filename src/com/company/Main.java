package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("VVVV");
        set.add("asdfadf");
        set.add("adf");
        set.add("pppqqq");
        set.add("1");
        set.add("1");

      /*  Iterator<String> i = set.iterator();
        while(i.hasNext()) {
            String txt = i.next();
            System.out.println(txt);
        }*/
        for(String text: set) {
          //  System.out.println(text);
        }

        Map<String,String> pets = new HashMap<>();
        pets.put("first","Cat");
        pets.put("third","Dog");
        pets.put("second","Bird");

        Iterator<Map.Entry<String,String>> i2=pets.entrySet().iterator();
        while(i2.hasNext()) {
            Map.Entry<String,String> pair = i2.next();
            System.out.println("key:"+pair.getKey()+", val:"+pair.getValue());
        }




    }
}

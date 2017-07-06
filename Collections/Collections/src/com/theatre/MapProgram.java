package com.theatre;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by macbookpro on 7/6/2017 AD.
 */
public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> langauges = new HashMap<>();

        if(langauges.containsKey("Java")){
            System.out.println("Java already exists");
        } else{
            langauges.put("Java", "A complied high level, object-oriented, platform independant langauge");
            System.out.println("Java added successfully");
        }

        langauges.put("Python", "An interpreted, object-oriented, high-level programming langauge with dynamic semantics");
        langauges.put("Algol", "A family of algorithmic langauges");
        System.out.println(langauges.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(langauges.put("Lisp", "Therein lies madness"));


        if(langauges.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else{
            langauges.put("Java", "This course is about Java");
        }

        //System.out.println(langauges.get("Java"));
        System.out.println(langauges.put("Java", "This course is about Java"));
        System.out.println(langauges.get("Java"));


        System.out.println("================================================================");

//        langauges.remove("Lisp");

        if(langauges.remove("Algol", "A family of algorithmic langauges")){
            System.out.println("Algol removed");
        } else{
            System.out.println("Algol not remove, key/value pair not found");
        }

        System.out.println(langauges.replace("Lisp", "Therein lies madness", "A funcitonal programming langauge with imperative features"));
        System.out.println(langauges.replace("Scala", "This will not be added"));

        for(String key: langauges.keySet()){
            System.out.println(key + ": " + langauges.get(key));
        }
    }
}
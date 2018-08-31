package com.example.hokes_library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class LaughFactory {

    private List<String> list;

    public LaughFactory(){
        this.list = new ArrayList<>();
        this.list.add("What is see-through and smells of carrots? - A rabbit fart.");
        this.list.add("Don't be sad when a bird craps on your head. Be happy that dog's can't fly.");
        this.list.add("I was born in California. Which part? All of me.");
        this.list.add("Teacher: Do you have trouble making decisions? Student: Well...yes and no.");

    }


    public String tellMeAJoke(){
        Random random = new Random();

        return list.get(random.nextInt(list.size() -1 ));
    }
}

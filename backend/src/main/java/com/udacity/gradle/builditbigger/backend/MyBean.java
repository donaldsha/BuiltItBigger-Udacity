package com.udacity.gradle.builditbigger.backend;

import com.example.hokes_library.LaughFactory;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private LaughFactory joke;

    public MyBean() {
        joke = new LaughFactory();
    }

    public String getJoke() {
        return joke.tellMeAJoke();
    }
}
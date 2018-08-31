package com.udacity.gradle.builditbigger;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.Matchers.not;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void retrieveJokeTaskTest(){
        onView(withId(R.id.button_show_joke))
                .check(matches(withText(R.string.button_text)));

        //testing that RetrieveJokeTask is not null
        String result = null;
        RetrieveJokeTask retrieveJokeTask = new RetrieveJokeTask(null);
        retrieveJokeTask.execute();

        try {
            result = retrieveJokeTask.get();
            Log.d("testing", "Retrieved a non-empty string successfully: " + result);
        }catch (Exception e){
            e.printStackTrace();
        }
        if (result != null || !result.isEmpty()){

            assertNotNull(result);
        }
    }
}

package com.example.jokes_viewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import butterknife.ButterKnife;

public class JokeViewerActivity extends AppCompatActivity {
    public static final String EXTRA_JOKE = "EXTRA_JOKE";
    private TextView tvJoke;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_viewer);
        tvJoke = findViewById(R.id.jokeValue);

        displayJoke();
    }

    private void displayJoke(){
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(EXTRA_JOKE)){
            String joke = intent.getStringExtra(EXTRA_JOKE);
            tvJoke.setText(joke);
        }
    }
}

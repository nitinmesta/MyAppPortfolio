package com.example.techjini.mpappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findViewById(R.id.btn_spotify_streamer).setOnClickListener(this);
        findViewById(R.id.btn_scores_app).setOnClickListener(this);
        findViewById(R.id.btn_spotify_streamer).setOnClickListener(this);
        findViewById(R.id.btn_library_app).setOnClickListener(this);
        findViewById(R.id.btn_build_it_bigger_app).setOnClickListener(this);
        findViewById(R.id.btn_xyz_reader).setOnClickListener(this);
        findViewById(R.id.btn_capstone_my_own_app).setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_spotify_streamer:
                showToast(getString(R.string.spotify_streamer));
                break;
            case R.id.btn_scores_app:
                showToast(getString(R.string.scores_app));
                break;
            case R.id.btn_library_app:
                showToast(getString(R.string.library_app));
                break;
            case R.id.btn_build_it_bigger_app:
                showToast(getString(R.string.build_it_bigger));
                break;
            case R.id.btn_xyz_reader:
                showToast(getString(R.string.xyz_reader));
                break;
            case R.id.btn_capstone_my_own_app:
                showToast(getString(R.string.capstone_my_own_app));
                break;
        }

    }

    private void showToast(String message)
    {
        Toast.makeText(this,String.format("This button will launch %s",message),Toast.LENGTH_LONG).show();
    }
}

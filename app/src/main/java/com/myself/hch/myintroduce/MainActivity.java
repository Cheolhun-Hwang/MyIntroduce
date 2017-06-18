package com.myself.hch.myintroduce;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private android.app.FragmentManager manager = getFragmentManager();
    private Fragment fragments;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragments = new HomeBlankFragment();
                    manager.beginTransaction().replace(R.id.content_main, fragments).commit();
                    return true;
                case R.id.navigation_dashboard:
                    fragments = new introFragment();
                    manager.beginTransaction().replace(R.id.content_main, fragments).commit();
                    return true;
                case R.id.navigation_notifications:
                    fragments = new contactmeFragment();
                    manager.beginTransaction().replace(R.id.content_main, fragments).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        manager.beginTransaction().replace(R.id.content_main, new HomeBlankFragment()).commit();
    }
}

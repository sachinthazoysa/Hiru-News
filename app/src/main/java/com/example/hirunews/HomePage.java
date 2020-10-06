package com.example.hirunews;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;

import com.example.hirunews.ui.categories.BreakingNewsFragment;
import com.example.hirunews.ui.categories.ForeignFragment;
import com.example.hirunews.ui.categories.HotNewsFragment;
import com.example.hirunews.ui.categories.LocalFragment;
import com.example.hirunews.ui.categories.MyNewsFragment;
import com.example.hirunews.ui.categories.SportsFragment;
import com.example.hirunews.ui.categories.VideoNewsFragment;
import com.example.hirunews.ui.submitnews.SubmitNewsFragment;
import com.example.hirunews.ui.home.HomeFragment;
import com.example.hirunews.ui.savednews.SavedNewsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class HomePage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;
    BottomNavigationView bottomNavigationView;
    NavController navController;
    DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListner);


        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_local)
                .setDrawerLayout(drawer)
                .build();

//        R.id.nav_home, R.id.nav_submit, R.id.nav_save)

//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);

//

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment  = null;

        switch (item.getItemId()){
            case R.id.nav_hot:
                selectedFragment = new HotNewsFragment();
                break;
            case R.id.nav_local:
                selectedFragment = new LocalFragment();
                break;
            case R.id.nav_foreign:
                selectedFragment = new ForeignFragment();
                break;
            case R.id.nav_sports:
                selectedFragment = new SportsFragment();
                break;
            case R.id.nav_breaking:
                selectedFragment = new BreakingNewsFragment();
                break;
            case R.id.nav_video_news:
                selectedFragment = new VideoNewsFragment();
                break;
            case R.id.nav_my_news:
                selectedFragment = new MyNewsFragment();
                break;
            case R.id.nav_home:
                selectedFragment = new HomeFragment();
                break;
            case R.id.nav_submit:
                selectedFragment = new SubmitNewsFragment();
                break;
            case R.id.nav_save:
                selectedFragment = new SavedNewsFragment();
                break;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_page, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    public BottomNavigationView.OnNavigationItemSelectedListener navListner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment  = null;

                    switch (item.getItemId()){
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_submit:
                            selectedFragment = new MyNewsFragment();
                            break;
                        case R.id.nav_save:
                            selectedFragment = new SavedNewsFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    return true;
                }
            };




}

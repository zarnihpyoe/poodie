package net.poodie.poodie;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Zarni Phyo on 1/14/2017.
 */

public class MainActivity extends AppCompatActivity {

//    private RecyclerView mPostRV;
    private BottomNavigationView mBtnNavView;

    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        attachControllers();

        fm = getFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment.newInstance())
                .commit();
    }

    private void initView() {
//        mPostRV = (RecyclerView) findViewById(R.id.rv_posts);
        mBtnNavView = (BottomNavigationView) findViewById(R.id.bnv);
    }

    private void attachControllers() {
        // attach recyclerView adapter and set layout manager
//        PostRVAdapter postAdapter = new PostRVAdapter();
//        mPostRV.setAdapter(postAdapter);
//        mPostRV.setLayoutManager(new LinearLayoutManager(this));

        // attach bottom navigation view click listeners
        mBtnNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                String msg = "";
                Fragment fragment = HomeFragment.newInstance();
                switch (item.getItemId()) {
                    case R.id.menu_bot_nav_home:
                        fragment = HomeFragment.newInstance();
                        msg = "Home";
                        break;
                    case R.id.menu_bot_nav_search:
                        msg = "Search";
                        break;
                    case R.id.menu_bot_nav_notification:
                        msg = "Notification";
                        break;
                    case R.id.menu_bot_nav_bookmark:
                        msg = "Bookmark";
                        break;
                    case R.id.menu_bot_nav_account:
                        fragment = AccountFragment.newInstance();
                        msg = "Account";
                        break;
                }

                fm.beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}

package net.poodie.poodie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Zarni Phyo on 1/14/2017.
 */

public class MainActivity extends AppCompatActivity {

    private RecyclerView mPostRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        attachControllers();
    }

    private void initView() {
        mPostRV = (RecyclerView) findViewById(R.id.rv_posts);
    }

    private void attachControllers() {
        // attach recyclerView adapter and set layout manager
        PostRVAdapter postAdapter = new PostRVAdapter();
        mPostRV.setAdapter(postAdapter);
        mPostRV.setLayoutManager(new LinearLayoutManager(this));
    }
}

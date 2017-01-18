package net.poodie.poodie;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zarni Phyo on 1/18/2017.
 */

public class HomeFragment extends Fragment {

    private RecyclerView mPostRV;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();

        Bundle args = new Bundle();
        // add data to args
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mPostRV = (RecyclerView) view.findViewById(R.id.rv_posts);
        PostRVAdapter postAdapter = new PostRVAdapter();
        mPostRV.setAdapter(postAdapter);
        mPostRV.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}

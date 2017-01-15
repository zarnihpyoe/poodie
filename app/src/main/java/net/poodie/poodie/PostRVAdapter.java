package net.poodie.poodie;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zarni Phyo on 1/14/2017.
 */

public class PostRVAdapter extends RecyclerView.Adapter<PostRVAdapter.PostHolder> {

    /* Custom View holder */
    public static class PostHolder extends RecyclerView.ViewHolder {

        public PostHolder(View itemView) {
            super(itemView);
        }

        public void bindPost() {
            // bind data to the view here
        }
    }

    public PostRVAdapter() {
        // to pass dataset later
    }

    @Override
    public PostHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // get Post View from layout to create PostHolder
        View postView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new PostHolder(postView);
    }

    @Override
    public void onBindViewHolder(PostHolder holder, int position) {
        holder.bindPost();
    }

    @Override
    public int getItemCount() {
        return 8;
    }
}

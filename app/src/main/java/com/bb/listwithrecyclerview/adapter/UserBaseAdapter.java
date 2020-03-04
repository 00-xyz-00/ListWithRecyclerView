package com.bb.listwithrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bb.listwithrecyclerview.R;
import com.bb.listwithrecyclerview.model.User;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class UserBaseAdapter extends BaseAdapter {

    private List<User> listOfUsers;

    public UserBaseAdapter(List<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    @Override
    public int getCount() {
        return listOfUsers.size();
    }

    @Override
    public User getItem(int position) {
        return listOfUsers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View userView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.user_item_layout, parent, false);


        ((TextView) userView.findViewById(R.id.name_textview))
                .setText(listOfUsers.get(position).getName());
        ((TextView) userView.findViewById(R.id.description_textview))
                .setText(listOfUsers.get(position).getDescription());

        Glide.with(parent.getContext())
                .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                .load(listOfUsers.get(position).getPicUrl())
                .into((ImageView) userView.findViewById(R.id.avatar_imageview));

        return userView;
    }
}
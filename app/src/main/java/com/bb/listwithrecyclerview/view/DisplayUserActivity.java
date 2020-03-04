package com.bb.listwithrecyclerview.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bb.listwithrecyclerview.R;
import com.bb.listwithrecyclerview.model.User;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DisplayUserActivity extends AppCompatActivity {

    public static final String USER_KEY = "get.user.info";

    @BindView(R.id.content_textview)
    TextView contentTextView;

    @BindView(R.id.name_textview)
    TextView nameTextView;

    @BindView(R.id.profile_imageview)
    ImageView profileImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_user);

        ButterKnife.bind(this);

        User displayUser = ((User) getIntent().getSerializableExtra(USER_KEY));
        nameTextView.setText(displayUser.getName());
        contentTextView.setText(displayUser.getDescription());

        Glide.with(this)
                .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                .load(displayUser.getPicUrl())
                .into(profileImageView);

    }
}
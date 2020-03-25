package com.example.android_me.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.android_me.R;
import com.example.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    public BodyPartFragment() {};

    private ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_body_part, container, false);

        imageView = root.findViewById(R.id.fragment_body_part_image_view);

        imageView.setImageResource(AndroidImageAssets.getBodies().get(0));

        return root;
    }
}

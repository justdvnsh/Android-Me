package com.example.android_me.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.android_me.R;
import com.example.android_me.data.AndroidImageAssets;

import java.util.List;

public class BodyPartFragment extends Fragment {

    public BodyPartFragment() {};

    private ImageView imageView;
    private List<Integer> imageIds;
    private int index;


    public void setImageIds(List<Integer> imageIds) {
        this.imageIds = imageIds;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_body_part, container, false);

        imageView = root.findViewById(R.id.fragment_body_part_image_view);

        if (imageIds != null) {
            imageView.setImageResource(imageIds.get(index));
        } else {
            Log.i("Error-> ", "image ids are null !");
        }

        return root;
    }
}

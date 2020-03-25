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

import java.util.ArrayList;
import java.util.List;

public class BodyPartFragment extends Fragment {

    public BodyPartFragment() {};

    private ImageView imageView;
    private List<Integer> imageIds;
    private int index;

    private static String IMAGE_ID = "image_ids";
    private static String INDEX = "index";


    public void setImageIds(List<Integer> imageIds) {
        this.imageIds = imageIds;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putIntegerArrayList(IMAGE_ID, (ArrayList<Integer>) imageIds);
        outState.putInt(INDEX, index);
        super.onSaveInstanceState(outState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_body_part, container, false);

        if (savedInstanceState != null) {
            imageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID);
            index = savedInstanceState.getInt(INDEX);
        }

        imageView = root.findViewById(R.id.fragment_body_part_image_view);

        if (imageIds != null) {
            imageView.setImageResource(imageIds.get(index));
        } else {
            Log.i("Error-> ", "image ids are null !");
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (index < imageIds.size() - 1) {
                    index++;
                } else {
                    index = 0;
                }

                imageView.setImageResource(imageIds.get(index));
            }
        });

        return root;
    }
}

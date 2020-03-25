package com.example.android_me.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.android_me.R;

public class MainActivity extends AppCompatActivity implements MasterListFragment.mOnClickListener{

    private int headIndex;
    private int bodyIndex;
    private int legIndex;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.next_btn);
    }

    @Override
    public void onImageSelected(int position) {
        Toast.makeText(getApplicationContext(), "Position " + position, Toast.LENGTH_SHORT).show();

        int bodyPart = position / 12;

        int listIndex = position - 12*bodyPart;

        switch (bodyPart) {
            case 0: headIndex = listIndex;
            break;
            case 1: bodyIndex = listIndex;
            break;
            case 2: legIndex = listIndex;
            break;
            default: break;
        }

        Bundle b = new Bundle();
        b.putInt("headIndex", headIndex);
        b.putInt("bodyIndex", bodyIndex);
        b.putInt("legIndex", legIndex);

        final Intent intent = new Intent(getApplicationContext(), AndroidMeActivity.class);
        intent.putExtras(b);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}

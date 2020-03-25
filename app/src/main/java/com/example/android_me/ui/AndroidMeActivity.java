/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android_me.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.android_me.R;
import com.example.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        BodyPartFragment headFragment = new BodyPartFragment();
        headFragment.setImageIds(AndroidImageAssets.getHeads());
        headFragment.setIndex(1);
        FragmentManager manager1 = getSupportFragmentManager();
        manager1.beginTransaction().replace(R.id.head_container, headFragment).commit();

        BodyPartFragment bodyFragment = new BodyPartFragment();
        bodyFragment.setImageIds(AndroidImageAssets.getBodies());
        bodyFragment.setIndex(1);
        FragmentManager manager2 = getSupportFragmentManager();
        manager2.beginTransaction().replace(R.id.body_container, bodyFragment).commit();

        BodyPartFragment legsFragment = new BodyPartFragment();
        legsFragment.setImageIds(AndroidImageAssets.getLegs());
        legsFragment.setIndex(1);
        FragmentManager manager3 = getSupportFragmentManager();
        manager3.beginTransaction().replace(R.id.legs_container, legsFragment).commit();
    }
}

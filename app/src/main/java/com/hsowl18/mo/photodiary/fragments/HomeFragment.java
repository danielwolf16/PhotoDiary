package com.hsowl18.mo.photodiary.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.hsowl18.mo.photodiary.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button button = view.findViewById(R.id.testButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent testIntent = new Intent(getContext(), com.hsowl18.mo.photodiary.CameraActivity.class);
                startActivity(testIntent);
                Toast.makeText(getContext(), "Works", Toast.LENGTH_LONG).show();
            }
        });


        return inflater.inflate(R.layout.fragment_home, container, false);
    }


}

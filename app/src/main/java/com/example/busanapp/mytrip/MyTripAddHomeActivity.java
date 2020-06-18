package com.example.busanapp.mytrip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.busanapp.R;

public class MyTripAddHomeActivity extends AddThirdTripActivity implements
        View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mytrip_secondhome);
    }
}

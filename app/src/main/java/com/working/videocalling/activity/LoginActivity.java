package com.working.videocalling.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.working.videocalling.R;
import com.working.videocalling.fragment.LoginPage;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.loginActivityFragmentContainer, LoginPage.class,null)
                    .commit();
        }
    }
}
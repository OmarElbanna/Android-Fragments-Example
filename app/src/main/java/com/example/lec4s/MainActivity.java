package com.example.lec4s;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("testFragments","MainActivity===>onCreate");
        b1 = findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Fragments Change",Toast.LENGTH_LONG).show();

                // 5 Steps

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentC fragmentC = new FragmentC();
                fragmentTransaction.replace(R.id.fragmentContainerView1,fragmentC);
//                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("testFragments","MainActivity===>onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("testFragments","MainActivity===>onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("testFragments","MainActivity===>onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("testFragments","MainActivity===>onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("testFragments","MainActivity===>onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("testFragments","MainActivity===>ononRestartStart");
    }
}
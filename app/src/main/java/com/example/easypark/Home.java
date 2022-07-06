package com.example.easypark;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.content.ContentValues.TAG;

public class Home extends AppCompatActivity {

    TextView A,B,C,D,E,F;
    ImageView imgA,imgB,imgC,imgD,imgE,imgF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        A = findViewById(R.id.txt_A);
        B = findViewById(R.id.txt_B);
        C = findViewById(R.id.txt_C);
        D = findViewById(R.id.txt_D);
        E = findViewById(R.id.txt_E);
        F = findViewById(R.id.txt_F);


        imgA =findViewById(R.id.imgA);
        imgB =findViewById(R.id.imgB);
        imgC =findViewById(R.id.imgC);
        imgD =findViewById(R.id.imgD);
        imgE =findViewById(R.id.imgE);
        imgF =findViewById(R.id.imgF);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef_A = database.getReference("parkA");
        DatabaseReference myRef_B = database.getReference("parkB");
        DatabaseReference myRef_C = database.getReference("parkC");
        DatabaseReference myRef_D = database.getReference("parkD");
        DatabaseReference myRef_E = database.getReference("parkE");
        DatabaseReference myRef_F = database.getReference("parkF");



        myRef_A.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot_A) {
                Integer valueA = snapshot_A.getValue(Integer.class);

                if(valueA == 1){
                    imgA.setImageDrawable(getResources().getDrawable(R.drawable.car));
                }else {
                    imgA.setImageDrawable(getResources().getDrawable(R.drawable.park));
                }

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        myRef_B.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot_B) {
                Integer valueB =  snapshot_B.getValue(Integer.class);

                if(valueB == 1){
                    imgB.setImageDrawable(getResources().getDrawable(R.drawable.car));
                }else {
                    imgB.setImageDrawable(getResources().getDrawable(R.drawable.park));
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });


        myRef_C.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot_C) {
                Integer valueC =  snapshot_C.getValue(Integer.class);

                if(valueC == 1){
                    imgC.setImageDrawable(getResources().getDrawable(R.drawable.car));
                }else {
                    imgC.setImageDrawable(getResources().getDrawable(R.drawable.park));
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });


        myRef_D.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot_D) {
                Integer valueD =  snapshot_D.getValue(Integer.class);

                if(valueD == 1){
                    imgD.setImageDrawable(getResources().getDrawable(R.drawable.car));
                }else {
                    imgD.setImageDrawable(getResources().getDrawable(R.drawable.park));
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });



        myRef_E.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot_E) {
                Integer valueE =  snapshot_E.getValue(Integer.class);

                if(valueE == 1){
                    imgE.setImageDrawable(getResources().getDrawable(R.drawable.car));
                }else {
                    imgE.setImageDrawable(getResources().getDrawable(R.drawable.park));
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });



        myRef_F.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot_F) {
                Integer valueF =  snapshot_F.getValue(Integer.class);

                if(valueF == 1){
                    imgF.setImageDrawable(getResources().getDrawable(R.drawable.car));
                }else {
                    imgF.setImageDrawable(getResources().getDrawable(R.drawable.park));
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });



       //.........................set logout bar..................................................
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.logout:
                        Intent int_logout = new Intent(Home.this,LogOut.class);
                        startActivity(int_logout);
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });


    }
}
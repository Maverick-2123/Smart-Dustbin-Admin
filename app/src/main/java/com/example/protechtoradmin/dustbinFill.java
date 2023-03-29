package com.example.protechtoradmin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class dustbinFill extends AppCompatActivity {
    final ArrayList<String> list = new ArrayList<>();
    TextView textView1;
    TextView textView2;
    TextView textView3;
    Integer fill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        textView1 = (TextView)findViewById(R.id.dust1);
        textView2 = (TextView)findViewById(R.id.dust2);
        textView3 = (TextView)findViewById(R.id.dust3);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dustbin_fill);
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference().child("FillPercent");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren())
                {
                    list.add(snapshot.getValue().toString());
                }
//                if (fill<75)
//                {
//                    textView1.setBackgroundColor(Integer.parseInt("@color/green"));
//                }
//                else if (fill == 75)
//                {
//                    textView1.setBackgroundColor(Integer.parseInt("@color/yellow"));
//                }
//                else if (fill == 100)
//                {
//                    textView1.setBackgroundColor(Integer.parseInt("@color/red"));
//                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}
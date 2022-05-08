package com.example.veggimart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class AddActivity extends AppCompatActivity {

    EditText name,number,cvv,expire,surl;
    Button btnAdd,btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        name = (EditText)findViewById(R.id.txtName);
        number = (EditText)findViewById(R.id.txtNumber);
        cvv = (EditText)findViewById(R.id.txtCvv);
        expire = (EditText)findViewById(R.id.txtExpire);
        surl = (EditText)findViewById(R.id.txtImageUrl);

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnBack = (Button)findViewById(R.id.btnBack);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData();
                clearAll();

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void insertData()
    {
        Map<String,Object> map = new HashMap<>();
        map.put("name",name.getText().toString());
        map.put("number",number.getText().toString());
        map.put("cvv",cvv.getText().toString());
        map.put("expire",expire.getText().toString());
        map.put("surl",surl.getText().toString());

        FirebaseDatabase.getInstance().getReference().child("cards").push()
                .setValue(map)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(AddActivity.this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(Exception e) {
                        Toast.makeText(AddActivity.this, "Error While Insertion", Toast.LENGTH_SHORT).show();

                    }
                });
                 


    }

    private void clearAll()
    {
        name.setText("");
        number.setText("");
        cvv.setText("");
        expire.setText("");
        surl.setText("");




    }
}
package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        /*Create reference of the username and password **/
        TextView username = (TextView) findViewById(R.id.tv_username);
        TextView password = (TextView) findViewById(R.id.tv_password);

        /*Create reference of the login button **/
        MaterialButton loginbtn =(MaterialButton) findViewById(R.id.loginbtn);

        /*Check username and password using that 2 as admin & admin **/
        //When the button is clicked you will retrieve username and the password type,check that with admin and admin**/
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    //This is correct password
                    Toast.makeText(MainActivity1.this, "LOGIN SUCCESSFUL!!!", Toast.LENGTH_SHORT).show();
                } else
                    //incorrect
                    Toast.makeText(MainActivity1.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
            }

        });

    }
}
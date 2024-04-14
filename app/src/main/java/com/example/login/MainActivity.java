package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        btn=(Button) findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=username.getText().toString().trim();
                String pass= password.getText().toString().trim();

                String uname="om";
                String setpass="1234";

                if(name.isEmpty()||pass.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "please enter username and password", Toast.LENGTH_SHORT).show();
                } else if (name.equals(uname)&& pass.equals(setpass)) {
                    Toast.makeText(MainActivity.this, "Go to new activity", Toast.LENGTH_SHORT).show();
                    
                }else{
                    Toast.makeText(MainActivity.this, "Wrong usernmae or password try again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
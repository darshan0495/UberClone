package com.example.uberclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {
    enum State{
        LOGIN,SIGNUP
    }
    private State state;
    private Button btnSignUp;
    private EditText edtUsername,edtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsername=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        btnSignUp=findViewById(R.id.btnSignUp);
        state=State.SIGNUP;




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_signup_activity,menu);
        return super.onCreateOptionsMenu(menu);
    }
}

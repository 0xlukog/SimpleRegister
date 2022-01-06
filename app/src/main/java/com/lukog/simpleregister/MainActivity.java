package com.lukog.simpleregister;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onbtn(View view){
        EditText fn = findViewById(R.id.fname);
        EditText ln = findViewById(R.id.lname);
        EditText mail = findViewById(R.id.email);
        TextView fname = findViewById(R.id.fnameviewer);
        TextView lname = findViewById(R.id.lnameviewer);
        TextView email = findViewById(R.id.emailviewer);
        fname.setText("First name : "+fn.getText().toString());
        lname.setText("Last Name : "+ln.getText().toString());

        email.setText("Email : "+mail.getText().toString());
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    }
}
package com.example.ludens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

/*
import android.content.Context;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
*/

public class MainActivity extends AppCompatActivity {

    public Button buttonAccept;

    // On Create method is executed once the activity starts
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connects XML objects to their java analogous variables
        initViews();

        // Set click event of the Accept button
        buttonAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Disable the button to avoid extra taps (which makes you navigate more than once)
                buttonAccept.setClickable(false);

                // Button tap was successful; print congrats message
                showMessage("Nos da gusto tenerle en Ludens.");

                // Function to navigate to the next screen
                navExample();
            }
        });
    }

    // This method is used to connect XML views to its Objects
    private void initViews() {
        buttonAccept = findViewById(R.id.buttonAccept);
    }

    // Function to set Toast messages easily in order to print success/failure alerts.
    private void showMessage(String text) {
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
    }

    // Navigate to the next screen
    private void navExample() {
        Intent example = new Intent(MainActivity.this, ExampleActivity.class);
        startActivity(example);
        buttonAccept.setClickable(true);
    }

    /* Function to hide the keyboard upon use. It's not used here, but it's pretty useful for sign-ins
    private void hideSoftKeyboard() {
        // Check if no view has focus:
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
    }*/
}
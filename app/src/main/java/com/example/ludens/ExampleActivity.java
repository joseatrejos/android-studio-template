package com.example.ludens;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

public class ExampleActivity extends AppCompatActivity {

    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_example);

        initViews();

        // Set click event of the Accept button
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Disable the button to avoid extra taps (which makes you navigate more than once)
                buttonBack.setClickable(false);

                // Button tap was successful; print congrats message
                showMessage("Esperamos tenerlo de vuelta");

                // Function to close the current screen and navigate to its parent layout
                finish();
            }
        });
    }

    // This method should be used to connect XML views to its Objects
    private void initViews() {
        buttonBack = findViewById(R.id.buttonBack);
    }

    // Function to navigate back to parent layout when the return arrow is tapped
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        showMessage("Esperamos tenerlo de vuelta");
        NavUtils.navigateUpFromSameTask(this);
    }

    // Function to set Toast messages easily in order to print success/failure alerts.
    private void showMessage(String text) {
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }
}

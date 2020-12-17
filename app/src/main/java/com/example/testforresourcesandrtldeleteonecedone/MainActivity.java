package com.example.testforresourcesandrtldeleteonecedone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView localeTextView,versionTextView, withSolutionTextView, withoutSolutionTextView;
    Button enterButton;
    ImageView rpImageView,directionImageView;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();

    }

    private void initializeView(){

        localeTextView = findViewById(R.id.text_view_locale);
        versionTextView = findViewById(R.id.text_view_version);
        withoutSolutionTextView = findViewById(R.id.text_view_without_solution);
        withSolutionTextView = findViewById(R.id.text_view_with_solution);
        enterButton = findViewById(R.id.button_enter);
        rpImageView= findViewById(R.id.image_view_resource_precedence);
        directionImageView = findViewById(R.id.image_view_layout_direction);
        editText = findViewById(R.id.text_edit);
        enterButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        handleText();
    }



    private void handleText(){

       String text =  editText.getText().toString();
       withoutSolutionTextView.setText(text);


    }


}
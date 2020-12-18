package com.example.testforresourcesandrtldeleteonecedone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView localeTextView,versionTextView, withSolutionTextView, withoutSolutionTextView;
    Button enterButton;
    ImageView rpImageView,directionImageView;
    EditText editText;

    // TODO: 12/16/2020
//    part 3
//  - [ ]  Resource precedency


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();
        setup();
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
    private void setup(){
        settingLocale();
        getVersionCode();

    }




    @Override
    public void onClick(View view) {
        handleText();
    }

    private void handleText(){

       String text =  editText.getText().toString();
       withoutSolutionTextView.setText(getString(R.string.without_solution,text));
       withSolutionTextView.setText(getString(R.string.with_solution,text));

    }


    private void settingLocale(){
        Locale primaryLocale = getResources().getConfiguration().getLocales().get(0);
        String locale = primaryLocale.getDisplayName();
        localeTextView.setText(locale);
    }

    private void getVersionCode(){
        Locale primaryLocale = getResources().getConfiguration().getLocales().get(0);
        int versionCode = BuildConfig.VERSION_CODE;
        String versionName = BuildConfig.VERSION_NAME;
        String localeVersionCode = String.format(primaryLocale,"%d",versionCode);
        versionTextView.setText("Version: "+localeVersionCode+" - "+versionName);
    }

}
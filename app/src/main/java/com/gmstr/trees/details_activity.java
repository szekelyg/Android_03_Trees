package com.gmstr.trees;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class details_activity extends AppCompatActivity {

    private TextView bioText;
    private ImageView profileImage;
    private Bundle extras;
    private TextView treeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        profileImage = findViewById(R.id.Image_ID);
        bioText = findViewById(R.id.textView_ID);
        treeName=findViewById(R.id.nameID);

        extras = getIntent().getExtras();

        bioText.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

        if (extras!=null){

            String name = extras.getString("name");
            showDetails(name);

            //Toast.makeText(this, bio, Toast.LENGTH_LONG).show();

        }
    }

    public void showDetails(String name){
        if(name.equals("bukk")){
            profileImage.setImageDrawable(getResources().getDrawable(R.drawable.bukk));
            treeName.setText("Bükk");
            bioText.setText(extras.getString(name));
        }else if(name.equals("tolgy")){
            profileImage.setImageDrawable(getResources().getDrawable(R.drawable.tolgy));
            treeName.setText("Tölgy");
            bioText.setText(extras.getString(name));
        }
    }
}

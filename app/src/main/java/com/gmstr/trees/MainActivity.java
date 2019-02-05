package com.gmstr.trees;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView treeOne;
    private ImageView treeTwo;

    private String bukkBio = "A hűvösebb és csapadékosabb éghajlatot kedvelő, mészkedvelő faj, ezért Magyarországon leginkább a középhegységek tetőin, illetve északi lejtőin nő, az Alföld peremére ritkán ereszkedik le. ";
    private String tolgyBio = "Az egyes fajok termete meglehetősen változatos: cserjék és nagy (mintegy 35 m magasságig) fák egyaránt előfordulnak a nemzetségben. Kérge repedezett."
            +" A lombhullató fajok levele többnyire öblös, karéjos, a mediterrán fajoké rendszerint tagolatlan.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        treeOne = findViewById(R.id.Bukk_ID);
        treeTwo = findViewById(R.id.Tolgy_ID);

        treeOne.setOnClickListener(this);
        treeTwo.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Bukk_ID:
                Intent bukkIntent = new Intent(MainActivity.this,details_activity.class);
                bukkIntent.putExtra("bukk",bukkBio);
                bukkIntent.putExtra("name","bukk");
                startActivity(bukkIntent);
                break;
            case R.id.Tolgy_ID:
                Intent tolgyIntent = new Intent(MainActivity.this,details_activity.class);
                tolgyIntent.putExtra("tolgy",tolgyBio);
                tolgyIntent.putExtra("name","tolgy");
                startActivity(tolgyIntent);
                break;
        }
    }
}

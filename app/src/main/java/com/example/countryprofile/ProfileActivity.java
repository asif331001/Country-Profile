package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = (ImageView) findViewById(R.id.imageviewid);
        textView = (TextView) findViewById(R.id.countrytextid);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null) {

            String countryName = bundle.getString("name");
            showDetails(countryName);
        }



    }

    void showDetails(String countryName) {

        if (countryName.equals("Bangladesh")){

            imageView.setImageResource(R.drawable.bdmap);
            textView.setText(R.string.bdtext);
        }
        if (countryName.equals("India")){

            imageView.setImageResource(R.drawable.indmap);
            textView.setText(R.string.indtext);
        }
        if (countryName.equals("Pakistan")){

            imageView.setImageResource(R.drawable.pakmap);
            textView.setText(R.string.paktext);
        }

        if (countryName.equals("Srilanka")){

            imageView.setImageResource(R.drawable.srimap);
            textView.setText(R.string.sritext);
        }

        if (countryName.equals("Nepal")){

            imageView.setImageResource(R.drawable.nepmap);
            textView.setText(R.string.neptext );
        }

        if (countryName.equals("Bhutan")){

            imageView.setImageResource(R.drawable.bhumap);
            textView.setText(R.string.bhutext );
        }
    }
}
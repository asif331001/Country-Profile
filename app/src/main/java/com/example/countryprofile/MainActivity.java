package com.example.countryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bdButton, indButton, pakButton, sriButton, nepButton;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdButton = (Button) findViewById(R.id.bdbuttonid);
        indButton = (Button) findViewById(R.id.indbuttonid);
        pakButton = (Button) findViewById(R.id.pakbuttonid);
        sriButton = (Button) findViewById(R.id.sributtonid);
        nepButton = (Button) findViewById(R.id.nepbuttonid);

        bdButton.setOnClickListener(this);
        indButton.setOnClickListener(this);
        pakButton.setOnClickListener(this);
        sriButton.setOnClickListener(this);
        nepButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.bdbuttonid) {

            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        }
        if (view.getId()==R.id.indbuttonid){

            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }
        if (view.getId()==R.id.pakbuttonid){

            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);
        }

        if (view.getId()==R.id.sributtonid){

            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Srilanka");
            startActivity(intent);
        }

        if (view.getId()==R.id.nepbuttonid){

            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Nepal");
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.exit);
        alertDialogBuilder.setTitle(R.string.titletext);
        alertDialogBuilder.setMessage(R.string.msgtext);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
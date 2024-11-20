package com.example.fab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton mainfab, addfab, deletefab;
    TextView mainText, addText, deleteText;
    Boolean flag;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = new Intent(this, secondActivity.class);

        mainfab = findViewById(R.id.mainIcon);
        mainText = findViewById(R.id.mainText);
        addfab = findViewById(R.id.addIcon);
        deletefab = findViewById(R.id.deleteIcon);
        addText = findViewById(R.id.addText);
        deleteText = findViewById(R.id.deleteText);
        flag = false;
        addfab.setVisibility(View.GONE);
        addText.setVisibility(View.GONE);
        deletefab.setVisibility(View.GONE);
        deleteText.setVisibility(View.GONE);

        addfab.setOnClickListener(new add());
        deletefab.setOnClickListener(new delete());


        mainfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag){
                    addfab.show();
                    deletefab.show();
                    addText.setVisibility(View.VISIBLE);
                    deleteText.setVisibility(View.VISIBLE);
                    mainText.setVisibility(View.GONE);
                    flag= true;
                }else{
                    addfab.hide();
                    deletefab.hide();
                    addText.setVisibility(View.GONE);
                    deleteText.setVisibility(View.GONE);
                    mainText.setVisibility(View.VISIBLE);
                    flag= false;
                }
            }
        });


//        mainfab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(i);
//            }
//        });
    }

     public class add implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText( getApplicationContext(), "This Works",Toast.LENGTH_SHORT).show();

        }
    }
    public class delete implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText( getApplicationContext(), "This Works",Toast.LENGTH_SHORT).show();
           startActivity(i);
        }
    }
}
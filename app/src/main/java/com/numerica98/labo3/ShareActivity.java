package com.numerica98.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    TextView mTexto;
    private String text_aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mTexto= findViewById(R.id.Texto1);

        Intent new_intent = getIntent();

        if(new_intent != null){
            text_aux= new_intent.getStringExtra(Intent.EXTRA_TEXT);

        }

        mTexto.setText(text_aux);
    }
}

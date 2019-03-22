package com.numerica98.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NewActivity extends AppCompatActivity {

    TextView mText1, mText2, mText3, mText4;
    ImageButton mBotonCompartir;
    String text_aux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);


        mBotonCompartir= findViewById(R.id.boton_compartir);
        mText1= findViewById(R.id.text_user_ingresado);
        mText2= findViewById(R.id.text_password_ingresado);
        mText3= findViewById(R.id.text_email_ingresado);
        mText4= findViewById(R.id.text_gender_ingresado);

        Intent new_intent = getIntent();

        if (new_intent != null){
            //text_aux= new_intent.getStringExtra(AppConstants.TEXT1_KEY);
            mText1.setText(new_intent.getStringExtra(AppConstants.USER_KEY));
            mText2.setText(new_intent.getStringExtra(AppConstants.PASSWORD_KEY));
            mText3.setText(new_intent.getStringExtra(AppConstants.EMAIL_KEY));
            mText4.setText(new_intent.getStringExtra(AppConstants.GENDER_KEY));
        }

        mBotonCompartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2= new Intent();
                text_aux= mText1.getText()+"\n"+mText2.getText()+"\n"+mText3.getText()+"\n"+mText4.getText();
                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");

                m_intent2.putExtra(Intent.EXTRA_TEXT,text_aux);

                startActivity(m_intent2);
            }
        });
    }
}

package com.numerica98.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button m_action_submit;
    EditText editText1, editText2, editText3, editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_action_submit= findViewById(R.id.boton_submit);
        editText1= findViewById(R.id.editText_user);
        editText2= findViewById(R.id.editText_password);
        editText3= findViewById(R.id.editText_email);
        editText4= findViewById(R.id.editText_gender);

        m_action_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent= new Intent(MainActivity.this,NewActivity.class);//(donde estoy, adonde quiero ir)

                m_intent.putExtra(AppConstants.USER_KEY,editText1.getText().toString()); //(clave,valor)
                m_intent.putExtra(AppConstants.PASSWORD_KEY,editText2.getText().toString());
                m_intent.putExtra(AppConstants.EMAIL_KEY,editText3.getText().toString());
                m_intent.putExtra(AppConstants.GENDER_KEY,editText4.getText().toString());

                startActivity(m_intent);
            }
        });
    }
}

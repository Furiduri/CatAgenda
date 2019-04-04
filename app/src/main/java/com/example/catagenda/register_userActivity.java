package com.example.catagenda;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class register_userActivity extends AppCompatActivity {
     EditText txtNombre,txtTelefono,txtCoreo;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_user);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtTelefono = (EditText) findViewById(R.id.txtTelefono);
        txtCoreo = (EditText) findViewById(R.id.txtCorreo);


    }
}

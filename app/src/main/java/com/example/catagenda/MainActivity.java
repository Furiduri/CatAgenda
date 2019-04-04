package com.example.catagenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final boolean[] flag = {false};
        final Shedul sh = new Shedul();
        final User U = new User();
        final EditText txtNombre = findViewById(R.id.txtNombre);
        final EditText txtBuscar = findViewById(R.id.txtBuscar);
        final Button btnAdd =  findViewById(R.id.btnAdd);
        final Button btnBuscar = findViewById(R.id.btnBuscar);
        //On click Add buttom
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                U.setNombre(txtNombre.getText().toString());
                sh.AddUser(U);
            }

        });

        //On clik Buscar
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag[0] = sh.BuscarNombre(txtBuscar.getText().toString());
                Toast.makeText(getApplication(),"Usuario"+ flag[0],Toast.LENGTH_LONG).show();
            }
        });
    }
}

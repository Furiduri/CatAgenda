package com.example.catagenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<User> ListUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListUser = new ArrayList<User>();
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
                ListUser = sh.getListUser();
            }

        });

        //On clik Buscar
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sh.setListUser(ListUser);
                flag[0] = sh.BuscarNombre(txtBuscar.getText().toString());
                Toast.makeText(getApplication(),"Usuario"+ flag[0],Toast.LENGTH_LONG).show();
            }
        });
    }
}

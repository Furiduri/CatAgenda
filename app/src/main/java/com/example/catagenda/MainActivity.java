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
        final Shedul sh = new Shedul(ListUser);
        final EditText txtNombre = findViewById(R.id.txtNombre);
        final EditText txtPhone = findViewById(R.id.txtPhone);
        final EditText txtEmail = findViewById(R.id.txtEmail);
        final EditText txtNombre2 = findViewById(R.id.txtNombre2);
        final EditText txtPhone2 = findViewById(R.id.txtPhone2);
        final EditText txtEmail2 = findViewById(R.id.txtEmail2);
        final EditText txtBuscar = findViewById(R.id.txtBuscar);
        final Button btnAdd =  findViewById(R.id.btnAdd);
        final Button btnBuscar = findViewById(R.id.btnBuscar);
        final Button btnEdit = findViewById(R.id.btnEdit);
        //On click Add buttom
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sh.setListUser(ListUser);
                User U = new User(txtNombre.getText().toString(),
                        txtPhone.getText().toString(),
                        txtEmail.getText().toString());
                sh.AddUser(U);
                ListUser = sh.getListUser();
            }

        });

        //On clik Buscar
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sh.setListUser(ListUser);
                User ActualU = sh.BuscarNombre(txtBuscar.getText().toString());
                if(ActualU.getNombre().isEmpty()) {
                    Toast.makeText(getApplication(), "No existe el Usuario" + txtBuscar.getText().toString(), Toast.LENGTH_LONG).show();
                }else{
                    txtNombre2.setText(ActualU.getNombre());
                    txtPhone2.setText(ActualU.getPhone());
                    txtEmail2.setText(ActualU.getEmail());
                }
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sh.setListUser(ListUser);
                User UserEdit = new User(txtNombre2.getText().toString(),
                        txtPhone2.getText().toString(),
                        txtEmail2.getText().toString());

            }
        });
    }
}

package com.example.catagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Conexion a SQLite
        ConexionSQLite conn = new ConexionSQLite(this,"db_CatAgenda",null,1);


    }

    public void onClick(View view){

        switch (view.getId()){
            case R.id.btnViewAdd:
                Intent miItent = new Intent(this, register_userActivity.class);
                startActivity(miItent);
                break;
        }
    }
}

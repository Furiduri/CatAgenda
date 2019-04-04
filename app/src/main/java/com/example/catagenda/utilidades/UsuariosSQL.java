package com.example.catagenda.utilidades;

public class UsuariosSQL {
    //Constantes
    static public final String TABLE_USUARIOS = "Usuarios";
    static public final String CAMPO_ID="id";
    static public final String CAMPO_NOMBRE="nombre";
    static public final String CAMPO_TELEFONO="telefono";
    static public final String CAMPO_COREO="correo";

    // Comandos
    static final public String UP_CREAR_TABLA_USUARIO="CREATE TABLE "+TABLE_USUARIOS+" ("
        +CAMPO_ID+" INTEGER, "
        +CAMPO_NOMBRE+" TEXT, "
        +CAMPO_TELEFONO+" TEXT, "
        +CAMPO_COREO+" TEXT)";

    static public final String UP_DROP_TABLE="DROP TABLE IF EXISTS "+UsuariosSQL.TABLE_USUARIOS;

}

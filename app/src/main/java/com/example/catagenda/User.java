package com.example.catagenda;

class User {
    private String Nombre;
    private String Phone;
    private String Email;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public User(String nombre, String phone, String email) {
        Nombre = nombre;
        Phone = phone;
        Email = email;
    }
}

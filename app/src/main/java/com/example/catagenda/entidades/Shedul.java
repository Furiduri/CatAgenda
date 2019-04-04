package com.example.catagenda.entidades;

import com.example.catagenda.entidades.User;

import java.util.ArrayList;

public class Shedul {
    ArrayList<User> ListUser;

    public void AddUser(User user){
        ListUser = new ArrayList<User>();
        ListUser.add(user);
    }
    public boolean BuscarNombre(String Param){
        boolean flag = false;
        for (User U: ListUser
             ) {
            if(U.getNombre().equals(Param))
                flag = true;
        }
        return flag;
    }

    public ArrayList<User> getListUser() {
        return ListUser;
    }

    public void setListUser(ArrayList<User> listUser) {
        ListUser = listUser;
    }
}

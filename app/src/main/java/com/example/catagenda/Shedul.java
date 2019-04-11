package com.example.catagenda;

import java.util.ArrayList;

class Shedul {
    ArrayList<User> ListUser;

    public Shedul(ArrayList<User> listUser) {
        ListUser = listUser;
    }

    public void AddUser(User user){
        ListUser.add(user);
    }
    public User BuscarNombre(String Param){
        User ActualU = new User("","","");
        for (User U: ListUser
             ) {
            if(U.getNombre().equals(Param))
                ActualU = U;
        }
        return ActualU;
    }

    public ArrayList<User> EditUser (User EditU){

        for (User U: ListUser
        ) {
            if(U.getNombre().equals(EditU.getNombre()) ||
                    U.getPhone().equals(EditU.getPhone()) ||
                    U.getEmail().equals(EditU.getEmail())){
                U.setNombre(EditU.getNombre());
                U.setPhone(EditU.getPhone());
                U.setEmail(EditU.getEmail());
            }
        }

        return this.ListUser;
    }

    public ArrayList<User> getListUser() {
        return ListUser;
    }

    public void setListUser(ArrayList<User> listUser) {
        ListUser = listUser;
    }
}

package sda;

import java.util.ArrayList;

public class UserService {

private ArrayList<User> ListaOsob = new ArrayList<>();

public void addUser(User user){
   ListaOsob.add(user);
}

public void printAll(){
    for(User name: ListaOsob){
        System.out.println(name);
    }
}


}

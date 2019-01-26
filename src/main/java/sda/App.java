package sda;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

//    UserService lista = new UserService();
//lista.addUser(new User("Anita", "Malek", "AMalek", "admin"));
//    lista.printAll();

//        ArrayList<String> ListaOsob = new ArrayList<>();
//        ListaOsob.add("Marysia");
//        ListaOsob.add("Pies");
//        ListaOsob.add("Kot");
//
//        for( String name: ListaOsob){
//            System.out.println(name);
//        }
//
//        ArrayList<Integer> NumerOsoby = new ArrayList<>();
//
//        NumerOsoby.add(1);
//        NumerOsoby.add(2);
//        NumerOsoby.add(3);
//
//        for (int i: NumerOsoby){
//            System.out.println(i);
//        }
UserService ekipka = new UserService();
ekipka.addUser(new User("ela", "malysz", "e.malysz", "skoczek"));
ekipka.printAll();


    }
}

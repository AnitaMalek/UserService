package sda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {

    private Map<Integer, Person> listaOsob = new HashMap<>();

    private static int id = 1;

    public void addPerson(Person person) {
        listaOsob.put(id, person);
        id++;
    }

    public Map<Integer, Person> wyswietl() {
        return listaOsob;
    }

    public void remove(String phrase){
        List<Integer>ids = new ArrayList<>();
        for(Integer key : listaOsob.keySet() ){
            if (listaOsob.get(key).getName().equals(phrase) || listaOsob.get(key).getLastName().equals(phrase)){
                ids.add(key);
            }
        }
        for(Integer id: ids){
            listaOsob.remove(id);
        }
    }

    public void printAll(){
        System.out.println(listaOsob);
    }

}







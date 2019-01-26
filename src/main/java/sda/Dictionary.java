package sda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

//    private Map<String, String> dictionary = new HashMap<>();
//
//    public void addTranslation(String pl, String transl) {
//        if (dictionary.containsKey(pl)) {
//            System.out.println("Takie slowo juz istnieje");
//        } else {
//            dictionary.put(pl, transl);
//        }
//    }
//
//    public String getTranslation(String pl) {
//        return dictionary.get(pl);
//    }
//
//    public void edit(String pl, String transl) {
//        if (dictionary.containsKey(pl)) {
//            dictionary.put(pl, transl);
//        } else {
//            System.out.println("Nie ma czegos takiego");
//        }



private Map<String, List<String>> dictionary = new HashMap<>();

    public void addTranslation(String pl, List<String> transl) {
        if (dictionary.containsKey(pl)) {
            System.out.println("Takie slowo juz istnieje");
        } else {
            dictionary.put(pl, transl);
        }
    }

    public List<String> getTranslation(String pl) {
        return dictionary.get(pl);
    }

    public void edit(String pl, List<String> transl) {
        if (dictionary.containsKey(pl)) {
            dictionary.put(pl, transl);
        } else {
            System.out.println("Nie ma czegos takiego");
        }


    }
}
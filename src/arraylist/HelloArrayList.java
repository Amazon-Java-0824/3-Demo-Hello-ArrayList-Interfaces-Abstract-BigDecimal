package arraylist;

import java.util.ArrayList;
import java.util.List;

public class HelloArrayList {


    public static void main(String[] args) {


        List<String> nameList = new ArrayList<>();

        nameList.add("Paco");
        nameList.add("Bob");
        nameList.add("Jack");

        System.out.println(nameList);
        nameList.add("Mary");
        System.out.println(nameList);


        System.out.println( "Does it contain Bob?: " + nameList.contains("Bob"));
        nameList.remove("Bob");
        System.out.println( "Does it contain Bob?: " + nameList.contains("Bob"));

        nameList.set(0, "Charlie");

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(i + ") " + nameList.get(i));
        }

        ArrayList<Integer> numList = new ArrayList<>(List.of(1, 2, 3, 4));
        System.out.println(numList);
    }
}
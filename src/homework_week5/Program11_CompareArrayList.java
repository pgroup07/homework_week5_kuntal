package homework_week5;

import java.util.ArrayList;

public class Program11_CompareArrayList {
    public static void main(String[] args) {
        compareList(); //static method calling
    }

    public static void compareList() {
        ArrayList<String> c1 = new ArrayList<>(); //obj created for arraylist
        //Add obj into color collection
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<>();  //obj created for arraylist
        //Add obj into color collection
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1
        )
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);


    }
}


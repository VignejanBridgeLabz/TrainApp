package org.example;

import java.util.*;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {
    List<String> bogies=new ArrayList<String>();
        System.out.println("Train Consist Management App");
        System.out.println("Initial Bogie Count: "+bogies.size());

        //ADD
        bogies.add("Sleepe");
        bogies.add("AC Chair");
        bogies.add("First Class");
//        Displal list
        for(String bogie:bogies){
            System.out.println("Bogies List: "+bogie);
        }

//       Remove bogie
        bogies.remove("First Class");
//        check bogie
        String checkBogie=bogies.contains("First Class")?"Yes":"No";

        System.out.println("Does First Class bogie exist? "+checkBogie);

    }

}

package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
 String []bigBang= new String[5];



        String Sheldon;
        String Penny;
        String Howard;
        String Leonard;
        String Dave;



        bigBang[0]="Sheldon";
        bigBang[1]="Penny";
        bigBang[2]="Howard";
        bigBang[3]="Leonard";
        bigBang[4]="dave";
//String[] bigBang= {"Sheldon","Penny", "Howard", "Leonard"};

        System.out.println(bigBang[0]);
        System.out.println(bigBang[1]);
        System.out.println(bigBang[2]);
        System.out.println(bigBang[3]);

        for(int i=0; i< bigBang.length;i++){
            System.out.println(bigBang[i]);

        }

//        bigBang.add("Dave");
//        Collections.addAll(bigBang,"Dave");
//        System.out.println(bigBang);
//        bigBang <String> updatablelist= new bigBang <String>();

    }
}

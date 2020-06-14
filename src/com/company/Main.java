package com.company;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Home[] h= new Home[2];
        Comparator<Home> homeComparable = new HomeRomsComparator().thenComparing(new HomeSizeComparator());
        TreeSet<Home> homes = new TreeSet<>(homeComparable);
        for (Home home : h) {
            homes.add(new Home(scn.nextInt(), scn.nextInt(), scn.nextInt()));
        }
        for (Home home : homes) {
            System.out.println(home.getRoms() + " " + home.getSquare() + " ");
        }
    }
}

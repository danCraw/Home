package com.company;

import java.util.Comparator;

class HomePriceComparator implements Comparator<Home> {

    public int compare(Home a, Home b){

        if(a.getPrice()> b.getPrice())
            return 1;
        else if(a.getPrice()< b.getPrice())
            return -1;
        else
            return 0;
    }
}
    class HomeSizeComparator implements Comparator<Home> {

        public int compare(Home a, Home b){

            if(a.getSquare()> b.getSquare())
                return 1;
            else if(a.getSquare()< b.getSquare())
                return -1;
            else
                return 0;
        }

    }
class HomeRomsComparator implements Comparator<Home> {

    public int compare(Home a, Home b){

        if(a.getRoms()> b.getRoms())
            return -1;
        else if(a.getRoms()< b.getRoms())
            return 1;
        else
            return 0;
    }

}

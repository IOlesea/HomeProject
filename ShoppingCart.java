package com.company;

public class ShoppingCart {

    static void calcDiscount(String typeCustom, int total) {
        if (typeCustom == "Nonprofits") {
            if (total > 900) {
                System.out.println("You get a 10% discount");
            } else {
                System.out.println("You get a 5% discount");
            }
        }
        else if (typeCustom == "Private") {
                if (total > 900) {
                    System.out.println("You get a 7% discount");
                 } else {
                    System.out.println("You get a 0% discount");
                }
        }
        else if (typeCustom == "Corporations") {
                if (total < 500) {
                    System.out.println("You get a 8% discount");
                } else {
                    System.out.println("You get a 5% discount");
                }
        }
    }
}
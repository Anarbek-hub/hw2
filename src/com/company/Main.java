package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int age = 16;
        int temperature = 20;
        boolean isRainy = false;
        if ((isRainy || temperature < 10) && (age < 18)) {
            System.out.println("не выходи на улицу");
        } else if ((!isRainy || temperature > 10) && (age < 18)){
            System.out.println("Можно идти гулять!");
        }
    }
}

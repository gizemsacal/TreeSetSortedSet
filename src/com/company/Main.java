package com.company;

import java.util.SortedSet;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {
        // TreeSet kullanarak SortedSet oluşturma
        SortedSet<Integer> numbers = new TreeSet<>();

        // Sete eleman ekle
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("SortedSet: " + numbers);

        //
        //Öğeye erişin
        int firstNumber = numbers.first();
        System.out.println("First Number: " + firstNumber);

        int lastNumber = numbers.last();
        System.out.println("Last Number: " + lastNumber);

        // Remove elements
        boolean result = numbers.remove(2);
        System.out.println("2 sayısı kaldırıldı mı? " + result);
    }
}

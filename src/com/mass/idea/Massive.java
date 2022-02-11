package com.mass.idea;

public class Massive {
    public static void main(String[] args) {
    int [] mass = new int[] {12, 24, 36, 48, 60};
    int length = mass.length;
        System.out.println("Количество элементов в массиве = " + mass.length);
    int first = mass[0];
    mass[0] = mass[4];
    mass[4] = first;
    int last =  mass[mass.length - 1];
    int middle = mass[mass.length - 3];
    System.out.println("Сумма первого и последего элемента = " + (last + middle));
    }
}

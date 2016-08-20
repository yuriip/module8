package ua.goit.java;

import ua.goit.java.flower.*;
import ua.goit.java.service.PrintCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Flower> flowersNoSorted = new HashSet<>();
        flowersNoSorted.add(new RoseFlower("rose", "red"));
        flowersNoSorted.add(new TulipFlower("tulip", "yellow"));
        flowersNoSorted.add(new DaisyFlower("daisy", "white"));
        flowersNoSorted.add(new DaisyFlower("some strange flower with long name", "peach-white with dots"));
        flowersNoSorted.add(new AstraFlower("astra", "pink"));

        Set<Flower> flowersSorted = new TreeSet<>(flowersNoSorted);

        PrintCollection printCollection = new PrintCollection();

        System.out.println("1. Распечатка коллекции на экран");
        printCollection.print(flowersNoSorted);
        System.out.println();

        System.out.println("2. Распечатка упорядоченного списока объектов на экран");
        printCollection.print(flowersSorted);
    }
}

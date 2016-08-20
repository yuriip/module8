package ua.goit.java;

import ua.goit.java.flower.*;
import ua.goit.java.service.PrintCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Flower> flowerHashSet = new HashSet<>();
        flowerHashSet.add(new RoseFlower("rose", "red"));
        flowerHashSet.add(new TulipFlower("tulip", "yellow"));
        flowerHashSet.add(new DaisyFlower("daisy", "white"));
        flowerHashSet.add(new DaisyFlower("daisy", "white"));
        flowerHashSet.add(new AstraFlower("astra", "pink"));

        Set<Flower> flowerTreeSet = new TreeSet<>();
        flowerTreeSet.add(new RoseFlower("rose", "red"));
        flowerTreeSet.add(new TulipFlower("tulip", "yellow"));
        flowerTreeSet.add(new DaisyFlower("daisy", "white"));
        flowerTreeSet.add(new DaisyFlower("daisy", "white"));
        flowerTreeSet.add(new AstraFlower("astra", "pink"));

        PrintCollection printCollection = new PrintCollection();

        System.out.println("1. Распечатка коллекции на экран");
        printCollection.print(flowerHashSet);
        System.out.println();

        System.out.println("2. Распечатка упорядоченного списока объектов на экран");
        printCollection.print(flowerTreeSet);
    }
}

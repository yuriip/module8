package ua.goit.java;

import ua.goit.java.enums.TypeFlowers;
import ua.goit.java.flower.*;
import ua.goit.java.service.PrintCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Flower> flowerHashSet = new HashSet<>();
        flowerHashSet.add(new RoseFlower(TypeFlowers.ROSE.toString().toLowerCase(), "red"));
        flowerHashSet.add(new TulipFlower(TypeFlowers.TULIP.toString().toLowerCase(), "yellow"));
        flowerHashSet.add(new DaisyFlower(TypeFlowers.DAISY.toString().toLowerCase(), "white"));
        flowerHashSet.add(new DaisyFlower(TypeFlowers.DAISY.toString().toLowerCase(), "white"));
        flowerHashSet.add(new AstraFlower(TypeFlowers.ASTRA.toString().toLowerCase(), "pink"));

        Set<Flower> flowerTreeSet = new TreeSet<>();
        flowerTreeSet.add(new RoseFlower(TypeFlowers.ROSE.toString().toLowerCase(), "red"));
        flowerTreeSet.add(new TulipFlower(TypeFlowers.TULIP.toString().toLowerCase(), "yellow"));
        flowerTreeSet.add(new DaisyFlower(TypeFlowers.DAISY.toString().toLowerCase(), "white"));
        flowerTreeSet.add(new DaisyFlower(TypeFlowers.DAISY.toString().toLowerCase(), "white"));
        flowerTreeSet.add(new AstraFlower(TypeFlowers.ASTRA.toString().toLowerCase(), "pink"));

        ArrayList<Flower> flowerArrayList = new ArrayList<>(flowerTreeSet);

        PrintCollection printCollection = new PrintCollection();

        System.out.println("1. Распечатка коллекции на экран");
        printCollection.print(flowerHashSet);
        System.out.println();

        System.out.println("2. Распечатка упорядоченного списока объектов на экран");
        printCollection.print(flowerArrayList);
    }
}

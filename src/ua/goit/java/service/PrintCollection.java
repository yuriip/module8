package ua.goit.java.service;

import ua.goit.java.flower.Flower;

import java.util.Collection;
import java.util.Iterator;

public class PrintCollection {
    public void print(Collection<Flower> collection) {
        Iterator<Flower> iterator = collection.iterator();

        while (iterator.hasNext()) {
            Flower flower = iterator.next();
            System.out.println("|" + flower.getName() + "|" + flower.getColor());
        }
    }
}

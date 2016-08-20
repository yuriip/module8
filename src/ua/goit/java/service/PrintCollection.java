package ua.goit.java.service;

import java.util.Collection;
import java.util.Iterator;

public class PrintCollection {
    public void print(Collection collection) {
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next().toString();
            System.out.print("|");
            String allFields[] = str.split(", ");
            for (String s : allFields) {
                System.out.print(s + "|");
            }
            System.out.println();
        }
    }
}

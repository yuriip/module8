package ua.goit.java.service;

import ua.goit.java.flower.Flower;

import java.util.Collection;

public class PrintCollection {
    private final static int TO_BORDER = 3;

    public void print(Collection<Flower> collection) {
        int maxLengthName = 0;
        int maxLengthColor = 0;
        int toBorder = 3;

        for (Flower f : collection) {
            if (maxLengthName < f.getName().length()) {
                maxLengthName = f.getName().length();
            }

            if (maxLengthColor < f.getColor().length()) {
                maxLengthColor = f.getColor().length();
            }
        }

        int lengthLine = maxLengthName + maxLengthColor + TO_BORDER * TO_BORDER;

        String line = new String(new char[lengthLine]).replace("\0", "-");

        System.out.println(line);
        String stringFormat = "|%-" + (maxLengthName + toBorder) + "s|%-" + (maxLengthColor + toBorder) + "s|\n";
        System.out.printf(stringFormat, "NAME", "COLOR");
        System.out.println(line);

        for (Flower f : collection) {

            System.out.printf(stringFormat, f.getName(), f.getColor());
            System.out.println(line);
        }
    }
}

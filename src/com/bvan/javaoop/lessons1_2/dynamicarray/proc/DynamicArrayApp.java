package com.bvan.javaoop.lessons1_2.dynamicarray.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DynamicArrayApp {

    public static void main(String[] args) {
        int[] elems = readClientElemsFromConsole();
        int sum = ArrayUtils.sum(elems);

        System.out.println(Arrays.toString(elems));
        System.out.println("sum = " + sum);
        System.out.println("Goodbye");
    }

    private static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int[] elems = new int[0];

        int n = readClientElem(scanner); // Ctrl + Alt + M
        while (n != 0) {
            elems = addLastElem(elems, n);

            n = readClientElem(scanner);
        }
        return elems;
    }

    public static int readClientElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Illegal input");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }

    public static int[] addLastElem(int[] elems, int n) {
        int[] newElems = new int[elems.length + 1];
        for (int i = 0; i < elems.length; i++) {
            newElems[i] = elems[i];
        }
        newElems[newElems.length - 1] = n;
        elems = newElems;
        return elems;
    }
}

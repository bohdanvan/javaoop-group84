package com.bvan.javaoop.lessons5_6.abstractclass;

/**
 * @author bvanchuhov
 */
public class SpecialListRunner {

    public static void main(String[] args) {
        SpecialList specialList = new SpecialList();
        System.out.println(specialList.get(5));

        for (Object o : specialList) {
            System.out.println(o);
        }
    }
}

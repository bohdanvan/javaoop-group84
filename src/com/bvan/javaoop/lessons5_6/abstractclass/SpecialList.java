package com.bvan.javaoop.lessons5_6.abstractclass;

import java.util.AbstractList;

/**
 * @author bvanchuhov
 */
public class SpecialList extends AbstractList {

    @Override
    public Object get(int index) {
        return 1;
    }

    @Override
    public int size() {
        return 10;
    }
}

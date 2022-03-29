package com.gaziev.patterns.behavioral.iterator;

import java.util.ArrayList;

public class MyCollection implements Collections, Iterator {
    ArrayList<Object> arr = new ArrayList<Object>();
    int index = 0;

    @Override
    public boolean add(Object obj) {
        return arr.add(obj);
    }

    @Override
    public boolean remove(Object obj) {
        return arr.remove(obj);
    }

    @Override
    public boolean hasNext() {
        if (index == arr.size()) {
            index = 0;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object getNext() {
        Object o = arr.get(index);
        index++;
        return o;
    }

}

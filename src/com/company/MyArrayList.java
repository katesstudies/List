package com.company;

import java.util.Objects;

/**
 * Created by Катя on 10.02.2015.
 */
public class MyArrayList {
    private int internalSize = 0;
    private Object[] elements = new Object[16];


    public void add(Object o) {
        if (internalSize == elements.length){
            Object[] temp = new Object[internalSize*2];
            System.arraycopy(elements, 0, temp, 0, internalSize);
            elements = temp;
        }
            elements[internalSize] = o;
            internalSize++;
    }

    public int size() {
        return internalSize;
    }

    public boolean isEmpty() {
        return internalSize == 0 ;
    }

    public Object get(int i) {
        return elements[i];
    }

    public Object remove(int i) {
        Object temp = elements[i];
        for (; i < (internalSize - 1); i++)
            elements[i] = elements [i+1];
        internalSize--;
        elements[internalSize] = null;
        return temp;
    }

    public void clear() {
        for (int i = 0; i < internalSize; i++)
            elements[i] = null;
        internalSize = 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < internalSize; i++){
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }
}

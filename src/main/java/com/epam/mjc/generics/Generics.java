package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public List<List<String>> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    public <T> T genericMethod(T data) {
        return data;
    }

    public <T> void cloneMethod(List<? super T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

}

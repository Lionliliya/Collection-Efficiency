package com.company;

import java.util.*;

public class ListEfficiencyImplementation implements ListEfficiency {


    @Override
    public long addToCollection(List<CollectionElement> list, int amountOfElement) {
        populateCollection(list, amountOfElement);
        long start = System.currentTimeMillis();
        list.add(amountOfElement / 3, new CollectionElement(amountOfElement + 1));
        return System.currentTimeMillis() - start;
    }

    @Override
    public long getFromCollectionByIndex(List<CollectionElement> list, int amountOfElement) {
        populateCollection(list, amountOfElement);
        long start = System.currentTimeMillis();
        CollectionElement element = list.get(amountOfElement / 3);
        return System.currentTimeMillis() - start;
    }

    @Override
    public long removeFromCollectionByIndex(List<CollectionElement> list, int amountOfElement) {
        populateCollection(list, amountOfElement);
        long start = System.currentTimeMillis();
        CollectionElement element = list.remove(amountOfElement / 2 + amountOfElement / 3);
        return System.currentTimeMillis() - start;
    }

    @Override
    public long containsValue(List<CollectionElement> list, int amountOfElement) {
        populateCollection(list, amountOfElement);
        long start = System.currentTimeMillis();
        boolean find = list.contains(amountOfElement / 3);
        return System.currentTimeMillis() - start;
    }

    @Override
    public long populateCollection(List<CollectionElement> list, int amountOfElement) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < amountOfElement; i++) {
            list.add(new CollectionElement(i));
        }
        return System.currentTimeMillis() - start;
    }

    @Override
    public long iteratorAdd(List<CollectionElement> list, int amountOfElement) {
        populateCollection(list, amountOfElement);
        ListIterator iterator = list.listIterator();
        long start = System.currentTimeMillis();

        while (iterator.hasNext()) {
            if (((CollectionElement) iterator.next()).getNumber() % 2 == 0) {
                iterator.add(new CollectionElement(777));
            }
        }
        return System.currentTimeMillis() - start;
    }

    @Override
    public long iteratorRemove(List<CollectionElement> list, int amountOfElement) {
        populateCollection(list, amountOfElement);
        ListIterator iterator = list.listIterator();

        long start = System.currentTimeMillis();

        while (iterator.hasNext()) {
            if (((CollectionElement) iterator.next()).getNumber() % 2 == 0) {
                iterator.remove();
            }
        }
        return System.currentTimeMillis() - start;
    }

    @Override
    public long addToCollectionAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements) {
        int sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += addToCollection(list, amountOfElements);
            list.clear();
        }
        return sumTime / amountOfIterations;
    }

    @Override
    public long getFromCollectionByIndexAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElement) {
        int sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += getFromCollectionByIndex(list, amountOfElement);
            list.clear();
        }
        return sumTime / amountOfIterations;
    }

    @Override
    public long removeFromCollectionByIndexAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements) {
        int sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += removeFromCollectionByIndex(list, amountOfElements);
            list.clear();
        }
        return sumTime / amountOfIterations;
    }

    @Override
    public long containsValueAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements) {
        int sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += containsValue(list, amountOfElements);
            list.clear();
        }
        return sumTime / amountOfIterations;
    }

    @Override
    public long populateCollectionAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements) {
        int sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += populateCollection(list, amountOfElements);
            list.clear();
        }
        return sumTime / amountOfIterations;
    }

    @Override
    public long iteratorAddAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements) {
        int sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += iteratorAdd(list, amountOfElements);
            list.clear();
        }
        return sumTime / amountOfIterations;
    }

    @Override
    public long iteratorRemoveAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements) {
        int sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += iteratorRemove(list, amountOfElements);
            list.clear();
        }
        return sumTime / amountOfIterations;
    }
}
package com.company;

import java.util.Set;

public class SetEfficiencyImplementation implements SetEfficiency {


    @Override
    public long addToCollection(Set<CollectionElement> set, int amountOfElement) {
        populateCollection(set, amountOfElement);
        long startTime = System.currentTimeMillis();
        set.add(new CollectionElement(amountOfElement + 1));
        return System.currentTimeMillis() - startTime;
    }

    @Override
    public long removeValue(Set<CollectionElement> set, int amountOfElement) {
        populateCollection(set, amountOfElement);
        long startTime = System.currentTimeMillis();
        set.remove(new CollectionElement(amountOfElement / 3));
        return System.currentTimeMillis() - startTime;
    }

    @Override
    public long containsValue(Set<CollectionElement> set, int amountOfElement) {
        populateCollection(set, amountOfElement);
        long startTime = System.currentTimeMillis();
        set.contains(new CollectionElement(amountOfElement / 3));
        return System.currentTimeMillis() - startTime;
    }

    @Override
    public long populateCollection(Set<CollectionElement> set, int amountOfElement) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < amountOfElement; i++) {
            set.add(new CollectionElement(i));
        }
        return System.currentTimeMillis() - startTime;
    }

    @Override
    public long addToCollectionAverage(Set<CollectionElement> set, int amountOfIterations, int amountOfElements) {
        long sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += addToCollection(set, amountOfElements);
            set.clear();
        }
        return sumTime / amountOfIterations;
    }

    @Override
    public long removeValueAverage(Set<CollectionElement> set, int amountOfIterations, int amountOfElements) {
        long sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += removeValue(set, amountOfElements);
            set.clear();
        }
        return sumTime / amountOfIterations;
    }

    @Override
    public long containsValueAverage(Set<CollectionElement> set, int amountOfIterations, int amountOfElements) {
        long sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += containsValue(set, amountOfElements);
            set.clear();
        }
        return sumTime / amountOfIterations;
    }

    @Override
    public long populateCollectionAverage(Set<CollectionElement> set, int amountOfIterations, int amountOfElements) {
        long sumTime = 0;
        for (int i = 0; i < amountOfIterations; i++) {
            sumTime += populateCollection(set, amountOfElements);
            set.clear();
        }
        return sumTime / amountOfIterations;
    }
}

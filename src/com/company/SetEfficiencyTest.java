package com.company;

import java.util.Set;

public interface SetEfficiencyTest {

    public long addToCollection(Set<CollectionElement> set, int amountOfElement);

    public long removeValue(Set<CollectionElement> set, int amountOfElement);

    public long containsValue(Set<CollectionElement> set, int amountOfElement);

    public long populateCollection(Set<CollectionElement> set, int amountOfElement);

    public long addToCollectionAverage(Set<CollectionElement> set, int amountOfIterations, int amountOfElements);

    public long removeValueAverage(Set<CollectionElement> set, int amountOfIterations, int amountOfElements);

    public long containsValueAverage(Set<CollectionElement> set, int amountOfIterations, int amountOfElements);

    public long populateCollectionAverage(Set<CollectionElement> set, int amountOfIterations, int amountOfElements);
}

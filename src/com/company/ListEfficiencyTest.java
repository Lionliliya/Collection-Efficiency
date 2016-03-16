package com.company;

import java.util.List;

public interface ListEfficiencyTest {

    public long addToCollection(List<CollectionElement> list, int amountOfElement);

    public long getFromCollectionByIndex(List<CollectionElement> list, int amountOfElement);

    public long removeFromCollectionByIndex(List<CollectionElement> list, int amountOfElement);

    public long containsValue(List<CollectionElement> list, int amountOfElement);

    public long populateCollection(List<CollectionElement> list, int amountOfElement);

    public long iteratorAdd(List<CollectionElement> list, int amountOfElement);

    public long iteratorRemove(List<CollectionElement> list, int amountOfElement);

    public long addToCollectionAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements);

    public long getFromCollectionByIndexAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElement);

    public long removeFromCollectionByIndexAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements);

    public long containsValueAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements);

    public long populateCollectionAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements);

    public long iteratorAddAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements);

    public long iteratorRemoveAverage(List<CollectionElement> list, int amountOfIterations, int amountOfElements);


}

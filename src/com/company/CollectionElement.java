package com.company;

public class CollectionElement implements Comparable {

    private int number;

    public CollectionElement(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CollectionElement element = (CollectionElement) o;

        if (number != element.number) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return number;
    }


    @Override
    public int compareTo(Object o) {
        CollectionElement element = (CollectionElement) o;
        if (this.getNumber() == element.getNumber())
            return 0;
        if (this.getNumber() > element.getNumber())
            return 1;
        else return -1;
    }
}

package com.company;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        SetTest setTest = new SetTest();
        ListTest listTest = new ListTest();

        long addToArrayList10K = listTest.addToCollectionAverage(new ArrayList<>(), 100, 10_000);
        long addToArrayList100K = listTest.addToCollectionAverage(new ArrayList<>(), 100, 100_000);
    //    long addToArrayList1000K = listTest.addToCollectionAverage(new ArrayList<>(), 100, 1_000_000);

        long getByIndexArrayList10K = listTest.getFromCollectionByIndexAverage(new ArrayList<>(), 100, 10_000);
        long getByIndexArrayList100K = listTest.getFromCollectionByIndexAverage(new ArrayList<>(), 100, 100_000);
     //   long getByIndexArrayList1000K = listTest.getFromCollectionByIndexAverage(new ArrayList<>(), 100, 1_000_000);

        long removeArrayList10K = listTest.removeFromCollectionByIndexAverage(new ArrayList<>(), 100, 10_000);
        long removeArrayList100K = listTest.removeFromCollectionByIndexAverage(new ArrayList<>(), 100, 100_000);
    //    long removeArrayList1000K = listTest.removeFromCollectionByIndexAverage(new ArrayList<>(), 100, 1_000_000);

        long containsArrayList10K = listTest.containsValueAverage(new ArrayList<>(), 100, 10_000);
        long containsArrayList100K = listTest.containsValueAverage(new ArrayList<>(), 100, 100_000);
    //    long containsArrayList1000K = listTest.containsValueAverage(new ArrayList<>(), 100, 1_000_000);

        long populateArrayList10K = listTest.populateCollectionAverage(new ArrayList<>(), 100, 10_000);
        long populateArrayList100K = listTest.populateCollectionAverage(new ArrayList<>(), 100, 100_000);
    //    long populateArrayList1000K = listTest.populateCollectionAverage(new ArrayList<>(), 100, 1_000_000);

        long iteratorAddArrayList10K = listTest.iteratorAddAverage(new ArrayList<>(), 100, 10_000);
        long iteratorAddArrayList100K = listTest.iteratorAddAverage(new ArrayList<>(), 100, 100_000);
    //    long iteratorAddArrayList1000K = listTest.iteratorAddAverage(new ArrayList<>(), 100, 1_000_000);

        long iteratorRMArrayList10K = listTest.iteratorRemoveAverage(new ArrayList<>(), 100, 10_000);
        long iteratorRMArrayList100K = listTest.iteratorRemoveAverage(new ArrayList<>(), 100, 100_000);
    //    long iteratorRMArrayList1000K = listTest.iteratorRemoveAverage(new ArrayList<>(), 100, 1_000_000);

        long addToLinkedList10K = listTest.addToCollectionAverage(new LinkedList<>(), 100, 10_000);
        long addToLinkedList100K = listTest.addToCollectionAverage(new LinkedList<>(), 100, 100_000);
    //    long addToLinkedList1000K = listTest.addToCollectionAverage(new LinkedList<>(), 100, 1_000_000);

        long getByIndexLinkedList10K = listTest.getFromCollectionByIndexAverage(new LinkedList<>(), 100, 10_000);
        long getByIndexLinkedList100K = listTest.getFromCollectionByIndexAverage(new LinkedList<>(), 100, 100_000);
    //    long getByIndexLinkedList1000K = listTest.getFromCollectionByIndexAverage(new LinkedList<>(), 100, 1_000_000);

        long removeLinkedList10K = listTest.removeFromCollectionByIndexAverage(new LinkedList<>(), 100, 10_000);
        long removeLinkedList100K = listTest.removeFromCollectionByIndexAverage(new LinkedList<>(), 100, 100_000);
    //    long removeLinkedList1000K = listTest.removeFromCollectionByIndexAverage(new LinkedList<>(), 100, 1_000_000);

        long containsLinkedList10K = listTest.containsValueAverage(new LinkedList<>(), 100, 10_000);
        long containsLinkedList100K = listTest.containsValueAverage(new LinkedList<>(), 100, 100_000);
    //    long containsLinkedList1000K = listTest.containsValueAverage(new LinkedList<>(), 100, 1_000_000);

        long populateLinkedList10K = listTest.populateCollectionAverage(new LinkedList<>(), 100, 10_000);
        long populateLinkedList100K = listTest.populateCollectionAverage(new LinkedList<>(), 100, 100_000);
    //    long populateLinkedList1000K = listTest.populateCollectionAverage(new LinkedList<>(), 100, 1_000_000);

        long iteratorAddLinkedList10K = listTest.iteratorAddAverage(new LinkedList<>(), 100, 10_000);
        long iteratorAddLinkedList100K = listTest.iteratorAddAverage(new LinkedList<>(), 100, 100_000);
    //    long iteratorAddLinkedList1000K = listTest.iteratorAddAverage(new LinkedList<>(), 100, 1_000_000);

        long iteratorRMLinkedList10K = listTest.iteratorRemoveAverage(new LinkedList<>(), 100, 10_000);
        long iteratorRMLinkedList100K = listTest.iteratorRemoveAverage(new LinkedList<>(), 100, 100_000);
    //    long iteratorRMlinkedList1000K = listTest.iteratorRemoveAverage(new LinkedList<>(), 100, 1_000_000);

        long addHashSet10K = setTest.addToCollectionAverage(new HashSet<>(), 100, 10_000);
        long addHashSet100K = setTest.addToCollectionAverage(new HashSet<>(), 100, 100_000);
      //  long addHashSet1000K = setTest.addToCollectionAverage(new HashSet<>(), 100, 1_000_000);

        long removeHashSet10k = setTest.removeValueAverage(new HashSet<>(), 100, 10_000);
        long removeHashSet100k = setTest.removeValueAverage(new HashSet<>(), 100, 100_000);
     //   long removeHashSet1000k = setTest.removeValueAverage(new HashSet<>(), 100, 1_000_000);

        long addTreeSet10K = setTest.addToCollectionAverage(new TreeSet<>(), 100, 10_000);
        long addTreeSet100K = setTest.addToCollectionAverage(new TreeSet<>(), 100, 100_000);
     //   long addTreeSet1000K = setTest.addToCollectionAverage(new TreeSet<>(), 100, 1_000_000);

        long removeTreeSet10k = setTest.removeValueAverage(new TreeSet<>(), 100, 10_000);
        long removeTreeSet100k = setTest.removeValueAverage(new TreeSet<>(), 100, 100_000);
      //  long removeTreeSet1000k = setTest.removeValueAverage(new TreeSet<>(), 100, 1_000_000);

        long containsHashSet10k = setTest.containsValueAverage(new HashSet<>(), 100, 10_000);
        long containsHashSet100k = setTest.containsValueAverage(new HashSet<>(), 100, 100_000);
      //  long containsHashSet1000k = setTest.containsValueAverage(new HashSet<>(), 100, 1_000_000);

        long containsTreeSet10k = setTest.containsValueAverage(new TreeSet<>(), 100, 10_000);
        long containsTreeSet100k = setTest.containsValueAverage(new TreeSet<>(), 100, 100_000);
       // long containstreeSet1000k = setTest.containsValueAverage(new TreeSet<>(), 100, 1_000_000);

        long populateHashSet10k = setTest.populateCollectionAverage(new HashSet<>(), 100, 10_000);
        long populateHashSet100k = setTest.populateCollectionAverage(new HashSet<>(), 100, 100_000);
       // long populateHashSet1000k = setTest.populateCollectionAverage(new HashSet<>(), 100, 1_000_000);

        long populateTreeSet10k = setTest.populateCollectionAverage(new TreeSet<>(), 100, 10_000);
        long populateTreeSet100k = setTest.populateCollectionAverage(new TreeSet<>(), 100, 100_000);
       // long populateTreeSet1000k = setTest.populateCollectionAverage(new TreeSet<>(), 100, 1_000_000);


        /**Write to console**/
        System.out.format("%17s%10s%16s%17s%15s%23s%25s", "add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove");
        System.out.println("\n============================================================================================================================");
        System.out.format("%1s%8s%13s%15s%15s%19s%22s%22s", "ArrayList", addToArrayList100K, getByIndexArrayList100K, removeArrayList100K, containsArrayList100K, populateArrayList100K, iteratorAddArrayList100K, iteratorRMArrayList100K);
        System.out.println();
        System.out.format("%1s%7s%13s%15s%15s%19s%22s%22s", "LinkedList", addToLinkedList100K , getByIndexLinkedList100K, removeLinkedList100K, containsLinkedList100K, populateLinkedList100K, iteratorAddLinkedList100K, iteratorRMLinkedList100K);
        System.out.println();
        System.out.format("%1s%10s%13s%15s%15s%19s", "HashSet", addHashSet100K, " ",removeHashSet100k , containsHashSet100k, populateHashSet100k);
        System.out.println();
        System.out.format("%1s%10s%13s%15s%15s%19s", "TreeSet", addTreeSet100K, " ", removeTreeSet100k, containsTreeSet100k, populateTreeSet100k) ;
        System.out.println("\n============================================================================================================================");

        /**Write to file**/
        PrintStream writeToFile = null;
        try {
            writeToFile = new PrintStream("ColletionTest10K.txt");
            writeToFile.printf("%17s%10s%16s%17s%15s%23s%25s", "add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove");
            writeToFile.printf("\n============================================================================================================================");
            writeToFile.println();
            writeToFile.printf("%1s%8s%13s%15s%15s%19s%22s%22s", "ArrayList", addToArrayList10K, getByIndexArrayList10K, removeArrayList10K, containsArrayList10K, populateArrayList10K, iteratorAddArrayList10K, iteratorRMArrayList10K);
            writeToFile.println();
            writeToFile.printf("%1s%7s%13s%15s%15s%19s%22s%22s", "LinkedList", addToLinkedList10K, getByIndexLinkedList10K, removeLinkedList10K, containsLinkedList10K, populateLinkedList10K, iteratorAddLinkedList10K, iteratorRMLinkedList10K);
            writeToFile.println();
            writeToFile.printf("%1s%10s%13s%15s%15s%19s", "HashSet", addHashSet10K, " ", removeHashSet10k, containsHashSet10k, populateHashSet10k);
            writeToFile.println();
            writeToFile.printf("%1s%10s%13s%15s%15s%19s", "TreeSet", addTreeSet10K, " ", removeTreeSet10k, containsTreeSet10k, populateTreeSet10k);
            writeToFile.printf("\n============================================================================================================================");


            writeToFile = new PrintStream("CollectionTest100K");
            writeToFile.printf("%17s%10s%16s%17s%15s%23s%25s", "add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove");
            writeToFile.printf("\n============================================================================================================================");
            writeToFile.println();
            writeToFile.printf("%1s%8s%13s%15s%15s%19s%22s%22s", "ArrayList", addToArrayList100K, getByIndexArrayList100K, removeArrayList100K, containsArrayList100K, populateArrayList100K, iteratorAddArrayList100K, iteratorRMArrayList100K);
            writeToFile.println();
            writeToFile.printf("%1s%7s%13s%15s%15s%19s%22s%22s", "LinkedList", addToLinkedList100K, getByIndexLinkedList100K, removeLinkedList100K, containsLinkedList100K, populateLinkedList100K, iteratorAddLinkedList100K, iteratorRMLinkedList100K);
            writeToFile.println();
            writeToFile.printf("%1s%10s%13s%15s%15s%19s", "HashSet", addHashSet100K, " ", removeHashSet100k, containsHashSet100k, populateHashSet100k);
            writeToFile.println();
            writeToFile.printf("%1s%10s%13s%15s%15s%19s", "TreeSet", addTreeSet100K, " ", removeTreeSet100k, containsTreeSet100k, populateTreeSet100k);
            writeToFile.printf("\n============================================================================================================================");

            writeToFile = new PrintStream("CollectionTest1000K");
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (writeToFile != null) writeToFile.flush();
        }

    }
}

package com.github.aparsons.fink.util;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;


public class MinHashTest {

    @Test
    public void testMinHash() {
        Set<String> set1 = new HashSet<String>();
        set1.add("Gul");
        set1.add("Donnchad");
        set1.add("gull.donnchad@fake.com");

        Set<String> set2 = new HashSet<String>();
        set2.add("Darragh");
        set2.add("Eustathios");
        set2.add("aul");
        set2.add("aonnchad");
        set2.add("darragh.eustathios@fake.com");

        MinHash<String> minHash = new MinHash<String>(set1.size() + set2.size());
        System.out.println(minHash.similarity(set1, set2));
    }

}

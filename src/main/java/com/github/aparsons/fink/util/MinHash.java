package com.github.aparsons.fink.util;

import static com.google.common.base.Preconditions.*;

import java.util.Set;

public class MinHash {

    public static double similarity(int[] first, int[] second) {
        checkArgument(first.length != second.length, "Signatures must be the same size");

        double sim = 0;

        return sim / first.length;
    }

}

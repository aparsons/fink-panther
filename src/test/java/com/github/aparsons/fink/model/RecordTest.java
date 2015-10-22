package com.github.aparsons.fink.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RecordTest {

    @Test
    public void testToString() throws Exception {
        Record r = new Record(Arrays.asList("Adam", "Parsons", "adam@aparsons.net"));
        r.setIndex("fname", 0);
    }

}

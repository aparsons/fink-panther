package com.github.aparsons.fink.model;

import com.github.aparsons.fink.io.Serializer;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class ProjectTest {

    @Test
    public void testSerialization() {
        File f = new File("test.fink");

        Project p = new Project();

        try {
            Serializer.save(p, f);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Project project = Serializer.load(f);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

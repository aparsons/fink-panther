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

        System.out.println(p.getFile().isPresent());

        try (FileOutputStream fos = new FileOutputStream(f)) {
            Serializer.serialize(p, fos);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Project in;
        try (FileInputStream fis = new FileInputStream(f)) {
            in = Serializer.deserialize(fis);
        } catch (IOException cnfe) {
            cnfe.printStackTrace();
        }

    }

}

package com.github.aparsons.fink.io;

import com.github.aparsons.fink.exception.SerializationException;

import static com.google.common.base.Preconditions.*;

import java.io.*;

public class Serializer {

    public static void serialize(final Serializable obj, final OutputStream os) {
        checkNotNull(os);
        try (ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(obj);
        } catch (IOException ioe) {
            throw new SerializationException(ioe);
        }
    }

    public static byte[] serialize(final Serializable obj) {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream(512);
        serialize(obj, baos);
        return baos.toByteArray();
    }

    public static <T> T deserialize(final InputStream is) {
        checkNotNull(is);
        try (ObjectInputStream ois = new ObjectInputStream(is)) {
            @SuppressWarnings("unchecked")
            final T obj = (T) ois.readObject();
            return obj;
        } catch (ClassCastException | ClassNotFoundException | IOException e) {
            throw new SerializationException(e);
        }
    }

    public static <T> T deserialize(final byte[] bytes) {
        checkNotNull(bytes);
        return Serializer.<T>deserialize(new ByteArrayInputStream(bytes));
    }

    public static <T extends Serializable> void save(T obj, File file) throws IOException {
        checkNotNull(obj);
        checkNotNull(file);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            Serializer.serialize(obj, fos);
        }
    }

    public static <T> T load(File file) throws IOException {
        checkNotNull(file);
        try (FileInputStream fis = new FileInputStream(file)) {
            return Serializer.deserialize(fis);
        }
    }

}



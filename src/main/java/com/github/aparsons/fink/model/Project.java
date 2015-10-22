package com.github.aparsons.fink.model;

import static com.google.common.base.Preconditions.*;

import com.github.aparsons.fink.exception.SerializationException;
import com.github.aparsons.fink.io.Serializer;
import com.google.common.base.Optional;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

public class Project implements Serializable {

    private Configuration configuration = new Configuration();
    private Optional<File> file = Optional.absent();

    public Project() {
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        checkNotNull(configuration);
        this.configuration = configuration;
    }

    public Optional<File> getFile() {
        return file;
    }

    public void setFile(File file) {
        checkNotNull(file);
        this.file = Optional.of(file);
    }

    public static Project load(File file) throws IOException, SerializationException {
        checkNotNull(file);
        Project project;
        try (FileInputStream fis = new FileInputStream(file)) {
            project = Serializer.deserialize(fis);
        }
        return project;
    }


}

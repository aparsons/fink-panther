package com.github.aparsons.fink.model;

import com.google.common.base.MoreObjects;

import static com.google.common.base.Preconditions.*;

import java.io.*;

public class Project implements Serializable {

    private Configuration configuration = new Configuration();

    public Project() {
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        checkNotNull(configuration);

        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("configuration", configuration)
            .toString();
    }
}

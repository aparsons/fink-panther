package com.github.aparsons.fink.model;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

public class Configuration implements Serializable {

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .toString();
    }

}

package com.github.aparsons.fink.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;

import java.io.Serializable;
import java.util.List;

import static com.google.common.base.Preconditions.*;

public class Index implements Serializable {

    private final List<String> values;
    private final int index;

    public Index(List<String> values, int index) {
        checkNotNull(values);
        checkArgument(index >= 0);
        checkElementIndex(index, values.size());

        this.values = values;
        this.index = index;
    }

    public List<String> getValues() {
        return values;
    }

    public int getIndex() {
        return index;
    }

    public Optional<String> getValue() {
        if (index < values.size()) {
            return Optional.of(values.get(index));
        } else {
            return Optional.absent();
        }
    }

    public void setValue(String value) {
        checkElementIndex(index, values.size());
        values.set(index, value);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("index", index)
            .toString();
    }
}

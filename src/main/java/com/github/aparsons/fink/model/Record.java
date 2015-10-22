package com.github.aparsons.fink.model;

import static com.google.common.base.Preconditions.*;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Record implements Serializable {

    private List<String> values = Lists.newArrayList();
    private Map<String, Index> indices = Maps.newHashMap();

    public Record() {
    }

    public Record(List<String> values) {
        setValues(values);
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        checkNotNull(values);
        this.values = values;
    }

    public Map<String, Index> getIndices() {
        return indices;
    }

    public void setIndices(Map<String, Index> indices) {
        checkNotNull(indices);
        this.indices = indices;
    }

    protected Optional<String> getIndexValue(String key) {
        return indices.get(key).getValue();
    }

    protected Optional<Integer> getIndex(String key) {
        if (indices.containsKey(key)) {
            return Optional.of(indices.get(key).getIndex());
        } else {
            return Optional.absent();
        }
    }

    protected void setIndex(String key, int index) {
        checkArgument(index >= 0);
        checkElementIndex(index, values.size());
        indices.put(key, new Index(values, index));
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("values", values)
            .add("indices", indices)
            .toString();
    }

}

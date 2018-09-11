package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Sex object
 */
public class Sex {

    /**
     * Number of visitors
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Visitor sex
     */
    @SerializedName("value")
    private SexValue value;

    public Integer getCount() {
        return count;
    }

    public SexValue getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sex sex = (Sex) o;
        return Objects.equals(count, sex.count) &&
                value == sex.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sex{");
        sb.append("count=").append(count);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}

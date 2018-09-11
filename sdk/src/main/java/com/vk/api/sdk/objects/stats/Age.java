package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Age object
 */
public class Age {

    /**
     * Number of visitors
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Age interval
     */
    @SerializedName("value")
    private String value;

    public Integer getCount() {
        return count;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Age age = (Age) o;
        return Objects.equals(count, age.count) &&
                value == age.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Age{");
        sb.append("count=").append(count);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}

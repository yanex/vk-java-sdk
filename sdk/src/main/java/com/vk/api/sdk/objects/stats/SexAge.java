package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * SexAge object
 */
public class SexAge {

    /**
     * Number of visitors
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Sex/age interval
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
        SexAge sexAge = (SexAge) o;
        return Objects.equals(count, sexAge.count) &&
                Objects.equals(value, sexAge.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SexAge{");
        sb.append("count=").append(count);
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

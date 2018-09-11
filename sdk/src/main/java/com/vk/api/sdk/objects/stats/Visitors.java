package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Visitors object
 */
public class Visitors {

    /**
     * Number of views
     */
    @SerializedName("views")
    private Integer views;

    /**
     * Number of visitors
     */
    @SerializedName("visitors")
    private Integer visitors;

    public Integer getViews() {
        return views;
    }

    public Integer getVisitors() {
        return visitors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visitors visitors1 = (Visitors) o;
        return Objects.equals(views, visitors1.views) &&
                Objects.equals(visitors, visitors1.visitors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(views, visitors);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Visitors{");
        sb.append("views=").append(views);
        sb.append(", visitors=").append(visitors);
        sb.append('}');
        return sb.toString();
    }
}

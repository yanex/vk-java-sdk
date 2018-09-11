package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Stats object
 */
public class Stats {

    /**
     * Start period
     */
    @SerializedName("period_from")
    private String periodFrom;

    /**
     * End period
     */
    @SerializedName("period_to")
    private String periodTo;

    /**
     * Visitor statistics
     */
    @SerializedName("visitors")
    private Visitors visitors;

    /**
     * Reachability statistics
     */
    @SerializedName("reach")
    private Reach reach;

    public String getPeriodFrom() {
        return periodFrom;
    }

    public String getPeriodTo() {
        return periodTo;
    }

    public Visitors getVisitors() {
        return visitors;
    }

    public Reach getReach() {
        return reach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return Objects.equals(periodFrom, stats.periodFrom) &&
                Objects.equals(periodTo, stats.periodTo) &&
                Objects.equals(visitors, stats.visitors) &&
                Objects.equals(reach, stats.reach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodFrom, periodTo, visitors, reach);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stats{");
        sb.append("periodFrom='").append(periodFrom).append('\'');
        sb.append(", periodTo='").append(periodTo).append('\'');
        sb.append(", visitors=").append(visitors);
        sb.append(", reach=").append(reach);
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * City object
 */
public class City {

    /**
     * Number of visitors
     */
    @SerializedName("count")
    private Integer count;

    /**
     * City identifier
     */
    @SerializedName("city_id")
    private String cityId;

    /**
     * City name
     */
    @SerializedName("name")
    private String name;

    public Integer getCount() {
        return count;
    }

    public String getCityId() {
        return cityId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(count, city.count) &&
                Objects.equals(cityId, city.cityId) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, cityId, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("count=").append(count);
        sb.append(", cityId='").append(cityId).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

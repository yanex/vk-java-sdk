package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Country object
 */
public class Country {

    /**
     * Number of visitors
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Country identifier
     */
    @SerializedName("country_id")
    private String countryId;

    /**
     * Country code
     */
    @SerializedName("code")
    private String code;

    /**
     * Country name
     */
    @SerializedName("name")
    private String name;

    public Integer getCount() {
        return count;
    }

    public String getCountryId() {
        return countryId;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(count, country.count) &&
                Objects.equals(countryId, country.countryId) &&
                Objects.equals(code, country.code) &&
                Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, countryId, code, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append("count=").append(count);
        sb.append(", countryId='").append(countryId).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

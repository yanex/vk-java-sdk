package com.vk.api.sdk.objects.stats;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class Reach {

    /**
     * Overall reach
     */
    @SerializedName("reach")
    private Integer reach;

    /**
     * Subscribers reach
     */
    @SerializedName("reach_subscribers")
    private Integer reachSubscribers;

    /**
     * Mobile devices reach
     */
    @SerializedName("mobile_reach")
    private Integer mobileReach;

    /**
     * Sex statistics
     */
    @SerializedName("sex")
    private List<Sex> sex;

    /**
     * Age statistics
     */
    @SerializedName("age")
    private List<Age> age;

    /**
     * Sex/age statistics
     */
    @SerializedName("sex_age")
    private List<SexAge> sexAge;

    /**
     * City statistics
     */
    @SerializedName("cities")
    private List<City> cities;

    /**
     * Country statistics
     */
    @SerializedName("countries")
    private List<Country> countries;

    public Integer getReach() {
        return reach;
    }

    public Integer getReachSubscribers() {
        return reachSubscribers;
    }

    public Integer getMobileReach() {
        return mobileReach;
    }

    public List<Sex> getSex() {
        return sex;
    }

    public List<Age> getAge() {
        return age;
    }

    public List<SexAge> getSexAge() {
        return sexAge;
    }

    public List<City> getCities() {
        return cities;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reach reach1 = (Reach) o;
        return Objects.equals(reach, reach1.reach) &&
                Objects.equals(reachSubscribers, reach1.reachSubscribers) &&
                Objects.equals(mobileReach, reach1.mobileReach) &&
                Objects.equals(sex, reach1.sex) &&
                Objects.equals(age, reach1.age) &&
                Objects.equals(sexAge, reach1.sexAge) &&
                Objects.equals(cities, reach1.cities) &&
                Objects.equals(countries, reach1.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reach, reachSubscribers, mobileReach, sex, age, sexAge, cities, countries);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reach{");
        sb.append("reach=").append(reach);
        sb.append(", reachSubscribers=").append(reachSubscribers);
        sb.append(", mobileReach=").append(mobileReach);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", sexAge=").append(sexAge);
        sb.append(", cities=").append(cities);
        sb.append(", countries=").append(countries);
        sb.append('}');
        return sb.toString();
    }
}

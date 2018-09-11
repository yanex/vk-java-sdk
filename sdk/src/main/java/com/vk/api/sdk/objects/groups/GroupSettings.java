package com.vk.api.sdk.objects.groups;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.places.PlaceMin;

import java.util.List;
import java.util.Objects;

/**
 * GroupSettings object
 */
public class GroupSettings {
    /**
     * Community title
     */
    @SerializedName("title")
    private String title;

    /**
     * Community description
     */
    @SerializedName("description")
    private String description;

    /**
     * Community's page domain
     */
    @SerializedName("address")
    private String address;

    @SerializedName("place")
    private PlaceMin place;

    /**
     * Wall settings
     */
    @SerializedName("wall")
    private Integer wall;

    /**
     * Photos settings
     */
    @SerializedName("photos")
    private Integer photos;

    /**
     * Video settings
     */
    @SerializedName("video")
    private Integer video;

    /**
     * Audio settings
     */
    @SerializedName("audio")
    private Integer audio;

    /**
     * Docs settings
     */
    @SerializedName("docs")
    private Integer docs;

    /**
     * Topics settings
     */
    @SerializedName("topics")
    private Integer topics;

    /**
     * Wiki settings
     */
    @SerializedName("wiki")
    private Integer wiki;

    /**
     * Information whether the obscene filter is enabled
     */
    @SerializedName("obscene_filter")
    private BoolInt obsceneFilter;

    /**
     * Information whether the stopwords filter is enabled
     */
    @SerializedName("obscene_stopwords")
    private BoolInt obsceneStopwords;

    /**
     * The list of stop words
     */
    @SerializedName("obscene_words")
    private String obsceneWords;

    /**
     * Community access settings
     */
    @SerializedName("access")
    private Integer access;

    /**
     * Community subject ID
     */
    @SerializedName("subject")
    private Integer subject;

    @SerializedName("subject_list")
    private List<SubjectItem> subjectList;

    /**
     * URL of the RSS feed
     */
    @SerializedName("rss")
    private String rss;

    /**
     * Community website
     */
    @SerializedName("website")
    private String website;

    @SerializedName("events")
    private Integer events;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public PlaceMin getPlace() {
        return place;
    }

    public Integer getWall() {
        return wall;
    }

    public Integer getPhotos() {
        return photos;
    }

    public Integer getVideo() {
        return video;
    }

    public Integer getAudio() {
        return audio;
    }

    public Integer getDocs() {
        return docs;
    }

    public Integer getTopics() {
        return topics;
    }

    public Integer getWiki() {
        return wiki;
    }

    public boolean isObsceneFilter() {
        return obsceneFilter == BoolInt.YES;
    }

    public boolean isObsceneStopwords() {
        return obsceneStopwords == BoolInt.YES;
    }

    public String getObsceneWords() {
        return obsceneWords;
    }

    public Integer getAccess() {
        return access;
    }

    public Integer getSubject() {
        return subject;
    }

    public List<SubjectItem> getSubjectList() {
        return subjectList;
    }

    public String getRss() {
        return rss;
    }

    public String getWebsite() {
        return website;
    }

    public Integer getEvents() {
        return events;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, address, place, wall, photos, video, audio, docs, topics, wiki, obsceneFilter, obsceneStopwords, obsceneWords, access, subject, subjectList, rss, website, events);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupSettings that = (GroupSettings) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(address, that.address) &&
                Objects.equals(place, that.place) &&
                Objects.equals(wall, that.wall) &&
                Objects.equals(photos, that.photos) &&
                Objects.equals(video, that.video) &&
                Objects.equals(audio, that.audio) &&
                Objects.equals(docs, that.docs) &&
                Objects.equals(topics, that.topics) &&
                Objects.equals(wiki, that.wiki) &&
                obsceneFilter == that.obsceneFilter &&
                obsceneStopwords == that.obsceneStopwords &&
                Objects.equals(obsceneWords, that.obsceneWords) &&
                Objects.equals(access, that.access) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(subjectList, that.subjectList) &&
                Objects.equals(rss, that.rss) &&
                Objects.equals(website, that.website) &&
                Objects.equals(events, that.events);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupSettings{");
        sb.append("title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", place=").append(place);
        sb.append(", wall=").append(wall);
        sb.append(", photos=").append(photos);
        sb.append(", video=").append(video);
        sb.append(", audio=").append(audio);
        sb.append(", docs=").append(docs);
        sb.append(", topics=").append(topics);
        sb.append(", wiki=").append(wiki);
        sb.append(", obsceneFilter=").append(obsceneFilter);
        sb.append(", obsceneStopwords=").append(obsceneStopwords);
        sb.append(", obsceneWords='").append(obsceneWords).append('\'');
        sb.append(", access=").append(access);
        sb.append(", subject=").append(subject);
        sb.append(", subjectList=").append(subjectList);
        sb.append(", rss='").append(rss).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", events=").append(events);
        sb.append('}');
        return sb.toString();
    }
}

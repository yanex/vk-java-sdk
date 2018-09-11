package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * Photo object
 */
public class Photo {
    /**
     * Photo ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Album ID
     */
    @SerializedName("album_id")
    private Integer albumId;

    /**
     * Photo owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * ID of the user who have uploaded the photo
     */
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("sizes")
    private List<PhotoSizes> sizes;

    /**
     * Post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    /**
     * Original photo width
     */
    @SerializedName("width")
    private Integer width;

    /**
     * Original photo height
     */
    @SerializedName("height")
    private Integer height;

    /**
     * Photo caption
     */
    @SerializedName("text")
    private String text;

    /**
     * Date when uploaded
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Latitude
     */
    @SerializedName("lat")
    private Float lat;

    /**
     * Longitude
     */
    @SerializedName("long")
    private Float lng;

    /**
     * Access key for the photo
     */
    @SerializedName("access_key")
    private String accessKey;

    public Integer getId() {
        return id;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    public Integer getPostId() {
        return postId;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getText() {
        return text;
    }

    public Integer getDate() {
        return date;
    }

    public Float getLat() {
        return lat;
    }

    public Float getLng() {
        return lng;
    }

    public String getAccessKey() {
        return accessKey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, albumId, ownerId, userId, sizes, postId, width, height, text, date, lat, lng, accessKey);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Objects.equals(id, photo.id) &&
                Objects.equals(albumId, photo.albumId) &&
                Objects.equals(ownerId, photo.ownerId) &&
                Objects.equals(userId, photo.userId) &&
                Objects.equals(sizes, photo.sizes) &&
                Objects.equals(postId, photo.postId) &&
                Objects.equals(width, photo.width) &&
                Objects.equals(height, photo.height) &&
                Objects.equals(text, photo.text) &&
                Objects.equals(date, photo.date) &&
                Objects.equals(lat, photo.lat) &&
                Objects.equals(lng, photo.lng) &&
                Objects.equals(accessKey, photo.accessKey);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Photo{");
        sb.append("id=").append(id);
        sb.append(", albumId=").append(albumId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", userId=").append(userId);
        sb.append(", sizes=").append(sizes);
        sb.append(", postId=").append(postId);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", text='").append(text).append('\'');
        sb.append(", date=").append(date);
        sb.append(", lat=").append(lat);
        sb.append(", lng=").append(lng);
        sb.append(", accessKey='").append(accessKey).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

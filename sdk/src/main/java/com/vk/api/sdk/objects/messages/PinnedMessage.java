package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.Geo;

import java.util.List;
import java.util.Objects;

/**
 * Pinned message object
 */
public class PinnedMessage {
    /**
     * Message ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Date when the message has been sent in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Message author's ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Forwarded messages
     */
    @SerializedName("fwd_messages")
    private List<Message> fwdMessages;

    /**
     * Message text
     */
    @SerializedName("text")
    private String text;

    @SerializedName("attachments")
    private List<MessageAttachment> attachments;

    /**
     * location info
     */
    @SerializedName("geo")
    private Geo geo;

    public Integer getId() {
        return id;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getFromId() {
        return fromId;
    }

    public List<Message> getFwdMessages() {
        return fwdMessages;
    }

    public String getText() {
        return text;
    }

    public List<MessageAttachment> getAttachments() {
        return attachments;
    }

    public Geo getGeo() {
        return geo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PinnedMessage that = (PinnedMessage) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(date, that.date) &&
                Objects.equals(fromId, that.fromId) &&
                Objects.equals(fwdMessages, that.fwdMessages) &&
                Objects.equals(text, that.text) &&
                Objects.equals(attachments, that.attachments) &&
                Objects.equals(geo, that.geo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, fromId, fwdMessages, text, attachments, geo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PinnedMessage{");
        sb.append("id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", fromId=").append(fromId);
        sb.append(", fwdMessages=").append(fwdMessages);
        sb.append(", text='").append(text).append('\'');
        sb.append(", attachments=").append(attachments);
        sb.append(", geo=").append(geo);
        sb.append('}');
        return sb.toString();
    }
}

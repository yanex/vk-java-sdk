package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Geo;

import java.util.List;
import java.util.Objects;

/**
 * Message object
 */
public class Message {
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
     * Message receiver's ID
     */
    @SerializedName("peer_id")
    private Integer peerId;

    /**
     * Message author's ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * ID used for sending messages. It returned only for outgoing messages
     */
    @SerializedName("random_id")
    private Integer randomId;

    /**
     * Is it an important message
     */
    @SerializedName("important")
    private Boolean important;

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
     * Action
     */
    @SerializedName("action")
    private Action action;

    /**
     * location info
     */
    @SerializedName("geo")
    private Geo geo;

    /**
     * Payload for messages sent to bots
     */
    @SerializedName("payload")
    private String payload;

    public Integer getId() {
        return id;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Integer getRandomId() {
        return randomId;
    }

    public Boolean getImportant() {
        return important;
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

    public Action getAction() {
        return action;
    }

    public Geo getGeo() {
        return geo;
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, peerId, fromId, randomId, important, fwdMessages, text, attachments, action, geo, payload);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id) &&
                Objects.equals(date, message.date) &&
                Objects.equals(peerId, message.peerId) &&
                Objects.equals(fromId, message.fromId) &&
                Objects.equals(randomId, message.randomId) &&
                important == message.important &&
                Objects.equals(fwdMessages, message.fwdMessages) &&
                Objects.equals(text, message.text) &&
                Objects.equals(attachments, message.attachments) &&
                Objects.equals(action, message.action) &&
                Objects.equals(geo, message.geo) &&
                Objects.equals(payload, message.payload);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", peerId=").append(peerId);
        sb.append(", fromId=").append(fromId);
        sb.append(", randomId=").append(randomId);
        sb.append(", important=").append(important);
        sb.append(", fwdMessages=").append(fwdMessages);
        sb.append(", text='").append(text).append('\'');
        sb.append(", attachments=").append(attachments);
        sb.append(", action=").append(action);
        sb.append(", geo=").append(geo);
        sb.append(", payload='").append(payload).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

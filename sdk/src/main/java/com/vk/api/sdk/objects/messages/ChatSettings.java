package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class ChatSettings {

    /**
     * Number of chat participants
     */
    @SerializedName("members_count")
    private Integer membersCount;

    /**
     * Conversation title
     */
    @SerializedName("title")
    private String title;

    /**
     * Pinned message, if exists
     */
    @SerializedName("pinned_message")
    private PinnedMessage message;

    /**
     * Conversation state
     */
    @SerializedName("state")
    private String state;

    /**
     * Conversation picture
     */
    @SerializedName("photo")
    private ChatPhoto photo;

    /**
     * Identifiers of users that wrote last
     */
    @SerializedName("active_ids")
    private List<Integer> activeIds;

    public Integer getMembersCount() {
        return membersCount;
    }

    public String getTitle() {
        return title;
    }

    public PinnedMessage getMessage() {
        return message;
    }

    public String getState() {
        return state;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    public List<Integer> getActiveIds() {
        return activeIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatSettings that = (ChatSettings) o;
        return Objects.equals(membersCount, that.membersCount) &&
                Objects.equals(title, that.title) &&
                Objects.equals(message, that.message) &&
                Objects.equals(state, that.state) &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(activeIds, that.activeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(membersCount, title, message, state, photo, activeIds);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChatSettings{");
        sb.append("membersCount=").append(membersCount);
        sb.append(", title='").append(title).append('\'');
        sb.append(", message=").append(message);
        sb.append(", state='").append(state).append('\'');
        sb.append(", photo=").append(photo);
        sb.append(", activeIds=").append(activeIds);
        sb.append('}');
        return sb.toString();
    }
}

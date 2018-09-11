package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.account.PushSettings;

import java.util.Objects;

public class Conversation {

    /**
     * Peer information
     */
    @SerializedName("peer")
    private Peer peer;

    /**
     * Identifier of the last read received message
     */
    @SerializedName("in_read")
    private Integer inRead;

    /**
     * Identifier of the last read sent message
     */
    @SerializedName("out_read")
    private Integer outRead;

    /**
     * Unread message count
     */
    @SerializedName("unread_count")
    private Integer unreadCount;

    /**
     * True if message is marked as 'important'
     */
    @SerializedName("important")
    private Boolean important;

    /**
     * True if message is marked as 'unanswered' (only for the community messages)
     */
    @SerializedName("unanswered")
    private Boolean unanswered;

    /**
     * Push notification settings
     */
    private ConversationPushSettings pushSettings;

    /**
     * Write access information
     */
    @SerializedName("can_write")
    private CanWrite canWrite;

    /**
     * Chat settings
     */
    @SerializedName("chat_settings")
    private ChatSettings chatSettings;

    public Peer getPeer() {
        return peer;
    }

    public Integer getInRead() {
        return inRead;
    }

    public Integer getOutRead() {
        return outRead;
    }

    public Integer getUnreadCount() {
        return unreadCount;
    }

    public Boolean getImportant() {
        return important;
    }

    public Boolean getUnanswered() {
        return unanswered;
    }

    public ConversationPushSettings getPushSettings() {
        return pushSettings;
    }

    public CanWrite getCanWrite() {
        return canWrite;
    }

    public ChatSettings getChatSettings() {
        return chatSettings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conversation that = (Conversation) o;
        return Objects.equals(peer, that.peer) &&
                Objects.equals(inRead, that.inRead) &&
                Objects.equals(outRead, that.outRead) &&
                Objects.equals(unreadCount, that.unreadCount) &&
                Objects.equals(important, that.important) &&
                Objects.equals(unanswered, that.unanswered) &&
                Objects.equals(pushSettings, that.pushSettings) &&
                Objects.equals(canWrite, that.canWrite) &&
                Objects.equals(chatSettings, that.chatSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peer, inRead, outRead, unreadCount, important, unanswered, pushSettings, canWrite, chatSettings);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conversation{");
        sb.append("peer=").append(peer);
        sb.append(", inRead=").append(inRead);
        sb.append(", outRead=").append(outRead);
        sb.append(", unreadCount=").append(unreadCount);
        sb.append(", important=").append(important);
        sb.append(", unanswered=").append(unanswered);
        sb.append(", pushSettings=").append(pushSettings);
        sb.append(", canWrite=").append(canWrite);
        sb.append(", chatSettings=").append(chatSettings);
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class ConversationWithLastMessage {

    /**
     * Conversation data
     */
    @SerializedName("conversation")
    private Conversation conversation;

    /**
     * Last message in conversation
     */
    @SerializedName("last_message")
    private Message message;

    public Conversation getConversation() {
        return conversation;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConversationWithLastMessage that = (ConversationWithLastMessage) o;
        return Objects.equals(conversation, that.conversation) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conversation, message);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConversationWithLastMessage{");
        sb.append("conversation=").append(conversation);
        sb.append(", message=").append(message);
        sb.append('}');
        return sb.toString();
    }
}

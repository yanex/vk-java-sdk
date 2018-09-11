package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.messages.ConversationWithLastMessage;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetConversationsResponse object
 */
public class GetConversationsResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Unread dialogs number
     */
    @SerializedName("unread_count")
    private Integer unreadCount;

    /**
     * Conversations with its last messages
     */
    @SerializedName("items")
    private List<ConversationWithLastMessage> items;

    /**
     * Related user profiles
     */
    @SerializedName("profiles")
    private List<UserFull> profiles;

    /**
     * Related community profiles
     */
    @SerializedName("groups")
    private List<GroupFull> groups;

    public Integer getCount() {
        return count;
    }

    public Integer getUnreadCount() {
        return unreadCount;
    }

    public List<ConversationWithLastMessage> getItems() {
        return items;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetConversationsResponse that = (GetConversationsResponse) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(unreadCount, that.unreadCount) &&
                Objects.equals(items, that.items) &&
                Objects.equals(profiles, that.profiles) &&
                Objects.equals(groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, unreadCount, items, profiles, groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetConversationsResponse{");
        sb.append("count=").append(count);
        sb.append(", unreadCount=").append(unreadCount);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}

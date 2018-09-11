package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.messages.Conversation;
import com.vk.api.sdk.objects.messages.Dialog;

import java.util.List;
import java.util.Objects;

/**
 * GetConversationsByIdsResponse object
 */
public class GetConversationsByIdsResponse {
    /**
     * Total number of conversations
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Conversations
     */
    @SerializedName("items")
    private List<Conversation> items;

    public List<Conversation> getItems() {
        return items;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetConversationsByIdsResponse that = (GetConversationsByIdsResponse) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetConversationsByIdsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}

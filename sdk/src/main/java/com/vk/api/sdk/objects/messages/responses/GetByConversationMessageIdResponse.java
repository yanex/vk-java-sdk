package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.messages.Message;

import java.util.List;
import java.util.Objects;

public class GetByConversationMessageIdResponse {

    /**
     * Total number of results
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Messages
     */
    @SerializedName("items")
    private List<Message> items;

    public List<Message> getItems() {
        return items;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetByConversationMessageIdResponse that = (GetByConversationMessageIdResponse) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetByConversationMessageIdResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.messages.Participant;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.List;

public class GetConversationMembersResponse {

    /**
     * Total participant count
     */
    @SerializedName("count")
    private Integer count;

    /**
     * Participants
     */
    @SerializedName("items")
    private List<Participant> items;

    /**
     * Relevant user profiles
     */
    @SerializedName("profiles")
    private List<UserFull> profiles;

    /**
     * Relevant group profiles
     */
    @SerializedName("groups")
    private List<GroupFull> groups;


}

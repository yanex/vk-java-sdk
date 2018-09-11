package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.GetConversationMembersResponse;
import com.vk.api.sdk.queries.users.UserField;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getConversationMembers method
 */
public class MessagesGetConversationMembersQuery extends AbstractQueryBuilder<MessagesGetConversationMembersQuery, GetConversationMembersResponse> {
    public MessagesGetConversationMembersQuery(VkApiClient client, UserActor actor, Integer peerId, UserField... fields) {
        super(client, "messages.getConversationMembers", GetConversationMembersResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        fields(fields);
    }

    public MessagesGetConversationMembersQuery(VkApiClient client, GroupActor actor, Integer peerId, UserField... fields) {
        super(client, "messages.getConversationMembers", GetConversationMembersResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        fields(fields);
    }

    public MessagesGetConversationMembersQuery(VkApiClient client, UserActor actor, Integer peerId, List<UserField> fields) {
        super(client, "messages.getConversationMembers", GetConversationMembersResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        fields(fields);
    }

    public MessagesGetConversationMembersQuery(VkApiClient client, GroupActor actor, Integer peerId, List<UserField> fields) {
        super(client, "messages.getConversationMembers", GetConversationMembersResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        fields(fields);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetConversationMembersQuery fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetConversationMembersQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Conversation peer identifiers.
     *
     * @param value value of "peer_ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetConversationMembersQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Target group identifier.
     *
     * @param value value of "group_id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetConversationMembersQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected MessagesGetConversationMembersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

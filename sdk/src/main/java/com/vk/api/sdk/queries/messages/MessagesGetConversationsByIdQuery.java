package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.messages.responses.GetConversationsByIdsResponse;
import com.vk.api.sdk.objects.messages.responses.GetConversationsResponse;
import com.vk.api.sdk.queries.users.UserField;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getConversationsById method
 */
public class MessagesGetConversationsByIdQuery extends AbstractQueryBuilder<MessagesGetConversationsByIdQuery, GetConversationsByIdsResponse> {
    public MessagesGetConversationsByIdQuery(VkApiClient client, UserActor actor, List<Integer> peerIds, UserField... fields) {
        super(client, "messages.getConversationsById", GetConversationsByIdsResponse.class);
        accessToken(actor.getAccessToken());
        peerIds(peerIds);
        fields(fields);
    }

    public MessagesGetConversationsByIdQuery(VkApiClient client, GroupActor actor, List<Integer> peerIds, UserField... fields) {
        super(client, "messages.getConversationsById", GetConversationsByIdsResponse.class);
        accessToken(actor.getAccessToken());
        peerIds(peerIds);
        fields(fields);
    }

    public MessagesGetConversationsByIdQuery(VkApiClient client, UserActor actor, List<Integer> peerIds, List<UserField> fields) {
        super(client, "messages.getConversationsById", GetConversationsByIdsResponse.class);
        accessToken(actor.getAccessToken());
        peerIds(peerIds);
        fields(fields);
    }

    public MessagesGetConversationsByIdQuery(VkApiClient client, GroupActor actor, List<Integer> peerIds, List<UserField> fields) {
        super(client, "messages.getConversationsById", GetConversationsByIdsResponse.class);
        accessToken(actor.getAccessToken());
        peerIds(peerIds);
        fields(fields);
    }

    /**
     * Receive extended fields.
     *
     * @param value value of "extended" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetConversationsByIdQuery extended(BoolInt value) {
        return unsafeParam("extended", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetConversationsByIdQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetConversationsByIdQuery fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Conversation peer identifiers.
     *
     * @param value value of "peer_ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetConversationsByIdQuery peerIds(List<Integer> value) {
        return unsafeParam("peer_ids", value);
    }

    /**
     * Target group identifier.
     *
     * @param value value of "group_id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetConversationsByIdQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected MessagesGetConversationsByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

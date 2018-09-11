package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.messages.responses.GetByConversationMessageIdResponse;
import com.vk.api.sdk.objects.messages.responses.GetConversationMembersResponse;
import com.vk.api.sdk.queries.users.UserField;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getConversationMembers method
 */
public class MessagesGetByConversationMessageIdQuery extends AbstractQueryBuilder<MessagesGetByConversationMessageIdQuery, GetByConversationMessageIdResponse> {
    public MessagesGetByConversationMessageIdQuery(VkApiClient client, UserActor actor, Integer peerId, UserField... fields) {
        super(client, "messages.getByConversationMessageId", GetByConversationMessageIdResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        fields(fields);
    }

    public MessagesGetByConversationMessageIdQuery(VkApiClient client, GroupActor actor, Integer peerId, UserField... fields) {
        super(client, "messages.getByConversationMessageId", GetByConversationMessageIdResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        fields(fields);
    }

    public MessagesGetByConversationMessageIdQuery(VkApiClient client, UserActor actor, Integer peerId, List<UserField> fields) {
        super(client, "messages.getByConversationMessageId", GetByConversationMessageIdResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        fields(fields);
    }

    public MessagesGetByConversationMessageIdQuery(VkApiClient client, GroupActor actor, Integer peerId, List<UserField> fields) {
        super(client, "messages.getByConversationMessageId", GetByConversationMessageIdResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        fields(fields);
    }

    /**
     * Message identifiers.
     *
     * @param value value of "conversation_message_ids" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetByConversationMessageIdQuery messageIds(List<Integer> value) {
        return unsafeParam("conversation_message_ids", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetByConversationMessageIdQuery fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetByConversationMessageIdQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Conversation peer identifiers.
     *
     * @param value value of "peer_ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetByConversationMessageIdQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Target group identifier.
     *
     * @param value value of "group_id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetByConversationMessageIdQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Receive extended fields.
     *
     * @param value value of "extended" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetByConversationMessageIdQuery extended(BoolInt value) {
        return unsafeParam("extended", value);
    }

    @Override
    protected MessagesGetByConversationMessageIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

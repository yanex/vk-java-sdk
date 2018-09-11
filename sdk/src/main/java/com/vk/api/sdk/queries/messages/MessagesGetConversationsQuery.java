package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.messages.responses.GetConversationsResponse;
import com.vk.api.sdk.queries.users.UserField;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getConversations method
 */
public class MessagesGetConversationsQuery extends AbstractQueryBuilder<MessagesGetConversationsQuery, GetConversationsResponse> {
    public MessagesGetConversationsQuery(VkApiClient client, UserActor actor, UserField... fields) {
        super(client, "messages.getConversations", GetConversationsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    public MessagesGetConversationsQuery(VkApiClient client, GroupActor actor, UserField... fields) {
        super(client, "messages.getConversations", GetConversationsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    public MessagesGetConversationsQuery(VkApiClient client, UserActor actor, List<UserField> fields) {
        super(client, "messages.getConversations", GetConversationsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    public MessagesGetConversationsQuery(VkApiClient client, GroupActor actor, List<UserField> fields) {
        super(client, "messages.getConversations", GetConversationsResponse.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Offset needed to return a specific subset of conversations.
     *
     * @param value value of "offset" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetConversationsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Number of conversations to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetConversationsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Conversation filter.
     * "all" – all conversations.
     * "unread" – unread conversations.
     * "important" – conversations tagged as 'important'.
     * "unanswered" – unanswered conversations.
     *
     *
     * @param value value of "filter" parameter.
     *      * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetConversationsQuery filter(String value) {
        return unsafeParam("filter", value);
    }

    /**
     * ID of the message from what to return conversations.
     *
     * @param value value of "start message id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetConversationsQuery startMessageId(Integer value) {
        return unsafeParam("start_message_id", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetConversationsQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetConversationsQuery fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Target group identifier.
     *
     * @param value value of "group_id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetConversationsQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected MessagesGetConversationsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.messages.responses.GetConversationsByIdsResponse;
import com.vk.api.sdk.objects.messages.responses.GetConversationsResponse;
import com.vk.api.sdk.objects.messages.responses.SearchConversationsResponse;
import com.vk.api.sdk.queries.users.UserField;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.searchConversations method
 */
public class MessagesSearchConversationsQuery extends AbstractQueryBuilder<MessagesSearchConversationsQuery, SearchConversationsResponse> {
    public MessagesSearchConversationsQuery(VkApiClient client, UserActor actor, String query, UserField... fields) {
        super(client, "messages.searchConversations", SearchConversationsResponse.class);
        accessToken(actor.getAccessToken());
        query(query);
        fields(fields);
    }

    public MessagesSearchConversationsQuery(VkApiClient client, GroupActor actor, String query, UserField... fields) {
        super(client, "messages.searchConversations", SearchConversationsResponse.class);
        accessToken(actor.getAccessToken());
        query(query);
        fields(fields);
    }

    public MessagesSearchConversationsQuery(VkApiClient client, UserActor actor, String query, List<UserField> fields) {
        super(client, "messages.searchConversations", SearchConversationsResponse.class);
        accessToken(actor.getAccessToken());
        query(query);
        fields(fields);
    }

    public MessagesSearchConversationsQuery(VkApiClient client, GroupActor actor, String query, List<UserField> fields) {
        super(client, "messages.searchConversations", SearchConversationsResponse.class);
        accessToken(actor.getAccessToken());
        query(query);
        fields(fields);
    }

    /**
     * Search query.
     *
     * @param value value of "q" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchConversationsQuery query(String value) {
        return unsafeParam("q", value);
    }

    /**
     * Number of conversations to return.
     *
     * @param value value of "count" parameter. Maximum is 200. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchConversationsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Receive extended fields.
     *
     * @param value value of "extended" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchConversationsQuery extended(BoolInt value) {
        return unsafeParam("extended", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesSearchConversationsQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesSearchConversationsQuery fields(List<UserField> value) {
        return unsafeParam("fields", value);
    }

    /**
     * Target group identifier.
     *
     * @param value value of "group_id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesSearchConversationsQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected MessagesSearchConversationsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}

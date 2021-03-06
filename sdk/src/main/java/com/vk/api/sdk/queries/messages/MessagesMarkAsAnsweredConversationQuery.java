package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.markAsAnsweredDialog method
 */
public class MessagesMarkAsAnsweredConversationQuery extends AbstractQueryBuilder<MessagesMarkAsAnsweredConversationQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesMarkAsAnsweredConversationQuery(VkApiClient client, GroupActor actor, Integer peerId) {
        super(client, "messages.markAsAnsweredConversation", OkResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
    }

    /**
     * Dialog id
     *
     * @param value value of "peer_id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    private MessagesMarkAsAnsweredConversationQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * "true" - mark as answered
     * "false" - remove mark
     *
     * @param value value of "answered" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesMarkAsAnsweredConversationQuery answered(Boolean value) {
        return unsafeParam("answered", value);
    }

    /**
     * Group id (for messages with the user actor)
     *
     * @param value value of "peer_id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    private MessagesMarkAsAnsweredConversationQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected MessagesMarkAsAnsweredConversationQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "access_token");
    }
}

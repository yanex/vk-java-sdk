package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.markAsImportantDialog method
 */
public class MessagesMarkAsImportantConversationQuery extends AbstractQueryBuilder<MessagesMarkAsImportantConversationQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesMarkAsImportantConversationQuery(VkApiClient client, GroupActor actor, Integer peerId) {
        super(client, "messages.markAsImportantConversation", OkResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
    }

    /**
     * Dialog id
     *
     * @param value value of "peer_id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    private MessagesMarkAsImportantConversationQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * "true" - mark as important
     * "false" - remove mark
     *
     * @param value value of "important" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesMarkAsImportantConversationQuery important(Boolean value) {
        return unsafeParam("important", value);
    }

    /**
     * Group id (for messages with the user actor)
     *
     * @param value value of "group_id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    private MessagesMarkAsImportantConversationQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected MessagesMarkAsImportantConversationQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "access_token");
    }
}

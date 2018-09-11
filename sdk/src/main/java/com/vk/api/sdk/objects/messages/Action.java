package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Action {

    /**
     * Action type
     */
    @SerializedName("type")
    private ActionType actionType;

    /**
     * Target member user identifier
     */
    @SerializedName("member_id")
    private Integer memberId;

    /**
     * Conversation title
     */
    @SerializedName("text")
    private String text;

    /**
     * Invited/kicked email address
     */
    @SerializedName("email")
    private String email;

    /**
     * Conversation picture
     */
    @SerializedName("photo")
    private ChatPhoto photo;

    public ActionType getActionType() {
        return actionType;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public String getText() {
        return text;
    }

    public String getEmail() {
        return email;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action = (Action) o;
        return actionType == action.actionType &&
                Objects.equals(memberId, action.memberId) &&
                Objects.equals(text, action.text) &&
                Objects.equals(email, action.email) &&
                Objects.equals(photo, action.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionType, memberId, text, email, photo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Action{");
        sb.append("actionType=").append(actionType);
        sb.append(", memberId=").append(memberId);
        sb.append(", text='").append(text).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", photo=").append(photo);
        sb.append('}');
        return sb.toString();
    }
}

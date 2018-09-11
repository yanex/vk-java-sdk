package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Participant {

    /**
     * Participant identifier
     */
    @SerializedName("member_id")
    private Integer memberId;

    /**
     * Inviter identifier
     */
    @SerializedName("invited_by")
    private Integer invitedBy;

    /**
     * Date in which this participant joined the conversation
     */
    @SerializedName("join_date")
    private Integer joinDate;

    /**
     * True if this participant is a conversation administrator
     */
    @SerializedName("is_admin")
    private Boolean isAdmin;

    public Integer getMemberId() {
        return memberId;
    }

    public Integer getInvitedBy() {
        return invitedBy;
    }

    public Integer getJoinDate() {
        return joinDate;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(memberId, that.memberId) &&
                Objects.equals(invitedBy, that.invitedBy) &&
                Objects.equals(joinDate, that.joinDate) &&
                Objects.equals(isAdmin, that.isAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, invitedBy, joinDate, isAdmin);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Participant{");
        sb.append("memberId=").append(memberId);
        sb.append(", invitedBy=").append(invitedBy);
        sb.append(", joinDate=").append(joinDate);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append('}');
        return sb.toString();
    }
}

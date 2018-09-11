package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class ConversationPushSettings {

    /**
     * Timestamp until that all message notifications are disabled
     */
    @SerializedName("disabled_until")
    private Integer disabledUntil;

    /**
     * True if notifications are disabled permanently
     */
    @SerializedName("disabled_forever")
    private Boolean disabledForever;

    /**
     * True if the message notification sound if turned off
     */
    @SerializedName("no_sound")
    private Boolean noSound;

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    public Boolean getDisabledForever() {
        return disabledForever;
    }

    public Boolean getNoSound() {
        return noSound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConversationPushSettings that = (ConversationPushSettings) o;
        return Objects.equals(disabledUntil, that.disabledUntil) &&
                Objects.equals(disabledForever, that.disabledForever) &&
                Objects.equals(noSound, that.noSound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disabledUntil, disabledForever, noSound);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConversationPushSettings{");
        sb.append("disabledUntil=").append(disabledUntil);
        sb.append(", disabledForever=").append(disabledForever);
        sb.append(", noSound=").append(noSound);
        sb.append('}');
        return sb.toString();
    }
}

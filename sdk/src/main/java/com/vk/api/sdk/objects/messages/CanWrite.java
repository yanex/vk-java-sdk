package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class CanWrite {

    /**
     * True if write access allowed
     */
    @SerializedName("allowed")
    private Boolean allowed;

    /**
     * Reasoning message identifier
     */
    @SerializedName("reason")
    private Integer reason;

    public Boolean getAllowed() {
        return allowed;
    }

    public Integer getReason() {
        return reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CanWrite canWrite = (CanWrite) o;
        return Objects.equals(allowed, canWrite.allowed) &&
                Objects.equals(reason, canWrite.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowed, reason);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CanWrite{");
        sb.append("allowed=").append(allowed);
        sb.append(", reason=").append(reason);
        sb.append('}');
        return sb.toString();
    }
}

package com.vk.api.sdk.objects.messages;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Peer {

    /**
     * Peer identifier
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Peer type
     */
    @SerializedName("type")
    private String type;

    /**
     * Local target identifier
     */
    @SerializedName("local_id")
    private Integer localId;

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Integer getLocalId() {
        return localId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peer peer = (Peer) o;
        return Objects.equals(id, peer.id) &&
                Objects.equals(type, peer.type) &&
                Objects.equals(localId, peer.localId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, localId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Peer{");
        sb.append("id=").append(id);
        sb.append(", type='").append(type).append('\'');
        sb.append(", localId=").append(localId);
        sb.append('}');
        return sb.toString();
    }
}

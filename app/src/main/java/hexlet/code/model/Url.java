package hexlet.code.model;

import java.sql.Timestamp;
import java.time.Instant;


public final class Url {

    private long id;

    private String name;

    private Timestamp  createdAt;


    public Url() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Url(String name) {
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public Instant getCreatedAtToInstant() {
        return this.createdAt.toInstant();
    }
}
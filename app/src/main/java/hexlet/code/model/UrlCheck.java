package hexlet.code.model;

import java.sql.Timestamp;
import java.time.Instant;


public final class UrlCheck {

    private long id;

    private int statusCode;

    private String title;

    private String h1;

    private String description;

    private Timestamp createdAt;

    private Long urlId;

    public UrlCheck(int statusCode, String title, String h1, String description) {
        this.statusCode = statusCode;
        this.title = title;
        this.h1 = h1;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getH1() {
        return h1;
    }

    public String getTitle() {
        return title;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setH1(String h1) {
        this.h1 = h1;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUrlId() {
        return urlId;
    }

    public void setUrlId(Long urlId) {
        this.urlId = urlId;
    }

    public Instant getCreatedAt() {
        return this.createdAt.toInstant();
    }
}

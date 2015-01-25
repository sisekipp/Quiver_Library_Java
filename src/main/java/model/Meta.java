package model;

import java.util.Date;
import java.util.List;

/**
 * Created by sebastian on 25.01.15.
 */
public class Meta {

    private Date createdAt;

    private List<String> tags;

    private String title;

    private Date updatedAt;

    private String uuid;

    public Meta() {
    }

    public Meta(Date createdAt, Date updatedAt, String title, String uuid, List<String> tags) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.title = title;
        this.uuid = uuid;
        this.tags = tags;
    }

    public Meta(String title, String uuid, List<String> tags) {
        this.title = title;
        this.uuid = uuid;
        this.tags = tags;
    }

    public Meta(String title, List<String> tags) {
        this.title = title;
        this.tags = tags;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

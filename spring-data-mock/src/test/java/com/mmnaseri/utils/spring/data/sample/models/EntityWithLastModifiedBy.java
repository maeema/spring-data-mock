package com.mmnaseri.utils.spring.data.sample.models;

import org.springframework.data.annotation.LastModifiedBy;

/**
 * @author Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (4/12/16, 5:20 PM)
 */
@SuppressWarnings("unused")
public class EntityWithLastModifiedBy {

    private String id;
    @LastModifiedBy
    private String lastModifiedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

}

package com.mmnaseri.utils.spring.data.sample.models;

import javax.persistence.Id;

/**
 * @author Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (6/8/16, 1:18 AM)
 */
@SuppressWarnings("unused")
public class EntityWithAnnotatedIdFieldFromJPA {

    @Id
    private Long customIdProperty;

    public Long getCustomIdProperty() {
        return customIdProperty;
    }

    public void setCustomIdProperty(Long customIdProperty) {
        this.customIdProperty = customIdProperty;
    }

}

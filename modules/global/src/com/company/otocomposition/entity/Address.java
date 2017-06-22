package com.company.otocomposition.entity;

import javax.persistence.Embeddable;
import com.haulmont.chile.core.annotations.MetaClass;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.EmbeddableEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|postcode")
@MetaClass(name = "comp$Address")
@Embeddable
public class Address extends EmbeddableEntity {
    private static final long serialVersionUID = 7769714481914372638L;

    @Column(name = "POSTCODE", length = 50)
    protected String postcode;

    @Column(name = "LINE_ONE", length = 50)
    protected String lineOne;

    @Column(name = "LINE_TWO")
    protected String lineTwo;

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public String getLineTwo() {
        return lineTwo;
    }


}
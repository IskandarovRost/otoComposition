package com.company.otocomposition.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Table(name = "COMP_CUSTOMER")
@Entity(name = "comp$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -8996482088075185543L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "SCORE")
    protected Integer score;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DETAIL_ID")
    protected CustomerDetail detail;

    public void setDetail(CustomerDetail detail) {
        this.detail = detail;
    }

    public CustomerDetail getDetail() {
        return detail;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }


}
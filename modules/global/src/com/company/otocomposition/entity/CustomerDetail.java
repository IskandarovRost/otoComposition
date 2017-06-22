package com.company.otocomposition.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|customerDescription")
@Table(name = "COMP_CUSTOMER_DETAIL")
@Entity(name = "comp$CustomerDetail")
public class CustomerDetail extends StandardEntity {
    private static final long serialVersionUID = 3836542923625983630L;

    @Column(name = "CUSTOMER_DESCRIPTION")
    protected String customerDescription;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "postcode", column = @Column(name = "MAIN_ADDRESS_POSTCODE")),
        @AttributeOverride(name = "lineOne", column = @Column(name = "MAIN_ADDRESS_LINE_ONE")),
        @AttributeOverride(name = "lineTwo", column = @Column(name = "MAIN_ADDRESS_LINE_TWO"))
    })
    protected Address mainAddress;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "postcode", column = @Column(name = "DELIVERY_ADDRESS_POSTCODE")),
        @AttributeOverride(name = "lineOne", column = @Column(name = "DELIVERY_ADDRESS_LINE_ONE")),
        @AttributeOverride(name = "lineTwo", column = @Column(name = "DELIVERY_ADDRESS_LINE_TWO"))
    })
    protected Address deliveryAddress;

    public void setCustomerDescription(String customerDescription) {
        this.customerDescription = customerDescription;
    }

    public String getCustomerDescription() {
        return customerDescription;
    }

    public void setMainAddress(Address mainAddress) {
        this.mainAddress = mainAddress;
    }

    public Address getMainAddress() {
        return mainAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }


}
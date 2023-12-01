package com.company.jenkinstest.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "JENKINSTEST_PRODUCT")
@Entity(name = "jenkinstest_Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 4516518685540544052L;

    @Column(name = "PRODUCTNAME")
    private String productname;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
}
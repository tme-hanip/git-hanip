package com.company.jenkinstest.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.jenkinstest.entity.Product;

@UiController("jenkinstest_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}
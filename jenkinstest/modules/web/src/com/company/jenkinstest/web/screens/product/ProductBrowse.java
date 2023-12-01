package com.company.jenkinstest.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.jenkinstest.entity.Product;

@UiController("jenkinstest_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}
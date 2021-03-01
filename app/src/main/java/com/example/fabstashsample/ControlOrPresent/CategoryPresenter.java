package com.example.fabstashsample.ControlOrPresent;

import com.example.fabstashsample.Data.CategoryActivityData;
import com.example.fabstashsample.View.ICategoryView;

import java.util.ArrayList;
import java.util.HashMap;

//use to create new presenter
public class CategoryPresenter implements ICategoryPresenter {
    CategoryActivityData data = new CategoryActivityData();
    ICategoryView view;

    public CategoryPresenter(ICategoryView view) {
        this.view = view;
    }

    @Override
    public ArrayList<String> getListGroup() {
        return data.getListGroup();
    }

    @Override
    public HashMap<String, ArrayList<String>> getListChild() {
        return data.getListChild();
    }

}

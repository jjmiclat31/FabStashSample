package com.example.fabstashsample.ControlOrPresent;


import com.example.fabstashsample.Data.ItemListData;
import com.example.fabstashsample.View.IItemListView;

public class ItemListPresenter implements  IItemListPresenter{

    ItemListData data = new ItemListData();
    IItemListView view;
    String selectedItem;

    public ItemListPresenter(IItemListView view) {
        this.view = view;
    }


    @Override
    public String[] getDataTitlesFromData() {
        return data.getDataTitles();
    }

    @Override
    public String[] getDataDescriptionsFromData() {
        return data.getDataDescriptions();
    }

    @Override
    public void selectedItem(String itemName) {
        this.selectedItem = itemName;
        data.setReturnData(itemName);
    }
}

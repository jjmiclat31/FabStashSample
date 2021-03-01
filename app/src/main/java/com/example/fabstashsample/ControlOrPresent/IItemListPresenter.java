package com.example.fabstashsample.ControlOrPresent;

public interface IItemListPresenter {
    String[] getDataTitlesFromData();
    String[] getDataDescriptionsFromData();
    void selectedItem(String itemName);
}

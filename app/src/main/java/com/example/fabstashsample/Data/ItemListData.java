package com.example.fabstashsample.Data;

public class ItemListData implements IItemListData {

    String[] dataTitles;
    String[] dataDescriptions;
    String[] cottonTitles = {"Cotton1", "Cotton2"};
    String[] cottonDescriptions = {"Cotton1 Description", "Cotton2 Description"};
    String[] woolTitles = {"Wool1", "Wool2"};
    String[] woolDescriptions = {"Wool1 Description", "Wool2 Description"};
    public ItemListData() {


    }

    @Override
    public String[] getDataTitles() {
        return dataTitles;
    }

    @Override
    public String[] getDataDescriptions() {
        return dataDescriptions;
    }

    @Override
    public void setReturnData(String itemName) {
        if (itemName.equals("Cotton")) {
            dataTitles = cottonTitles;
            dataDescriptions = cottonDescriptions;
        }
        else {
            dataTitles = woolTitles;
            dataDescriptions =woolDescriptions;
        }
    }

}

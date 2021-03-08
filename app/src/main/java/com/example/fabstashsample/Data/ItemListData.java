package com.example.fabstashsample.Data;

public class ItemListData implements IItemListData {

    String[] dataTitles;
    String[] dataDescriptions;
    String[] cottonTitles = {"Cotton1", "Cotton2"};
    String[] cottonDescriptions = {"Cotton1 Description", "Cotton2 Description"};
    String[] woolTitles = {"Wool1", "Wool2"};
    String[] woolDescriptions = {"Wool1 Description", "Wool2 Description"};
    String[] notion1Titles = {"Notion1", "Notion2"};
    String[] notion1Descriptions = {"Notion1 Description", "Notion2 Description"};
    String[] notion2Titles = {"Notion2.1", "Notion2.2"};
    String[] notion2Descriptions = {"Notion2.1 Description", "Notion2.2 Description"};
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
        switch (itemName) {
            case "Cotton":
                dataTitles = cottonTitles;
                dataDescriptions = cottonDescriptions;
                break;
            case "Wool":
                dataTitles = woolTitles;
                dataDescriptions = woolDescriptions;
                break;
            case "Notion1":
                dataTitles = notion1Titles;
                dataDescriptions = notion1Descriptions;
                break;
            default:
                dataTitles = notion2Titles;
                dataDescriptions = notion2Descriptions;
                break;
        }
    }

}

package com.example.fabstashsample.Data;

import java.util.ArrayList;
import java.util.HashMap;


//data for main/category activity
public class CategoryActivityData implements ICategoryActivityData {
    ArrayList<String> listGroup = new ArrayList<>();
    HashMap<String, ArrayList<String>> listChild = new HashMap<>();
    ArrayList<String> fabArray = new ArrayList<>();
    ArrayList<String> notionArray = new ArrayList<>();

    public CategoryActivityData() {

        //add groups
        listGroup.add("Fabrics");
        listGroup.add("Notions");

        //add items to each group
        fabArray.add("Cotton");
        fabArray.add("Wool");
        listChild.put(listGroup.get(0),fabArray);

        notionArray.add("Notion1");
        notionArray.add("Notion2");
        listChild.put(listGroup.get(1),notionArray);
    }



    @Override
    public ArrayList<String> getListGroup() {
        return listGroup;
    }

    @Override
    public HashMap<String, ArrayList<String>> getListChild() {
        return listChild;
    }


}

package com.example.fabstashsample.Data;

import java.util.ArrayList;
import java.util.HashMap;


//add setters here if needed
public interface ICategoryActivityData {
    ArrayList<String> getListGroup();
    HashMap<String, ArrayList<String>> getListChild();

}

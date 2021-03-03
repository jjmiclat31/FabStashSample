package com.example.fabstashsample.ControlOrPresent;

import java.util.ArrayList;
import java.util.HashMap;


//Category Presenter Methods
public interface ICategoryPresenter {
    ArrayList<String> getListGroup();
    HashMap<String, ArrayList<String>> getListChild();

}

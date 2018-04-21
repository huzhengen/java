package com.company.view;

import com.company.model.News;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NewsListViewer {
    private ArrayList<News> newsList;

    public NewsListViewer(ArrayList<News> newsList){
        this.newsList = newsList;
    }

    public void display(){
        for (News news : newsList){
            System.out.print("---------------");
        }
    }

}

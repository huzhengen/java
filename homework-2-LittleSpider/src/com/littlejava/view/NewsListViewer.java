package com.littlejava.view;

import com.littlejava.model.News;
import java.util.ArrayList;
import java.util.Map;

public class NewsListViewer {
    private ArrayList<News> newsList;

    public NewsListViewer(ArrayList<News> newsList) {
        this.newsList = newsList;
    }

    public void display() {
        for (News news : newsList) {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("|Title| " + news.getTitle());
            System.out.println("|Content| " + news.getContent());

            //填写你的代码
//            System.out.println(news.getRelated());
            System.out.println("|Related|");
//            for (String key : news.getRelated().keySet()) {
//                String value = news.getRelated().get(key);
//                System.out.println("日期：" + key + "\n标题：" + value);
//            }

            for(Map.Entry<String, String> entry : news.getRelated().entrySet()){
                System.out.println(entry.getKey() + "\n" + entry.getValue());
            }
        }
    }
}

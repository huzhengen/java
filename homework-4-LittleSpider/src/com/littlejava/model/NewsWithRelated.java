package com.littlejava.model;

import java.util.HashMap;
import java.util.Map;

public class NewsWithRelated extends News {
    private HashMap<String, String> relateds;

    public NewsWithRelated(String title, String content) {
        super(title, content);
        relateds = new HashMap<String, String>();
    }

    public void addRelated(String title, String url) {
        this.relateds.put(title, url);
    }

    public HashMap<String, String> getRelateds() {
        return this.relateds;
    }

    public void display() {
        super.display();
        System.out.println("|Related|");
        for(Map.Entry<String, String> entry : this.relateds.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

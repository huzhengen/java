package com.littlejava.model;

import java.util.HashMap;

public class NewsWithRelated extends News {
    private HashMap<String, String> relateds;

    public NewsWithRelated(String title, String content) {
        super(title, content);
        relateds = new HashMap<String, String>();
    }

    public void addRelated(String date, String title) {
        this.relateds.put(date, title);
    }

    public HashMap<String, String> getRelateds() {
        return this.relateds;
    }
}

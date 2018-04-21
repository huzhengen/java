package com.company.model;

import java.util.HashMap;
import java.util.Map;

public class News {
    private String title;
    private String content;

    private Map<String, String> related; // 日期 => 标题 相关新闻

    public News(String title, String content){
        this.title = title;
        this.content = content;
        this.related = new HashMap<String, String>();
    }

    public void addRelated(String date, String related_title){

    }

    public Map<String, String> getRelated() {
        return related;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

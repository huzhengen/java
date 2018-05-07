package com.littlejava.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

//从链接中读取News
public class UrlNewsReader {
    public static NewsWithRelated read(String url) throws IOException {
        //Jsoup 读取和解析 页面
        Document doc = Jsoup.connect(url).get();
        Elements titleElements = doc.select("title");
        String title = titleElements.first().text();
        String content = doc.select("meta[name=description]").attr("content");

        // select 语法
        // 1. 标签名 "title", "meta", "meta"
        // 2. class ".main___dXbgk"
        // 3. id "#root"
        // 4. 属性 "[name=xxx]"

        /*
        Elements contentElements = doc.select(".summary___1i4y3");
        String content = contentElements.first().text();
        */

        NewsWithRelated news = new NewsWithRelated(title, content);

        Elements relatedElements = doc.select(".timeline__item___2eWUN");
        for (Element element : relatedElements) {
            String relatedTitle = element.select(".content-item___3KfMq").text();
            Elements children  = element.children();
            String relatedUrl = children.get(3).child(0).absUrl("href");

            news.addRelated(relatedTitle, relatedUrl);
        }

        return news;
    }
}

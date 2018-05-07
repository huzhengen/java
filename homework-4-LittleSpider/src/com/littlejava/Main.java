package com.littlejava;

import com.littlejava.model.*;
import java.util.*;

public class Main {

    // 本地存储新闻内容，如何在终端显示

    // 1. 抽象出 对象
    // 2. 设计 对象应该具有的属性，状态和行为
    // 3. 思考 对象之间交互
    // 4. 开始写代码

    public static void main(String[] args) throws Exception {
       // 广度优先搜索

        Queue<NewsWithRelated> newsQueue = new LinkedList<NewsWithRelated>();

        String startUrl = "https://readhub.me/topic/5bMmlAm75lD";
        NewsWithRelated startNews = UrlNewsReader.read(startUrl);
        newsQueue.add(startNews);

        while (!newsQueue.isEmpty()) {
            NewsWithRelated current = newsQueue.poll();
            current.display();
            for (Map.Entry<String, String> entry : current.getRelateds().entrySet()) {
                String url = entry.getValue();
                NewsWithRelated next = UrlNewsReader.read(url);
                newsQueue.add(next);
            }
        }

        // 第四次作业
        // 1. 实现在广度优先搜索过程中进行去重处理
        // 2. 实现把爬取的内容已json格式存储到本地
    }
}


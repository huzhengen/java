package com.littlejava.model;

import java.io.File;
import java.util.ArrayList;

public class NewsFactory {
    protected File newsDir;

    public NewsFactory(String dir) throws Exception {
        newsDir = new File(dir); // 打开目录
        if (!newsDir.exists()) {
            throw new Exception("路径不存在!");
        }
        if (!newsDir.isDirectory()) {
            throw new Exception("输入路径不是一个合法目录！");
        }
    }

    public ArrayList<News> fetch() {
        ArrayList<News> newsList = new ArrayList<News>();
        File[] files = newsDir.listFiles();
        if (files != null) {
            for (File file : files) {
                NewsReader newsReader = null;
                if (file.getName().endsWith(".txt")) {
                    newsReader = new TextNewsReader(file);
                } else if (file.getName().endsWith(".json")) {
                    newsReader = new JsonNewsReader(file);
                }

                News news = newsReader.readNews();
                newsList.add(news);
            }
        }

        NewsWithRelated newsWithRelated = new NewsWithRelated("Java训练营", "Java训练营已经第三课了！");
        newsWithRelated.addRelated("4.11", "Java训练营开营！！！");
        newsWithRelated.addRelated("4.17", "Java训练营第二课");
        newsList.add(newsWithRelated);
        return newsList;
    }
}

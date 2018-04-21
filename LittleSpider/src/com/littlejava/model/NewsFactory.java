package com.littlejava.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class NewsFactory {
    private File newsDir;

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
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String title = reader.readLine(); // 读取title
                    reader.readLine(); // 跳过空行
                    String content = reader.readLine(); // 读取content
                    News news = new News(title, content);

                    // 添加代码读取 相关新闻

                    newsList.add(news);
                } catch (java.io.IOException e) {
                    System.out.println("新闻读取出错");
                }
            }
        }
        return newsList;
    }
}

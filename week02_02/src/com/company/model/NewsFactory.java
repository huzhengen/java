package com.company.model;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class NewsFactory {
    private File newsDir;

    public NewsFactory(String dir) throws Exception {
        newsDir = new File(dir); // 打开目录
        if(!newsDir.exists()){
            throw new Exception("目录不存在");
        }

        if(!newsDir.isDirectory()){
            throw new Exception("输入路径不是一个合法目录");
        }
    }

    public ArrayList<News> fetch() throws IOException {
        ArrayList<News> newList = new ArrayList<News>();
        File[] files = newsDir.listFiles();
        if(files != null){
            for (File file : files){
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String title = reader.readLine();
                reader.readLine();
                String content = reader.readLine();
                News news = new News(title, content);

                // 添加代码 获取相关新闻

                newsList.add(news);
            }
        }
        return newsList;
    }
}

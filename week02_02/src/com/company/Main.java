package com.company;

import com.company.model.News;
import com.company.model.NewsFactory;
import com.company.view.NewsListViewer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    // 本地存储新闻内容，如何在终端显示
    // 1、抽象出对象
    // 2、设计好对象应该具有的属性、状态和行为
    // 3、思考对象之间的交互
    // 4、开始代码
    public static void main(String[] args) throws Exception {
	    // write your code here
        String resource_path = Main.class.getClassLoader().getResource("read_hub").getPath();

        NewsFactory newsReader = new NewsFactory(resource_path);
        ArrayList<News> newsList = newsReader.fetch();

        NewsListViewer viewer = new NewsListViewer(newsList);
        viewer.display();
    }
}

package com.littlejava;

import com.littlejava.model.News;
import com.littlejava.model.NewsFactory;
import com.littlejava.model.NewsWithRelated;
import com.littlejava.model.Viewable;
import com.littlejava.view.ListViewer;

import javax.swing.text.View;
import java.util.ArrayList;

public class Main {

    // 本地存储新闻内容，如何在终端显示

    // 1. 抽象出 对象
    // 2. 设计 对象应该具有的属性，状态和行为
    // 3. 思考 对象之间交互
    // 4. 开始写代码

    public static void main(String[] args) throws Exception {
        String resource_path = Main.class.getClassLoader().getResource("news").getPath();

        NewsFactory newsReader = new NewsFactory(resource_path);
        ArrayList<News> newsList = newsReader.fetch();

        ArrayList<Viewable> viewableList = new ArrayList<Viewable>();
        viewableList.addAll(newsList);

        ListViewer viewer = new ListViewer(viewableList);

        viewer.display();
    }
}


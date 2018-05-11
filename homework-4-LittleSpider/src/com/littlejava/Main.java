package com.littlejava;

import com.littlejava.model.*;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    // 本地存储新闻内容，如何在终端显示

    // 1. 抽象出 对象
    // 2. 设计 对象应该具有的属性，状态和行为
    // 3. 思考 对象之间交互
    // 4. 开始写代码

    public static void main(String[] args) throws Exception {
        // 广度优先搜索
        // 队列是一种数据结构．它有两个基本操作：在队列尾部加人一个元素，和从队列头部移除一个元素就是说，队列以一种先进先出的方式管理数据

        Queue<NewsWithRelated> newsQueue = new LinkedList<NewsWithRelated>();

        String startUrl = "https://readhub.me/topic/5bMmlAm75lD"; // 开始爬取的第一个url，从这个url开始爬
        NewsWithRelated startNews = UrlNewsReader.read(startUrl); //读取第一个url，返回...
        // add  增加一个元索  如果队列已满，则抛出一个IIIegaISlabEepeplian异常
        newsQueue.add(startNews);

        while (!newsQueue.isEmpty()) {
            // poll  移除并返回队列头部的元素  如果队列为空，则返回null
            NewsWithRelated current = newsQueue.poll();
            current.display();
            for (Map.Entry<String, String> entry : current.getRelateds().entrySet()) {
                String url = entry.getValue();// 获取相关文章的url
                NewsWithRelated next = UrlNewsReader.read(url);//用刚才url继续爬
                //猜想：当url不同的时候才能newsQueue.add()，咋写呢？
                for (Map.Entry<String, String> entryNext : next.getRelateds().entrySet()) {
                    String urlNext = entryNext.getValue();
                    if(urlNext.hashCode() != url.hashCode()){
                        NewsWithRelated third = UrlNewsReader.read(urlNext);
                        newsQueue.add(third);
                        Write write = new Write();
                        write.appendMethodB(urlNext);//写入文件，目前是写入txt
                    }
                }
                //猜想代码结束
//                newsQueue.add(next);
            }
        }

        // 第四次作业
        // 1. 实现在广度优先搜索过程中进行去重处理
        // 2. 实现把爬取的内容以json格式存储到本地
    }
}


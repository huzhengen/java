package com.littlejava.model;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public void writeFile(String str) {
//        String str = "this  is a program"; // 要写入的内容
        try {
            FileOutputStream out = new FileOutputStream("D:/Github/java/homework-4-LittleSpider/write.txt"); // 输出文件路径
            out.write(str.getBytes());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 使用FileWriter
     */
    public static void appendMethodB(String content) {
        try {
            //打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter("D:/Github/java/homework-4-LittleSpider/write.txt", true);
            writer.write(content);
            writer.write('\n');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

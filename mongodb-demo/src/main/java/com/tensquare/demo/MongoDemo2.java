package com.tensquare.demo;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * 条件查询
 * @author TianCi.Xiong
 * @since 2020/10/17 20:30
 */
public class MongoDemo2 {
    public static void main(String[] args) {
        MongoClient client = new MongoClient("192.168.220.132");//创建连接
        MongoDatabase spitdb = client.getDatabase("spitdb");//打开数据库
        MongoCollection<Document> spit = spitdb.getCollection("spit");//获取集合
        // 构建查询条件,查询浏览量大于1000的记录
        BasicDBObject bson = new BasicDBObject("visits", new BasicDBObject("$gt", 1000));
        FindIterable<Document> documents = spit.find(bson);//查询记录获取结果集合
        for (Document document : documents) { //
            System.out.println("内容：" + document.getString("content"));
            System.out.println("用户ID:" + document.getString("userid"));
            System.out.println("浏览量：" + document.getInteger("visits"));
        }
        client.close();//关闭连接
    }
}
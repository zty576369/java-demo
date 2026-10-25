package Study_School;

import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("name","gzmu");
        map.put("nage",30);
        map.put("class","软件工程");
        System.out.println(map);
        //查看键对象是否存在
        System.out.println(map.containsKey("name"));

        //获取指定键对象所对应的值
        System.out.println(map.get("class"));

        //获取map集合中所有的键对象
        System.out.println(map.keySet());

        //获取mao集合中所有的值对象
        System.out.println(map.values());
//
//        //替换制定键对象所对应的值
//        map.replace("name","zty");
//        System.out.println(map);

//        //删除指定的key键对象所对应的值
//        map.remove("class");
//        System.out.println(map);
        System.out.println("-------------");

        //获取所有键对象
        Set keySet=map.keySet();
        //获取keySet的迭代器
        Iterator iterator=keySet.iterator();

        while (iterator.hasNext()){
            Object key=iterator.next();
            //根据指定的键对象取值
            Object value = map.get(key);
            System.out.println(key+":"+value);
        }
        System.out.println("------------");
        Set entrySet=map.entrySet();
        Iterator iterator1=entrySet.iterator();
        while(iterator1.hasNext()){
            Map.Entry entry =(Map.Entry) iterator1.next();

            //获取每一个键对象
            Object key = entry.getKey();
            //获取每一个值对象
            Object value=entry.getValue();
            System.out.println(key+":"+value);

        }
        System.out.println("------------泛型讲解----------");
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("gzmu");
        arrayList.add("18");
        arrayList.add("age");
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}

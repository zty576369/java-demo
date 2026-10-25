package Study_School;

import java.util.HashSet;

public class Example {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("3");
        //set里面不允许有重复元素且遍历出来的是无序的元素，所以打印出来只有1,2,3
        //System.out.println(hashSet);
        hashSet.forEach(o->{System.out.println(o);});
    }
}

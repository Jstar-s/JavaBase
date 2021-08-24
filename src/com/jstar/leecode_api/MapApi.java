package com.jstar.leecode_api;

import com.sun.tools.classfile.ConstantPool;

import javax.swing.text.html.parser.Entity;
import javax.xml.transform.Source;
import java.util.*;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/7/10 8:42 上午
 */
public class MapApi {

    public static void test() {
        // HashMap has no order ,with faster travel speed, no repetitive key and can have one null key, not support multiThread
        Map<String,Integer> map = new HashMap<>();

        // same character as HashMap but not allow null key, support multiThread,but slower than HashMap
        Map<String,Integer> map1 = new Hashtable<>();

        //can record the order of insert,
        // if the HashMap capacity is large and the actual data is small, its traverse faster than hashMap, because its a linkedList
        Map<String,Integer> map2 = new LinkedHashMap<>();


        // achieved sortMap,  sorted by Key
        TreeMap<Integer,String> map4= new TreeMap<Integer,String>(new Comparator<Integer>(){
            /*
             * int compare(Object o1, Object o2) 返回一个基本类型的整型，
             * 返回负数表示：o1 小于o2，
             * 返回0 表示：o1和o2相等，
             * 返回正数表示：o1大于o2。
             * 目前是升序排列
             */
            public int compare(Integer a,Integer b){
                return a-b;
            }
        });

        map4.put(1,"a");
        map4.put(6,"b");
        map4.put(2, "c");
        map4.put(24, "e");
        map4.put(8, "f");

        for (Map.Entry<Integer, String> entry : map4.entrySet()) {
            System.out.println("key: " + entry.getKey() + "  value: " + entry.getValue());
        }


        // sorted by value ,We need transfer map to list than use Collections to sort;
        TreeMap<String, Integer> map5 = new TreeMap<>();

        map5.put("a",1);
        map5.put("b",5);
        map5.put("c",8);
        map5.put("d",6);
        map5.put("e",2);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map5.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        System.out.println("+++++++++++");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("key: " + entry.getKey() + "  value: " + entry.getValue());
        }
    }

    public static void test2() {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("a",1);
        map.put("b",5);
        map.put("c",8);
        map.put("d",6);
        map.put("e",2);

        // contains key
        boolean a = map.containsKey("a");
        System.out.println("contains Key a : " + a);

        // getOrDefault

        map.put("x", map.getOrDefault("x", 12));


        // travel
        for ( Object key: map.keySet()) {
            System.out.println(key);
        }

        List<String> list = new LinkedList<>(map.keySet());
        for (String s : list) {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        test();
//        test2();
        int a[]  = new int[]{0,12};

    }
}

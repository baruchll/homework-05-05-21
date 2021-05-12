package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        it2();
    }



    public static ArrayList<Integer> init(){
        int size;
        Random r = new Random();
        size = r.nextInt(10) + 1;
        ArrayList<Integer> res = new ArrayList<>();
        while (size > 0){
            res.add(r.nextInt(1000) + 1);
            size--;
        }
        return res;
    }


//    public void it1(){
//        ArrayList<Point> p = new ArrayList<Point>();
//        p.add(new Point(0, 4));
//        p.add(new Point(-3, -4));
//        p.add(new Point(6, 9));
//        p.add(new Point(-1, 0));
//        p.add(new Point(-6, -9));
//
//        Iterator<Point> it = p.iterator();
//        while (it.hasNext()){
//            Point temp = it.next();
//            if (temp.x < 0 && temp.y < 0) {
//                it.remove();
//            }
//
//        }
////        it = p.iterator();
////        while (it.hasNext()) {
////            System.out.println(it.next().toStrings());
////        }
//        System.out.println(p);
//    }


    public static void it2(){
        HashMap<Integer,ArrayList<Integer>> maps = new HashMap<>();
        Iterator<Integer> key = maps.keySet().iterator();
        Iterator<ArrayList<Integer>> value = maps.values().iterator();
        maps.put(1,init());
        maps.put(2,init());
        maps.put(3,init());
        maps.put(4,init());
        maps.put(5,init());



        while (key.hasNext()){
            ArrayList<Integer> sum = Prime(value.next());
            Iterator sumIt = sum.iterator();

            while (sumIt.hasNext()){
                Integer c = key.next();
                if (c != 10){
                    key.remove();
                }
            }


            }
        System.out.println(maps);
        }


    public static ArrayList Prime(ArrayList<Integer>num) {

        Iterator<Integer> rex = num.iterator();
        int sum = rex.next();
        int i = 2;
        boolean flag = false;

        while (rex.hasNext()){
            while (i < sum/2){
                if (sum/2 % i == 0 ){
                    flag = true;
                }
                i++;
                if (flag == true){
                    rex.remove();
                }
            }


        }
        return num;
    }
}

package com.example.controllerparameterdemo.util;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JoinUtil {

    public static String join(Enumeration<String> enumeration){
        return join(enumeration.asIterator());
    }

    public static String join(Iterator<String> iterator){
        List<String> list = new LinkedList<>();
        iterator.forEachRemaining(list::add);
        return String.join(",",list);
    }
}

package com.java.practises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "Mango", "Hello", "Dummy", "EveryOne");
	Map<Integer,List<String>> map=list.stream().collect(Collectors.groupingBy(String::length, Collectors.toList()));
	
	System.out.println(map);
	}
}

package com.jan11;

import java.util.Optional;

import java.util.stream.Stream;

public class Program3 {
	public static void main(String[] args) {
     String s="Xavier";
      Optional<String> reduce = s.chars().mapToObj(c->String.valueOf((char)c)).reduce((a, c) -> c + a);
      System.out.println(reduce.get());
	}
}

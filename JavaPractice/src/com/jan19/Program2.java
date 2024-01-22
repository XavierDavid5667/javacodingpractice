package com.jan19;

import java.util.Arrays;

public class Program2 {
	public static void main(String[] args) {
		String str="I am learning learning java java programming";
		String[] split = str.split(" ");
		int[] count=new int[split.length];
		boolean[] visited=new boolean[split.length];
		
		for(int i=0;i<split.length;i++) {
			int counter=1;
			count[i]=counter;
			if(visited[i]) {
				count[i]=0;
				continue;
			}
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					counter++;
					count[i]=counter;
					visited[j]=true;
				}
			}
		}
		System.out.println(Arrays.toString(count));
		
		for(int i=0;i<split.length;i++) {
			if(!visited[i]) {
				System.out.println(split[i]+" : "+count[i]);
			}
		}
	}
}

package com.demo.test;

import com.demo.stacks.MyStackList;

public class TestStackList {

	public static void main(String[] args) {
		MyStackList slist=new MyStackList();
		  slist.push(23);
		  slist.push(22);
		  slist.push(20);
		  slist.push(7);
		  slist.push(3);
		  slist.push(23);// stack is full
		  System.out.println("-------------------");
		  System.out.println(slist.pop());
		  System.out.println(slist.pop());
		  System.out.println(slist.pop());
		  System.out.println(slist.pop());
		  System.out.println(slist.pop());
		  System.out.println(slist.pop());//stack empty


	}

}

package com.demo.service;
import com.demo.service.*;


public class MyStudentStack<student> {
	Node top;
	class Node{
		String data;
		Node next;
		public Node(String data) {
			this.data = data;
			this.next=null;
		}
		
	}
	public MyStudentStack() {
		top=null;
	}
	
	
	//1. Push Student object into the stack
	public void pushStudent(Student) {
		Node newNode=new Node(Student);
		  if(!isEmpty()) {
			newNode.next=top;
		  }
		  top=newNode;
		  System.out.println("pushed : "+num);
		}
	
	//2. Pop Student object out of the stack

    public int popStudent() {
    	if(!isEmpty()) {
    		Node temp=top;
    		top=top.next;
    		temp.next=null;
    		return temp.data;
    	}else {
    		System.out.println("Stack is empty");
    		return -1;
    	}
    	
    }
    //3. print Student stack
	public String DisplayStudents() {
		if(!isEmpty()) {
		
    		Node temp=top;
    		top=top.next;
    		return temp.data;
    	}else {
    		System.out.println("Stack is empty");
    		return null;
    	}
    	
    }

	//4.Print all male students
	public student DisplayMales() {
		if (!isEmpty()) {
			if(gender==Male)
			{
				for(Node temp = top; temp.next!= null;)
				System.out.println(popStudent());
			}
			
		}
	}
	//5.Print all female students	
	public student DisplayFemales() {
		if (!isEmpty()) {
			if(gender==Female)
			{
				for(Node temp = top; temp.next!= null;)
				System.out.println(popStudent());
			}
			
		}
	}
	
	//6.Empty Stack using recursion
	public boolean isEmpty() {
		return top==null;
	}
}

	//7.

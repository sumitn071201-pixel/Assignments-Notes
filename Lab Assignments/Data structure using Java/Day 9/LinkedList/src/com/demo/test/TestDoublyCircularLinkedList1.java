package com.demo.test;

import com.demo.linkedlists.DoublyCircularLinkedList1;

public class TestDoublyCircularLinkedList1 {

	public static void main(String[] args) {
		DoublyCircularLinkedList1 clist=new DoublyCircularLinkedList1();
		clist.addNode(10);
		clist.addNode(20);
		clist.addNode(11);
		clist.addNode(1);
		clist.displayData();
		//clist.displayDataReverse();
		clist.addByPosition(1, 120);
		clist.addByPosition(3, 100);
		clist.addByPosition(7, 150);
		clist.addByPosition(20, 300);
		clist.displayData();
		
		//add by value
		/*clist.addByValue(100,10);
		clist.addByValue(110,20);
		clist.addByValue(150,1);
		//not found
		clist.addByValue(100,45);
		clist.displayData();*/
		
		//delete by position
		//clist.deleteByPosition(1);
		//clist.deleteByPosition(3);
		//clist.deleteByPosition(4);
		//clist.displayData();
		
		//delete by value
		/*clist.deleteByValue(10);
		clist.deleteByValue(11);
		clist.deleteByValue(1);
		clist.deleteByValue(45);
		clist.displayData();*/

}
}

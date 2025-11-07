package com.demo.linkedlists;

public class DoublyCircularLinkedList {
		Node head;
		class Node{
			int data;
			Node prev,next;
			public Node(int data) {
				this.data = data;
				prev=null;
				next=null;
			}
			
		}
		public DoublyCircularLinkedList() {
			head=null;
		}
		
		public void addNode(int val) {
			Node newNode=new Node(val);
			//if list is empty add at the head
			if(head==null) {
				head=newNode;
			}else {
				Node temp=head;
				//place temp at the last node
				while(temp.next!=head) {
					temp=temp.next;
				}
				temp.next=newNode;
				newNode.prev=temp;
				head.prev=temp.next;			
				
			}
			newNode.next=head;
						
		}
	
		public void addByValue(int val,int num) {
			Node newNode=new Node(val);
			if(head.data==num) {
				newNode.next=head.next;
				head.next=newNode;
			}else {
			Node temp=head;
			do {
				  temp=temp.next;
			}while(temp!=head && temp.data!=num);
				
			if(temp!=head) {
				newNode.next=temp.next;
				newNode.prev=temp;
				temp.next=newNode;
				if(newNode.next!=head) {
					newNode.next.prev=newNode;
				}
				
			}else {
				System.out.println(num+ " Not found");
			}
				
		}
	}
		public void addByPosition(int pos,int val) {
			if(head==null) {
				System.out.println("List is empty");
			}else {
			Node newNode=new Node(val);
			//add at the head node
			if(pos==1) {
				    newNode.next=head;
				    head.prev=newNode;
				    head=newNode;
			}else {
				//add in between
				//add at the end
				Node temp=head;
				int i=1;
				for(;temp.next!=head && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(i>pos-2) {
					newNode.next=temp.next;
					newNode.prev=temp;
					temp.next=newNode;
					if(newNode.next!=head) {
						newNode.next.prev=newNode;
					}
				}else {
					//given position is beyond the limit
					System.out.println(pos+" is beyond the limit");
				}
			}
			
			}	
		}
		public void deleteByValue(int val) {
		    if (head == null) {
		        System.out.println("list is empty");
		    } else {
		        Node temp = head;
		        // value is at head node
		        if (head.data == val) {
		            Node tail = head;
		            // place tail at the end
		            while (tail.next != head) {
		                tail = tail.next;
		            }
		            // if list has only one node and you want to delete the node
		            if (tail == head) {
		                head = null;
		            } else {
		                head = head.next;
		                head.prev = tail;
		                tail.next = head;

		                temp.next = null;
		                temp.prev = null;
		            }
		        } else {
		            // value found in between or at the end
		            Node prev = null;
		            while (temp.next != head && temp.data != val) {
		                prev = temp;
		                temp = temp.next;
		            }

		            if (temp.data == val) {
		                temp.prev.next = temp.next;
		                temp.next.prev = temp.prev;
		                temp.next = null;
		                temp.prev = null;
		            } else {
		                // value not found
		                System.out.println(val + " not found");
		            }
		        }
		    }
		}


		
		public void deleteByPosition(int pos) {
		    if (head == null) {
		        System.out.println("list is empty");
		    } else {
		        Node temp = head;
		        // if position is 1
		        if (pos == 1) {
		            Node tail = head;
		            while (tail.next != head) {
		                tail = tail.next;
		            }
		            // if list has only one node and pos == 1
		            if (tail == head) {
		                head = null;
		            } else {
		                head = head.next;
		                head.prev = tail;
		                tail.next = head;
		                temp.next = null;
		                temp.prev = null;
		            }
		        } else {
		            // value found in between or at the end
		            Node prev = null;
		            int i;
		            for (i = 1; temp.next != head && i < pos; i++) {
		                prev = temp;
		                temp = temp.next;
		            }

		            if (i == pos) {
		                temp.prev.next = temp.next;
		                temp.next.prev = temp.prev;

		                temp.next = null;
		                temp.prev = null;
		            } else {
		                System.out.println(pos+ "position is beyond the limit");
		            }
		        }
		    }
		}


		public void displayDataReverse() {
		    if (head == null) {
		        System.out.println("list is empty");
		    } else {
		        // place temp at the last node
		        Node temp = head;
		        while (temp.next != head) {
		            temp = temp.next;
		        }
		        do {
		            System.out.print(temp.data + "--->");
		            temp = temp.prev;
		        } while (temp != head);

		        System.out.println(head.data + "--->head");
		    }
		}

		
	
	    public void displayData() {
			if(head==null) {
				System.out.println("list is empty");
			}else {
				Node temp=head;
				do{
				   System.out.print(temp.data+"--->");
				   temp=temp.next;
				}while(temp!=head);
			}
			System.out.println("head");
			
		}

	}





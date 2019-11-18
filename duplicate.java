package Assignments;

import java.util.Scanner;

public class Remove_Duplicates {

  	//Node Class
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}

  	//Insert method (Insertion at the end of the linkedlist)
	public static void insert(int key) {
		Node temp=head;
		if(temp==null) {
			head=new Node(key);
			return;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node newNode=new Node(key);
		temp.next=newNode;
		newNode.next=null;
	}

  	//display the LinkedList
	public static void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}

  	//Remove method
	public static void remove_D(Remove_Duplicates li) {
		Node current=li.head;
		while(current!=null) {
			int data1=current.data;
			Node next_node=current.next;
			Node temp=current;
			while(next_node!=null) {
				int data2=next_node.data;
				if(data1==data2) {
					temp.next=next_node.next;
				}
				temp=temp.next;
				next_node=next_node.next;
			}
			current=current.next;
		}
	}

	public static void main(String args[]) {
		Remove_Duplicates rm=new Remove_Duplicates();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the LinkedList:- ");
		int n=sc.nextInt();
		System.out.print("Enter the elements:- ");
		for(int i=0;i<n;i++) {
			int el=sc.nextInt();
			insert(el);
		}
		remove_D(rm);
    		System.out.println("LinkedList:- ");
		display();
		sc.close();
	}
}

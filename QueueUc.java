package com.bridzelabz.stackAndQueue;

import java.util.*;

public class QueueUc<T> {
	LinkedList<Integer> ll = new LinkedList<>();
	private void enqueue(Integer i) {
		 this.ll.add(i);
	}
	public void dequeue(){
		if(this.ll.size() > 0) {
		this.ll.remove(this.ll.get(0));
		}else{
		System.out.println("No elements in Queue");
		}
		}
	public void peek(){
		if(this.ll.size() > 0) {
		System.out.println(this.ll.get(0));
		}else{
		System.out.println("No elements in Queue");
		}
		}
	
	public static void main(String[] args) {
		QueueUc<Integer> qu=new QueueUc<Integer>();
		qu.enqueue(56);
		qu.enqueue(30);
		qu.enqueue(70);
		System.out.println("Queue contains these elements : " + qu.ll);
		qu.dequeue();
		qu.dequeue();
		qu.dequeue();
		System.out.println("After removing elements :  "  + qu.ll);
		qu.peek();
	}

	
	

}

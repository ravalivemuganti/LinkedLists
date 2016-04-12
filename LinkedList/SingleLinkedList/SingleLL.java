package com.java;

public class SingleLL {

	private Node head;
	int counter;
	public SingleLL(Node n) {
		head = n;
		counter=0;
		increment();

	}
	
	int getSize(){
		return counter;
	}

	void increment(){
		counter++;
	}

	void decrement(){
		counter--;
	}

	
	void display(){
		Node pointer = head;
		while(pointer != null){
			System.out.println(pointer.getNodeValue());
			pointer = pointer.nextNode;
		}
	}
	
	void insertAtTheEnd(Node n){
		Node pointer = head;

		while(pointer.nextNode!=null){
			pointer=pointer.nextNode;
		}
		pointer.nextNode=n;
		increment();
	}

	//inserting a node at any given index
	public void insertAt(Node name, int index){
		//If the list is empty or the user is trying to add at an index which is out of range
		if(getSize()==0 || index>=getSize()){

			System.out.println("Sorry");

		} else{

			Node n=head;
			for(int i=0;i<index;i++)
			{
				n= n.nextNode;
			};
			Node temp=n.nextNode;
			n.nextNode=name;
			name.nextNode=temp;
			increment();
		}
	}

	//deleting a node at any index
	public void deleteAt(int index){
		// if the user is trying to delete the head or an element that is not in the list
		if(index==0 || index==getSize()){
			System.out.println("Sorry cannot delete the requested");
			
		}
		
		else
			// user trying to delete the last element in the list
			if(index==getSize()-1){
				Node pointer = head;
				for(int i=1;i<getSize()-1;i++){
					pointer = pointer.nextNode;
				}
				pointer.nextNode=null;
				decrement();

			}
			else if(index<getSize()-1){
				Node pointer=head;
				for(int i=0;i<index-1;i++)
				{
					pointer= pointer.nextNode;
				}

				Node temp=pointer.nextNode;
				pointer.nextNode=temp.nextNode;
				temp=null;
				decrement();
			}
		
	}

	
	
	public static void main(String[] args) {

		Node head = new Node("Ajay");
		Node node1 = new Node("Sadhu");
		Node node2 = new Node("Ravali");
		Node node3 = new Node("Vemuganti");
		Node node4 = new Node("Nandy");
		Node node5 = new Node("Manu");
		


		SingleLL sll = new SingleLL(head);
		// LL functions and usage
		sll.insertAtTheEnd(node1);
		sll.insertAtTheEnd(node2);
		sll.insertAtTheEnd(node3);
		sll.insertAtTheEnd(node4);
		//sll.insertAtTheEnd(node5);
		sll.insertAt(node5, 4);
		sll.display();
		System.out.println("Size of Single Linked List: "+sll.getSize());

	}

}
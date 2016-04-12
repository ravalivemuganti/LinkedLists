package com.java.stuff;


public class DoublyLinkList{
	

	Doublell head;
	Doublell temp;
	Doublell current;
	int size=0;
	
	public int getSize(){
		return size;
	}
	
	void increment(){
		size++;
	}

	void decrement(){
		size--;
	}
	

	public void addNodes(int data){
		
		try { 
			Doublell dll = new Doublell(data);
		
		if(head==null){
			head=dll;
			head.left=null;
			head.right=null;
		}else{
			current=head;
			while(current.right!=null){
				current=current.right;
			}

			current.right=dll;
			dll.left=current;
			dll.right=null;

		}
		increment();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public void insertNode(int data, int after){
		
		try{
		
		Doublell dll = new Doublell(data);
		
		int index= 0;
		current= head;
		
		while(index!=after){
			
			current=current.right;
			index++;
			
		}
	
		temp=current.right;
		current.right=dll;
		dll.right=temp;
		temp.left=dll;
		dll.left=current;
		increment();
		}
		
		catch(Exception e){
			System.out.println( "Cannot insert at" + " " + after + " " + "as it does not exist.");
			e.printStackTrace();
		}

	}

	public void deleteNode(int nodeNumber){
		
		int index=0;
		current = head;
		
		try{
			if(nodeNumber==0){
		
			head=current.right;
			current.right=null;
			current.left=null;
			
		}else{
			
			while(index!=nodeNumber){
				
				current=current.right;
				index++;
			}
			
			if(current.right==null){
				current.left.right=null;
				current.left=null;
				
			}else{
				
				current.left.right=current.right;
				current.right.left=current.left;
				
			}
		}decrement();
		}catch(Exception e){
			System.out.println("Cannot delete node"+ " "+nodeNumber+" " + "as it does not exist.");
			e.printStackTrace();
		}

	}
	
	public void display(){
		current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.right;
		}
	}

	public static void main(String args[]){

		
		DoublyLinkList dll = new DoublyLinkList();
		
		//Dll functions 
		dll.addNodes(9);
		dll.addNodes(2);
		dll.addNodes(3);
//		dll.addNodes(4);
//		dll.addNodes(5);
		dll.insertNode(7, 3);
		
//		System.out.println("size:" + " "+ getSize());
//		dll.display();
//		System.out.println(dll.getSize());
//		dll.deleteNode(4);
//		System.out.println("After deletion");
//		System.out.println(dll.getSize());
//		dll.display();

	}
}
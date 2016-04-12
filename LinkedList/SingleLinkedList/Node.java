package com.java;

public class Node {

	String value;
	Node nextNode;
	
	/* */
	Node(String value, Node thisNode){
		this.value = value;
		nextNode = thisNode;
	}
	
	Node(){
		value="emptyNode";
		nextNode=null;
	}
	Node(String value, String nextValue){
		this.value=value;
		nextNode = new Node(nextValue);
	}
	
	/*This will be run at initialization*/
	Node(String next){
		value=next;
		nextNode=null;
	}
	
	String getNodeValue(){
		return value;
	}
	
	Node getNextNode(){
		return nextNode;
	}
	
	void setNodeValue(String v){
		value=v;
	}
	void setNext(Node n){
		nextNode=n;
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
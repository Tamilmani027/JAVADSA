package SJB.DSA;

public class stack {
private int[] array;
private int size;
private int top;
public stack(int size) {
	super();
	this.size = size;
	array=new int[size];
	top=-1;
}
public boolean isFull() {
	return (top==size-1);
	
}
public boolean isEmpty() {
	return (top==-1);
}
public int peak(){
	if(isEmpty()) {
		System.out.println("Stack is empty");
		return -1;
	}
	else {
		return array[top];
	}
}
public void push(int item) {
	if(isFull()) {
		System.out.println("Stack is full");
		return ;
	}
	else {
		array[++top]=item;
	}
}
public int pop(){
	if(isEmpty()) {
		System.out.println("stack is empty");
		return -1;
	}
	else {
		int item=array[top-1];
		return item;
	}		
}
public void display() {
	for(int i=top;i>=0;i--) {
		System.out.println(array[i]);
	}
}
}

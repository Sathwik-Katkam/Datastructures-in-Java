import java.util.*;
import java.io.*;

public class MyStack { //making it public so that it can be accessed in a different class
	 private int size=0; // making variables private 
	 private int top;	 // so that they cannot be accessed using dot (.) operator
	 private  int a[];
	 
	//MyStack constructor
	public MyStack(int size_entered){
		size=size_entered;
		a=new int[size];
		top=-1;
	}
	
	//Method to check if the stack is empty
	boolean isEmpty() {
		return (top<0);
	}
	
	//Method to check if the stack is Full
	boolean isFull() {
		return (top==size-1);
	}
	
	//Pushing an element
	void push(int x) {
		
		if(top==size-1) // checking if the stack is already full  
		{
			System.out.println("UNABLE TO PUSH: STACK OVERFLOW");
		}
		else {
			a[++top]=x; //storing the element and then updating the top pointer (Variable)
			System.out.println(x+" is pushed into the stack");
		}
		
	}
	
	//popping an element
	void pop(){
		
		if(top<0) //checking if the stack is empty
		{
			System.out.println("UNABLE TO PUSH: STACK UNDERFLOW");
		}
		else {
			int x=a[top--]; 
			System.out.println(x+" is popped out of the stack");
		}
		
	}
	
	//peek element
	void peek() {
		if(top<0) {
			System.out.println("STACK UNDERFLOW");
		}
		else {
			int x=a[top];
			System.out.println(x+" is the topmost element");
		}
	}
	
}

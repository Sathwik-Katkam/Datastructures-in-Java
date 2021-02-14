public class MyStackImplementation {
	public static void main(String args[]) {
		MyStack s = new MyStack(5);
		
		//Available methods
		//1.isEmpty()
		//2.isFull()
		//3.push(int element_to_be_pushed)
		//4.pop()
		//5.peek()
		
		System.out.println(s.isEmpty());
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(9);
		s.push(7);
		s.push(7);
		
		System.out.println(s.isFull());
		
		s.pop();
//		s.peek();
		s.pop();
//		s.peek();
		s.pop();
//		s.peek();
		s.pop();
		s.pop();
		s.pop();
		
		s.peek();
		//s.top =-1; error as it is private
		//s.arr[4] = 7; error
		//s.size=6; error
	}
}

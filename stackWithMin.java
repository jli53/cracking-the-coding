public class stackWithMin extends Stack{
	Stack minStack;
	public stackWithMin(){
		minStack = new Stack();
	}
	public void push(int value){
		super.push(value);
		if(value <= min()){
			minStack.push(value);
		}
	}
	public Integer pop(){
		int value = (int)super.pop();
		if(value == min()){
			minStack.pop();
		}
		return value;
	}
	public int min(){
		return (int)minStack.peek();
	}
}
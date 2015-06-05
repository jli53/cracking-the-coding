public class TowerOfHanoi{
	public void move(Stack X, Stack Y, Stack Z, int N){
		move(X,Z,Y,N-1);
		Y.push(X.pop());
		move(Z,Y,X,N-1);
	}
}
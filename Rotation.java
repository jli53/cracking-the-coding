public class Rotation{
	public void rotate(int init[][]){
		int number = init.length;
		int[][] rotated = new int[number][number];
		for(int i = 0; i <= number-1; i++){
			for(int j = 0; j<= number-1; j++){
				rotated[4-j][i] = init[i][j];
			}
		}
		for(int i = 0; i<= number-1; i++){
			System.out.println(java.util.Arrays.toString(rotated[i]));
		}
	}
}
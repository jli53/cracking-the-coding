public class Reverse{
	public static void main(String[] args){
		int length = args[0].length();
		int index = 0;
		StringBuilder reverse = new StringBuilder(args[0]);
		for(; length > 0; length--){
			reverse.setCharAt(index, args[0].charAt(length-1));
			index++;
		}
		//reverse.setCharAt(index, '\0');
		System.out.println(reverse);
	}
}
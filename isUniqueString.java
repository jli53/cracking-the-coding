public class isUniqueString{
	public static void main(String[] args){
		boolean char_set[] = new boolean[256];
		if(args[0].length() > 256){
			System.out.println("false");
			return;
		}
		for(int i = 0; i < args[0].length(); i++){
			if(char_set[args[0].charAt(i)]){
				System.out.println("false");
				return;
			}
			char_set[args[0].charAt(i)] = true;
		}
		System.out.println("true");
		return;
	}
}
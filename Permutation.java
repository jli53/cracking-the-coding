public class Permutation{
	public void compare(String str1, String str2){
		int char_count[] = new int[256];
		for(int i =0; i<256; i++){
			char_count[i] = 0;
		}
		int length1= str1.length();
		int length2= str2.length();
		for(int i = 0; i < length1; i++){
			char_count[str1.charAt(i)]++;
		}
		for(int i = 0; i < length2; i++){
			if(--char_count[str2.charAt(i)] < 0){
				System.out.println("false");
				return;
			}
		}
		for(int i = 0; i < 256; i++){
			if(char_count[i] > 0){
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
		return;
	}
}

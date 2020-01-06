package arawind;

public class reverse {

	public static void main(String[] args) {
	 String reverse="";
	 String a="manwild";
	 int i;
		for(i=a.length()-1;i>=0;i--) {
			reverse=reverse+a.charAt(i);
			
		}System.out.println(reverse);

	}

}

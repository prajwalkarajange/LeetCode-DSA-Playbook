public class Demo26{
	public static void main(String[] args){
		String str="hello";
		char[] s=str.toCharArray();

		int i=0;
		int j=s.length-1;
		
		while(i<j){
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			
			i++;
			j--;
		}

		System.out.println(new String(s));
		
	}
}
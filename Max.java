public class Max{
	public static void main (String[] args) {
		int max=0;
		for(String arg :args){
			if(Integer.parseInt(arg) > max){
				max=Integer.parseInt(arg);
			}
			
		}
		System.out.println(max);
	}
}
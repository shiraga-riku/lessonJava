public class Pair{
	private int firstInt;
	private int secondInt;
	public static void main(String[] args){
		Pair p = new Pair(1,2);
		int first=p.first();
		int second=p.second();
	}

	
	public Pair(int firstInt,int secondInt){
		this.firstInt=firstInt;
		this.secondInt=secondInt;
	}
	public int first(){
		return this.firstInt;
	}
	public int second(){
		return this.secondInt;
	}
}
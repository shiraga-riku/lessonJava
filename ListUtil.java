import java.util.ArrayList;
import java.util.List;

public class ListUtil{
	public static void main (String[] args){
		var intList = List.of(1,2,3,4,5,6);
		List<Integer>evenList=ListUtil.evensof(intList);
		for(Integer e:evenList){
			System.out.println(e);
		}
		System.out.println(replicate(20,"riku"));
		var first=List.of(1,2,4,2);
		var second=List.of(8,7,5,6,6);
		System.out.println(zip(first,second));
		System.out.println(factors(0));
	}

	public static List <Integer> evensof(List<Integer>intList){
		List<Integer>evensList=new ArrayList<>();
		for(Integer e :intList){
			if(e%2==0){
				evensList.add(e);
			}
		}
		return evensList;
	}

	public static List <String> replicate(int length,String value){
		List<String>valueList=new ArrayList<>();
		for(int i=0;i<length;i++){
			valueList.add(value);
		}
		return valueList;
	}

	public static ArrayList<ArrayList<Integer>> zip(List<Integer>first,List<Integer>second){
		ArrayList<ArrayList<Integer>> pairs= new ArrayList<ArrayList<Integer>>();
		int index=0;
		if (first.size()<second.size()){
			index=first.size();
		} else {
			index=second.size();
		}
		for (int i=0;i<index;i++){
			ArrayList<Integer> pair= new ArrayList<>();
			pair.add(first.get(i));
			pair.add(second.get(i));
			pairs.add(pair);
		}
		return pairs;
	}

	public static List<Integer> factors(int value){
		List<Integer> factors=new ArrayList<>();
		if (value==0){
			return List.of(value);
		} 
		for (int factor = 1; factor <= value; factor++) {
			if (value % factor == 0) {
				factors.add(factor);
			}
		}
		return factors;
	}

	// public static List<Integer> perfects(int value){

	// }

	public static List<E> pairs(List<E>list){
		List<E> pairs=new ArrayList<>();
		
	}
}
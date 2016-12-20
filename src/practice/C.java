package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class C {
	
	public static void main(String[] args){
		
		List<String> names = new ArrayList();
		names.add("A");
		names.add("A");
		names.add("A");
		names.add("D");
		names.add("B");
		names.add("B");
		names.add("C");
		names.add("C");
		
		Map<String,Integer> namesMap = new HashMap<>();
		for(String s : names){
			int count =1;
			for(Entry<String,Integer> map : namesMap.entrySet()){
				if(map.getKey().equalsIgnoreCase(s)){
					count = map.getValue()+1;
				}
			}
			namesMap.put(s, count);
		}
		System.out.println("Please enter input :");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		
		List<String> list =C.getString(i, namesMap);
		System.out.println(list);
		
		
	}

	public static List<String> getString(int number,Map<String, Integer> nammesMap){
	      List<String> returnList = new ArrayList<>();

		for(String s:nammesMap.keySet()){
			if(number==nammesMap.get(s)){
				returnList.add(s);
			}
		}
		return returnList;
	}
	
	
}

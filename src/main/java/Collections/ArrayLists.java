package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for(Integer i : list2){
			list1.add(i);
		}
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		Integer sum = 0;
		for(Integer i : list1)
			sum+=i;
		for(Integer i : list2)
			sum+=i;
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(Integer i : original){
			if(toRemove!=i){
				ret.add(i);
			}
		}
        return ret;
    }

    public boolean happyList(ArrayList<String> original) {
		for(int i=0;i<original.size();++i){
			if(i-1>=0 && (!isHappy(original.get(i),original.get(i-1)))){
				return false;
			}
			if(i+1<original.size() && (!isHappy(original.get(i),original.get(i+1)))){
				return false;
			}
		}
        return true;
    }
	
	private boolean isHappy(String str1, String str2){
		for(int i = 0;i<str1.length();++i){
			if(str2.indexOf(str1.charAt(i))>=0){
				return true;
			}
		}
		return false;
	}
}

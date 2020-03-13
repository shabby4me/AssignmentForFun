package Collections;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
		if(map==null)
			return null;
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
		if(map==null){
			return new Object[0];
		}
		List<Object> l = new ArrayList<Object>();
		for(Object key : map.keySet()){
			if(map.get(key).equals(value))
				l.add(key);
		}
        return l.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
		/*
		if(size<0)
			return null;
		Map<Integer, Integer> ret = new HashMap<Integer, Integer>();

		if(size == 0)
			return ret;
		
		ret.put(1,1);
		if(size == 1)
			return ret;
		ret.put(2,1);
		int i=2;
		while(i<size){
			++i;
			ret.put(i,ret.get(i-1)+ret.get(i-2));
		}
		return ret;
		*/
		return crazySpiral(1,1,size);
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
		if(first==null || second==null|| size==null)
			return null;
		if(size<0)
			return null;
		Map<Integer, Integer> ret = new HashMap<Integer, Integer>();

		if(size == 0)
			return ret;
		
		ret.put(1,first);
		if(size == 1)
			return ret;
		ret.put(2,second);
		int i=2;
		while(i<size){
			++i;
			ret.put(i,ret.get(i-1)+ret.get(i-2));
		}
		return ret;
    }
}

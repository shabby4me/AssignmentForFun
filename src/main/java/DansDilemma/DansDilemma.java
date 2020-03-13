package DansDilemma;

import java.util.Set;
import java.util.HashSet;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
		/*
		Set<Double> results = new HashSet<Double>();
		Set<Double> added = new HashSet<Double>();
		add(results,added,input1);
		add(results,added,input2);
        return results.size();
		*/
		return dilemmaOfN(input1,input2);
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
		/*
        Set<Double> results = new HashSet<Double>();
		Set<Double> added = new HashSet<Double>();
		add(results,added,input1);
		add(results,added,input2);
		add(results,added,input3);
		return results.size();
		*/
		return dilemmaOfN(input1,input2,input3);
    }

    public Integer dilemmaOfN(Double... args){
		Set<Double> results = new HashSet<Double>();
		Set<Double> added = new HashSet<Double>();
		for(int i=0;i<args.length;++i){
			add(results, added, args[i]);
		}
        return results.size();
    }
	
	private void add(Set<Double> results, Set<Double> inputs, Double newNum){
		for(Double d : inputs){
			results.add(d+newNum);
			results.add(d-newNum);
			if(d!=newNum)
				results.add(newNum-d);
			results.add(d*newNum);
			if(newNum!=0)
				results.add(d/newNum);
			if(d!=0)
				results.add(newNum/d);
		}
		inputs.add(newNum);
	}
}

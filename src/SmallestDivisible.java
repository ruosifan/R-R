import java.util.ArrayList;

public class SmallestDivisible{
	
	public static void main(String[] args){
		SmallestDivisible newSD = new SmallestDivisible();
		System.out.println(newSD.goThroughOptimized(newSD.optimize(newSD.putInArray(1, 20))));
	}
	
	public ArrayList<Integer> putInArray(int min, int max){
		ArrayList<Integer> arrayOfNums = new ArrayList<Integer>();
	
		for (int i=min; i<=max; i++){
			arrayOfNums.add(i);
		}
		return arrayOfNums;
	}
	
	public ArrayList<Integer> optimize(ArrayList<Integer> arrayOfNums){
		ArrayList<Integer> optimized = arrayOfNums;
		
		for(int i=0; i<arrayOfNums.size(); i++){
			int number = arrayOfNums.get(i);
			for(int index=0; index<arrayOfNums.size(); index++){
				if((arrayOfNums.get(index)!=number) && arrayOfNums.get(index) % number == 0){
					optimized.remove(i);
				}
			}
		}
		
		return optimized;
	}
	
	public int findGCD(int x, int y){
		
		while(y>0 && x>0){
			if(x>=y){
				x=x-y;
			}
			else{
				y=y-x;
			}
		}
		
		if(x!=0){
			return x;
		} else {
			return y;
		}
	}
	
	public int goThroughOptimized(ArrayList<Integer> optimized){
		int greatestDivisible=0;
		while(optimized.size()>2){
			greatestDivisible = optimized.get(0)*optimized.get(1)/findGCD(optimized.get(0), optimized.get(1));
			optimized.remove(1);
			optimized.set(0, greatestDivisible);
		}
		return optimized.get(0);
	}
}

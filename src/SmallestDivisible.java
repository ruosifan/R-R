import java.util.ArrayList;

public class SmallestDivisible{
	
	public static void main(String[] args){
		UserInput askUser = new UserInput();
		ArrayList<Long> arrayOfNums = askUser.GetUserInput();
		long smallNum = askUser.getSmallNum();
		long largeNum = askUser.getLargeNum();
		
		List optimizeMe = new List();
		ArrayList<Long> optimized = optimizeMe.optimize(arrayOfNums);
		
		SmallestDivisible newSD = new SmallestDivisible();
		long result = newSD.goThroughOptimized(optimized);
		
		System.out.println("The smallest number divisible by all numbers between " + smallNum + " and " + largeNum + " is "+ result + ".");
	}
	
	
	public long findGCD(long x, long y){
		
		while(y>0 && x>0){
			if(x>=y){
				x=x-y;
			}
			else{
				y=y-x;
			}
		}
		
		if(y==0){
			return x;
		} else {
			return y;
		}
	}
	
	public long goThroughOptimized(ArrayList<Long> optimized){
		long greatestDivisible=0;
		
		while(optimized.size()>=2){
			
			greatestDivisible = (optimized.get(0)*optimized.get(1))/findGCD(optimized.get(0), optimized.get(1));
			
			optimized.remove(1);
			optimized.set(0, greatestDivisible);
		}
		
		return optimized.get(0);
	}
}

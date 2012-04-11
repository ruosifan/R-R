import java.util.ArrayList;


public class List{
	
	public ArrayList<Long> optimize (ArrayList<Long> arrayOfNums){
		ArrayList<Long> optimized = arrayOfNums;
		
		for(int i=0; i<arrayOfNums.size(); i++){
			Long number = arrayOfNums.get(i);
			for(int index=0; index<arrayOfNums.size(); index++){
				if((arrayOfNums.get(index)!=number) && arrayOfNums.get(index) % number == 0){
					optimized.remove(i);
				}
			}
		}
		return optimized;
	}
		
}
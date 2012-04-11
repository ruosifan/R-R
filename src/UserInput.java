import java.io.Console;
import java.util.ArrayList;

public class UserInput{
	
	private long smallNum;
	private long largeNum;
	ArrayList<Long> arrayOfNums = new ArrayList<Long>();
	
	public ArrayList<Long> GetUserInput(){
		Console c = System.console();
		smallNum = Integer.parseInt(c.readLine("What's the smallest number in your range? "));
		largeNum = Integer.parseInt(c.readLine("What's the largest number in your range? "));
		
		for (long i=smallNum; i<=largeNum; i++){
			arrayOfNums.add(i);
		}
		return arrayOfNums;
	}
	
	public long getSmallNum(){
		return smallNum;
	}
	
	public long getLargeNum(){
		return largeNum;
	}
	
}
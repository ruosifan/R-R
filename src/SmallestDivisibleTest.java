import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SmallestDivisibleTest {
	
	@Before
	public void setup(){
		
	}
	
	
	@Test
	public void shouldFindGCDOne() {
		SmallestDivisible findSD = new SmallestDivisible();
		assertEquals(1, findSD.findGCD(52, 425));
	}
	
	@Test
	public void shouldFindGCDTwenty(){
		SmallestDivisible findSD = new SmallestDivisible();
		assertEquals(20, findSD.findGCD(40, 420));
	}
	
	@Test
	public void shouldFindGCDForty(){
		SmallestDivisible findSD = new SmallestDivisible();
		assertEquals(40, findSD.findGCD(40, 400));
	}
	
	@Test
	public void shouldFindGCDAnswer(){
		SmallestDivisible findSD = new SmallestDivisible();
		assertEquals(20, findSD.findGCD(20, 232792560));
	}

	
	@Test
	public void shouldFindSmallestDivsibleTen() {
		SmallestDivisible findSD = new SmallestDivisible();
		ArrayList<Long> op = new ArrayList<Long>();
		for(long i=1; i<11; i++){
			op.add(i);
		}
		assertEquals(2520, findSD.goThroughOptimized(op));
	}
	
	@Test
	public void shouldFindSmallestDivsibleTwenty() {
		SmallestDivisible findSD = new SmallestDivisible();
		ArrayList<Long> op = new ArrayList<Long>();
		for(long i=1; i<21; i++){
			op.add(i);
		}
		assertEquals(232792560, findSD.goThroughOptimized(op));
	}
}

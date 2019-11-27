import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrandTest {
	public Grand x1=new Grand();
	@Test
	void testaddNum() {
		x1.addNum(2,3,4);
		assertEquals(2,x1.bag.getCount("a"));
	}
	
	@Test
	void testRemove() {
		x1.addNum(2,3,4);
		x1.Remove("a", 1);
		assertEquals(1,x1.bag.getCount("a"));
	}
	
	@Test
	void testAdjust() {
		x1.addNum(1, 1, 1);
		x1.grade_adjust();
		x1.bag.remove("a",5);
		x1.grade_adjust();
		
	}
	
	@Test
	void testmainFun() {
		
		x1.class_301(1,2,3);
		x1.bag.add("a",2);
		x1.class_301(1,0,0);
	}
}

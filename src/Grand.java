
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

public class Grand {

	public Bag<String> bag = new HashBag<String>();
	public float radio;
	public void class_301(int numa,int numb,int numc) {
		
		this.addNum(numa,numb,numc);
		
		grade_adjust();
		
	}
	
	public  void grade_adjust() {
		int sum=this.bag.getCount("a")+this.bag.getCount("b")+this.bag.getCount("c");
		radio=(float)this.bag.getCount("a")/sum;
		if(radio>0.8)
			System.out.println("the result is 'Excellent'");
		else
			System.out.println("the result is 'Not well'");
	}
	
	public  void addNum(int numa,int numb,int numc) {
		this.bag.add("a",numa);
		this.bag.add("b",numb);
		this.bag.add("c",numc);
	}
	
	public  int Remove(String letter,int num ) {
		if(num>this.bag.getCount(letter))
			return 0;
		else {
			boolean charge = bag.remove(letter, num);
			if(charge == true)
				return 1;
			else
				return 0;
		}
	}
	
}
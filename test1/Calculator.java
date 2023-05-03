package test1;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Calculator {
	int a=20,b=2;
  @Test(priority=1)
  public void addition() {
	 int c=a+b;
	 Assert.assertEquals(c,22);
  }
  @Test(priority=2)
  public void subtraction() {
	  int c=a-b;
		 Assert.assertEquals(c,18);
  }
  @Test(priority=3)
  public void multiplication() {
	  int c=a*b;
		 Assert.assertEquals(c,40);
  }
  @Test(priority=4)
  public void division() {
	  int c=a/b;
		 Assert.assertEquals(c,10);
  }
}

package test1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day9 {
	@Test(dataProvider="dp")
	  public void add(int num1,int num2,int expected) {
		  int actual=num1+num2;
		  Assert.assertEquals(expected,actual);
	  }
	  @DataProvider
	  public Object [][] dp(){
		  return new Object[][] {
			  new Object[] {1,2,3},
			  new Object[] {2,3,5},
		  };
	  }
	  @Test(dataProvider="dp1")
	  public void sub(int num1,int num2,int expected) {
		  int actual=num1-num2;
		  Assert.assertEquals(expected,actual);
	  }
	  @DataProvider
	  public Object [][] dp1(){
		  return new Object[][] {
			  new Object[] {2,1,1},
			  new Object[] {5,3,2},
		  };
	  }
	  @Test(dataProvider="dp2")
	  public void mul(int num1,int num2,int expected) {
		  int actual=num1*num2;
		  Assert.assertEquals(expected,actual);
	  }
	  @DataProvider
	  public Object [][] dp2(){
		  return new Object[][] {
			  new Object[] {1,2,2},
			  new Object[] {2,3,6},
		  };
	  }
	  @Test(dataProvider="dp3")
	  public void div(int num1,int num2,int expected) {
		  int actual=num1/num2;
		  Assert.assertEquals(expected,actual);
	  }
	  @DataProvider
	  public Object [][] dp3(){
		  return new Object[][] {
			  new Object[] {4,2,2},
			  new Object[] {10,5,2},
		  };
	  }
}
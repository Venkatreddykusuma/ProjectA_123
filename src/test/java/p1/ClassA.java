package p1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassA {
  @Test
  public void tC001() 
  {
	  Reporter.log("tc001 is executed successful",true);
  }
  @Test
  public void tC002() 
  {
	  Reporter.log("tc002 is executed successful",true);
  }
  @Test
  public void tC003() 
  {
	  Reporter.log("tc003 is executed successful",true);
  }
  
}

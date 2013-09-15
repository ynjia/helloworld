import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HelloWorldTest {

   private HelloWorld h;
	
   @Before
   public void setUp() throws Exception 
   {
      h = new HelloWorld();
   }

   @Test
   public void testHelloEmpty() 
   {
      assertEquals(h.getName(),"");
      assertEquals(h.getMessage(),"Hello, World!");
   }
	
   @Test
   public void testHelloWorld() 
   {
      h.setName("FMSD Continuous Delivery");
      assertEquals(h.getName(),"FMSD Continuous Delivery");
      assertEquals(h.getMessage(),"Hello FMSD Continuous Delivery!");
   }
}
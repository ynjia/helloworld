public class HelloWorld 
{
	
   private String name = "";

   public String getName() 
   {
      return name;
   }

   public String getMessage() 
   {
      if (name == "") 
      {
         return "Hello, World!";
      }
      else 
      {
         return "Hello " + name + "!";
      }
   }

   public void setName(String name) 
   {
      this.name = name;
   }

   public static void main(String[] args) { 
	  HelloWorld hw = new HelloWorld();
      if( args[0] != "" ) {
		hw.setName(args[0]);
      }
	  System.out.println(hw.getMessage());
   }	
}

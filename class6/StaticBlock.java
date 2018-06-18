class StaticBlock{
  static int n;
   static String colour;
   static{
      n = 5;
      colour = "red";
   }
   public static void main(String args[])
   {
      System.out.println( "value of n is "+n);
      System.out.println(" colour is "+colour);
   }
}
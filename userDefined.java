public class userDefined extends Exception {
   String name = "Anjali";
   int age= 21;

   userDefined(String name1,int age1)
   {
       name = name1;
       age=age1;
   }
   public void myexception()
   {
       System.out.println(name);
       System.out.println(age);
   }

}




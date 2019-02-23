object String {
   val greeting: String = "Hello, world!"

   def main(args: Array[String]) {
      println( greeting )

      var palindrome = "Dot saw I was Tod";
      var len = palindrome.length();
      
      println( "String Length is : " + len );

      var str1 = "Dot saw I was ";
      var str2 =  "Tod";
      
      println("Dot " + str1 + str2);

      // Format string
      var floatVar = 12.456
      var intVar = 2000
      var stringVar = "Hello, Scala!"

      var fs = printf("The value of the float variable is " + "%f, while the value of the integer " + "variable is %d, and the string" + "is %s", floatVar, intVar, stringVar);
      
      println(fs)

      val name = "James"
      
      println(s"Hello, $name")
      println(s"1 + 1 = ${1 + 1}")

      val height = 1.9d
      println(f"$name%s is $height%2.2f meters tall") //James is 1.90 meters tall

      println(s"Result = \n a \n b")
      println(raw"Result = \n a \n b")
      
   }
}
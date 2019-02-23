object Conditional {
   def main(args: Array[String]) {
      // if else
      var x = 20;

      if( x < 20 ){
         println("This is if statement");
      }
      else{
         println("This is else");
      }

      // elif (không thể định nghĩa lại value của biến
      // var x = 30; => Sai
      x = 30

      if( x == 10 ){
         println("Value of X is 10");
      } else if( x == 20 ){
         println("Value of X is 20");
      } else if( x == 30 ){
         println("Value of X is 30");
      } else{
         println("This is else statement");
      }

      // if in if
      x = 30;
      var y = 10;
      
      if( x == 30 ){
         if( y == 10 ){
            println("X = 30 and Y = 10");
         }
      }
   }
}
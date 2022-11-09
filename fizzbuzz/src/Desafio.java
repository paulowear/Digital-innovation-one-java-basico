import java.util.*;

public class Desafio {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        testFizzBuzz(num);
    
}
      
    public static void testFizzBuzz(int value){
      if(((value % 3) == 0) && ((value % 5) == 0)){
          System.out.print("FizzBuzz");
        return;
      }
      
      if((value % 3) == 0){
        System.out.print("Fizz");
        return;
      }
      
      if((value % 5) == 0){
        System.out.print("Buzz");
        return;
      }

      System.out.print(value);
      return;
}

}
import java.util.*;

public class BuscaSequencial {

public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    int inputValue;
    
    inputValue = leitor.nextInt();

    int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
    sequencialSearch(inputValue, elementos);
    
}

public static void sequencialSearch(int value, int[] inputArray){
    for(int i=0; i < inputArray.length; ++i){
      if(value == inputArray[i]){
        System.out.print("Achei "+value+" na posicao "+i);
        return;
      }
    }
    System.out.print("Numero "+value+" nao encontrado!");
}
}
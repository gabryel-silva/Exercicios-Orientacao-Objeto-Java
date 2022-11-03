package exercicio1;

import java.util.*;

public class Objeto {
    int num1;
    int num2;

    public void leitor(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        num1 = s.nextInt();
        num2 = s.nextInt();
        num1++;
        num2++;
        return;
    }

    public void comparacao(){
        if(num1 > num2){
            System.out.println("O primeiro número é maior que o segundo!");
            return;
        }else{
            if(num1 < num2){
                System.out.println("O segundo número é maior que o primeiro");
            }
            if(num1 == num2){
                System.out.println("São o mesmo número!");
            }
            return;
        }
    }
}

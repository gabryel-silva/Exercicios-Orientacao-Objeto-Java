package exercicio2;

import java.util.*;

public class Objeto {
    int numero;

    public void leitor(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = s.nextInt();
    }

    public void resultado(){
        if(numero%2 == 0){
            System.out.println("Este numero é par");
            return;
        }else{
            System.out.println("Este numero é ímpar");
        } 
    }
}

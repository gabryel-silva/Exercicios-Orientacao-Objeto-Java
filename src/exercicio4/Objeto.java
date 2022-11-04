package exercicio4;

import java.util.*;

public class Objeto {
    int a, b, c, soma1, soma2, soma3;
    public void leitor(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o comprimento dos 3 lados do triangulo: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
    }

    public void somaLados(){
        this.soma1 = b + c;
        this.soma2 = a + c;
        this.soma3 = a + b;
    }

    public void formaTriangulo(){
        if(a < soma1 && b < soma2 && c < soma3){
            System.out.println("Forma um triangulo");
        }else{
            System.out.println("Não forma um triangulo"); 
        }
    }
}

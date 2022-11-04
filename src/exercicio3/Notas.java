package exercicio3;

import java.util.*;

public class Notas {
    float n1, n2, n3, n4, nf, media, mediaFinal;
    void leitor(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite quanto o aluno tirou nas 4 notas: ");
        n1 = s.nextFloat();
        n2 = s.nextFloat();
        n3 = s.nextFloat();
        n4 = s.nextFloat();
    }

    public void media(){
       this.media = (n1+n2+n3+n4)/4;
       System.out.printf("Sua nota foi %f.1\n", media);
    }

    public void mediaFinal(){
        this.mediaFinal = (media+nf)/2;
    }

    public void leitorNf() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o o resultado do exame final: ");
        nf = s.nextFloat();
    }

    public void resultado(){
        if(media >= 6.0){
            System.out.println("Você está aprovado!");
        }else{
            if(media < 6.0){
                System.out.println("Você está de recuperação");
                leitorNf();
                if(mediaFinal >= 6.0){
                    System.out.printf("Sua nota foi %f.1\n", mediaFinal);
                    System.out.println("Você foi aprovado!");
                }else{
                    System.out.println("Vc reprovou!");
                }  
            }
        }
    }
}

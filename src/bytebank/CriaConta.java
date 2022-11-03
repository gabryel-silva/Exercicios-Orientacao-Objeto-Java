package bytebank;

public class CriaConta {
    public static void main(String[] args){
            //Referência => conta
        Conta conta = new Conta(1337,54863);
        
        Cliente gabryel = new Cliente();
        gabryel.setNome("Gabryel Silva");
        conta.setTitular(gabryel);

        conta.getTitular().setProfissao("Front-end developer");
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());
    }
}

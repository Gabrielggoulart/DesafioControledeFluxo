package controledefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            int numeroUm = teclado.nextInt();
            
            System.out.println("Digite o segundo número: ");
            int numeroDois = teclado.nextInt();

            try{
                contar(numeroUm, numeroDois);
            }
            catch(ParametrosInvalidosException e){
                System.out.println("O primeiro numero tem que ser menor que o segundo numero");
            }
        }
    }

    public static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        
        if(numeroUm > numeroDois){
            throw new ParametrosInvalidosException();

        }else{
            int contador = numeroDois - numeroUm;

            for(int i = 1 ; i <= contador; i++){
                System.out.println("Imprimindo o numero " + i);
            }
        }
    }
}

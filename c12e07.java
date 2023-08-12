package Exerci_MOD3;
import java.util.Scanner;
public class c12e07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome[] = new String[50];
        int notaF[] = new int[50];
        String conceito="";
        for (int aux=0; aux<nome.length;aux++){
            System.out.println("Digite seu nome: ");
            nome[aux] = teclado.nextLine();
            System.out.println("Digite sua nota final: ");
            notaF[aux] = teclado.nextInt();
            teclado.nextLine();
            if(notaF[aux]<=30){
            conceito = "D";
            }
            else if (notaF[aux]>30 && notaF[aux]<=60){
            conceito = "C";

            } 
            else if (notaF[aux]>=60 && notaF[aux]<=80){
            conceito = "B";
            }
            else if (notaF[aux]>80){
            conceito = "A";

            }
            System.out.print("Nome: "+nome[aux]+ "Conceito: "+conceito);

        }
        teclado.close();

    }
}

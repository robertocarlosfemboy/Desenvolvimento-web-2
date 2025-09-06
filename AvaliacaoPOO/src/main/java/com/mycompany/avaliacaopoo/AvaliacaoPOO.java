/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avaliacaopoo;

/**
 *
 * @author CEDUP16
 */
public class AvaliacaoPOO {

    public static void main(String[] args) {
        System.out.println("");

        int vetor[] = {3, 9, 27 ,81, 243, 729, 2187, 6561, 19683, 59049};
        int razao = vetor[1] / vetor[0];
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        //for (i = 0; i < 10; i++){
            i1 = vetor[1] / vetor[0];
            i2 = vetor[2] / vetor[1];
            i3 = vetor[3] / vetor[2];
            i4 = vetor[4] / vetor[3];
            i5 = vetor[5] / vetor[4];
            i6 = vetor[6] / vetor[5];
            i7 = vetor[7] / vetor[6];
            i8 = vetor[8] / vetor[7];
            i9 = vetor[9] / vetor[8];
        //}
        if (i1 == i2 && i2 == i3 && i3 == i4 && i4 == i5 && i5 == i6 &&
                i6 == i7 && i7 == i8 && i8 == i9){
            System.out.println("É uma progressão geométrica.");
            System.out.println("O próximo número é: " + vetor[9] * razao);}
        else
            System.out.println("Não é uma progressão geométrica.");
        
        
    }
    
    }
















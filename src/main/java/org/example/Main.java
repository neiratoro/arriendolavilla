package org.example;

import org.example.MODELOS.Apartamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("SISTEMAS DE ARRIENDO 2024-2");
        System.out.println("*****************************");

        System.out.println(" \n Bienvenido !!! ");

        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();
        System.out.print("Digite el Id del apartamento: ");
        apartamento.setId(lea.next());
        System.out.print("Nombre arrendatario: ");
        apartamento.setArrendatario(lea.nextLine());//
        System.out.print("Digite fecha de vencimiento: ");
        apartamento.setFechaVencimiento(lea.nextLine());
        System.out.print("Costo del arriendo: ");
        apartamento.setCostoArriendo(lea.nextInt());// (lea.nextLine()); // con setNombre llamo las clases


    }
}
package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 * Deskripsi Program : program ini berisi program untuk menampilkan perhitungan
 * lingkaran  yang inputannya berasal dari user dengan konsep oop
 */
public class Main {

    public static void main(String[] args) {
        Lingkaran lingkar = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        lingkar.validasiInput();
        lingkar.hasilPerhitungan(lingkar.diameter);
    }
}

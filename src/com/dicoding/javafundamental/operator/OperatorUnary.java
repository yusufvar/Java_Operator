package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] Args){
        System.out.println("Operator Unary plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 = "+hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Nilai -5 = "+nilaiAwal2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = "+nilaiAwal3);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebessar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = "+nilaiAwal4);
        System.out.println();

        System.out.println("Operator komplemen logika");
        boolean suskes = false;
        System.out.println("Hasil !false = "+!suskes);
        System.out.println();

    }
}

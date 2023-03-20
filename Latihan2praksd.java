
package com.main.latihan2praksd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Latihan2praksd {

    public static void main(String[] args) {
      ArrayList<String> hewan = new ArrayList<>();
      
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Nama Hewan Yang DiTambahakan : ");
        System.out.println(hewan);

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        ArrayList<String> deletedData = new ArrayList<>();

        for (String warna : deleteHewan) {
            hewan.removeIf(h -> h.equals(warna));
            deletedData.add(warna);
        }

        System.out.println("\nHewan yang dihapus : ");
        System.out.println(deletedData);
        System.out.println("\nOutput Hewan Setelah DiHapus : ");
        System.out.println(hewan);
    }
   }


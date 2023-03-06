/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan;

/**
 *
 * @author MUHAMMAD ISHANUDDIN
 */
public class Manggil {
 public static void main(String[] args){
     Hewan[] banyakhewan = new Hewan[2];
     banyakhewan[0] = new Kucing("Kitty", 5);
     banyakhewan[1] = new Anjing("Doggy", 2);
     

     
     for (Hewan hewan : banyakhewan) {
         System.out.println(hewan.getNama()+ " bersuara " + hewan.getSuara() + " dengan umur " + hewan.getUmur() + " tahun");
     }
     
     Sayap[] terbang = new Sayap[1];
     terbang[0] = new Burung("Kakak Tua");
     
     for (Sayap sayap : terbang){
         sayap.terbang();
     }
     
      try {
         Anjing anjing = new Anjing(null, 5);
     } catch (Error e){
         System.out.println(e.getMessage());
     }
     

 }   
}

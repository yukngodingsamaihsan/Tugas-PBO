/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan;

/**
 *
 * @author MUHAMMAD ISHANUDDIN
 */
public class Burung implements Sayap {

    private String nama;
    
    public Burung(String nama){
        this.nama = nama;
    }
    
    @Override
    public void terbang() {
        System.out.println("Burung "+ nama + " bisa terbang");
    }
    
}

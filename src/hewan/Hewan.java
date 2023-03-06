/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;

/**
 *
 * @author MUHAMMAD ISHANUDDIN
 */
public abstract class Hewan {

    /**
     * @param args the command line arguments
     */
    private String nama;
    private int umur;
    
        public Hewan(String nama, int umur){
            this.nama = nama;
            this.umur = umur;
        }
        
     public String getNama(){
        return nama;
    }
     
     public int getUmur(){
         return umur;
    }
     
    public abstract String getSuara();
     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan;

/**
 *
 * @author MUHAMMAD ISHANUDDIN
 */

public class Anjing extends Hewan {
    public Anjing(String nama, int umur){
        super(nama,umur);
        if (nama == null) {
        throw new Error ("Nama tidak boleh kosong");
    }
    }
    
    @Override
    public String getSuara(){
        return "Woof";
    }
}

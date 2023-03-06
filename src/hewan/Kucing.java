/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan;

/**
 *
 * @author MUHAMMAD ISHANUDDIN
 */
public class Kucing extends Hewan {
    public Kucing(String nama, int umur) {
        super(nama,umur);
    }
    
    @Override
    public String getSuara(){
        return "Meow";
    }
}

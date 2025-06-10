/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 * Nama  : [Roffi Azra Khairan]
 * NPM   : [2310010450]
 * Kelas : [4A reg pagi]
 */

public class Rumus {
    int sisi;
    int panjang;
    int lebar;
    int hasil;
    
    public Rumus(){
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }
    
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        system.out.println("Luas Persegi: " + hasil);
    }
    
    public void setLuasPersegiPanjang() {
        hasil = panjang * lebar;
        system.out.println("Luas persegi panjang: " + hasil):   
    }
    
    public int getHasil(){
        return hasil;
    }
}

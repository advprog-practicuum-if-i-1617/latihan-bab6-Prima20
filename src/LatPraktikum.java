/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latpraktikum;

/**
 *
 * @author ASUS
 */
public class LatPraktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karyawan e1 = new Karyawan("Rooney",4);
        Karyawan e2 = new Karyawan("Herrera",7);
        SoftwareEngineering sf1 = new SoftwareEngineering("De Gea",4);
        SoftwareEngineering sf2 = new SoftwareEngineering("Fosu Mensah",7);
        ProjectManager pm1 = new ProjectManager("Rojo",4);
        ProjectManager pm2 = new ProjectManager("Blind",11);
        
        System.out.println("Nama : " + e1.getNama()+" Gaji per bulan Rp"+e1.getTotalGaji());
        System.out.println("Nama : " + e2.getNama()+" Gaji per bulan Rp"+e2.getTotalGaji());
        System.out.println("Nama : " + sf1.getNama()+" Gaji per bulan Rp"+sf1.getTotalGaji());
        System.out.println("Nama : " + sf2.getNama()+" Gaji per bulan Rp"+sf2.getTotalGaji());
        System.out.println("Nama : " + pm1.getNama()+" Gaji per bulan Rp"+pm1.getTotalGaji());
        System.out.println("Nama : " + pm2.getNama()+" Gaji per bulan Rp"+pm2.getTotalGaji());
        
        
        
        
    }
    
}

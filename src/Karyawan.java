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
public class Karyawan {
    protected String nama;
    protected final double gajiPokok = 2500000;
    protected int masaKerja;
    protected double bonus;
    public Karyawan(String nama, int masaKerja){
        this.nama = nama;
        this.masaKerja = masaKerja;
    }
    public String getNama(){
        return nama;
    }
    public double Bonus(){
        if(this.masaKerja > 5){
            this.bonus = 250000;
        }
        else{
            this.bonus = 0;
        }
        return bonus;
    }
    public double getGajiPokok(){
        return gajiPokok;
    }
    public double getTotalGaji(){
        return getGajiPokok() + Bonus();
    }
    
}
class SoftwareEngineering extends Karyawan{
    private final double tunjanganSE = 5500000;

    public SoftwareEngineering(String nama, int masaKerja) {
        super(nama, masaKerja);
    }
    
    public double getTunjangan(){
        return tunjanganSE;
    }

    @Override
    public double Bonus() {
         return super.Bonus() + 300000; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public double getTotalGaji() {
        return super.getGajiPokok() + Bonus() + getTunjangan(); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
class ProjectManager extends Karyawan{
    private final double tunjanganPM = 6000000;

    public ProjectManager(String nama, int masaKerja) {
        super(nama, masaKerja);
    }
    
    public double getTunjangan(){
        return tunjanganPM;
    }

    @Override
    public double Bonus() {
        if(masaKerja >= 10){
            return this.bonus = 700000 + 450000;
            
        }
        else{
            return this.bonus = 225000 + 450000;
        }
    //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public double getTotalGaji() {
        return super.getGajiPokok()  +super.Bonus() + Bonus() + getTunjangan(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}


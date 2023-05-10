/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ptm05;

public class Ptm05 {

    public static void main(String[] args) {
    
    
    Alamat alamat = new Alamat();
    alamat.kota = "Banjarbaru";
    alamat.kecamatan = "Cempaka";
    alamat.desa = "Bangkal";
    alamat.no = 48;
    
    Alamat alamatmu = new Alamat();
    alamatmu.kota = "Banjarmasin";
    alamatmu.kecamatan = "Aluh Aluh";
    alamatmu.desa = "Bakambat";
    alamatmu.no = 21;
    
    Alamat alamatku = new Alamat();
    alamatku.kota = "Banjarbaru";
    alamatku.kecamatan = "Landasan Ulin";
    alamatku.desa = "Guntung Manggis";
    alamatku.no = 11;
    
    alamat.info();
    alamatmu.info();
    alamatku.info();
    
    }
}

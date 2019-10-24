
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan aktivitas
 *                     Living Thing.
 *  
 */

package pbo1.pkg10118033.latihan62;

public class PBO110118033Latihan62 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setNama("Rizki Adam Kurniawan");
        human1.walk(human1.getNama());
        human1.breath(human1.getNama());
        human1.eat(human1.getNama());
    }    
}
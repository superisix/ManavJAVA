import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double kiloArmut, kiloElma, kiloDomates;
            double fiyatArmut = 2.14;
            double fiyatElma = 3.67;
            double fiyatDomates = 5.35;
    
            System.out.println("Armut Kaç Kilo? ");
            kiloArmut = scan.nextDouble();
    
            System.out.println("Elma Kaç Kilo? ");
            kiloElma = scan.nextDouble();
    
            System.out.println("Domates Kaç Kilo? ");
            kiloDomates = scan.nextDouble();
    
            if (kiloArmut > 0 && kiloElma > 0 && kiloDomates > 0) {
                double toplamFiyat = (kiloArmut * fiyatArmut) + (kiloElma * fiyatElma) + (kiloDomates * fiyatDomates);
    
                System.out.println("Armut fiyatınız: " + (kiloArmut * fiyatArmut));
                System.out.println("Elma fiyatınız: " + (kiloElma * fiyatElma));
                System.out.println("Domates fiyatınız: " + (kiloDomates * fiyatDomates));
                System.out.println("Toplam ödeme tutarı: " + toplamFiyat);
            } else {
                System.out.println("Lütfen sadece aldığınız ürünleri yazınız ve kilo miktarlarını pozitif giriniz!");
            }
        }
        
    }
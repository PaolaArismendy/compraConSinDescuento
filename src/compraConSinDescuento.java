import java.util.Scanner;

public class compraConSinDescuento {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        double valorCompra = sc.nextDouble();
        double descuento = valorCompra * 0.15;
        if (valorCompra > 200000) {
            System.out.println("Total: " + (valorCompra - descuento)); 
        } else {System.out.println("Total: " + valorCompra);}
        sc.close();
    }
}

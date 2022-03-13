package Kasus2;

public class RestaurantMain {
public static void main(String[] args) {
    Restaurant menu = new Restaurant();
    menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Gehu", 1_000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Tahu", 1_000, 0);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Molen", 1_000, 20);
    menu.tampilMenuMakanan();
    System.out.println("====== PESANAN ======");
    menu.pembelian("Bala-Bala", 15);
    menu.pembelian("Gehu", 20);
    menu.pembelian("Tahu", 2);
    menu.pembelian("Molen", 4);	
    System.out.println("====== MENU TERBARU ======");
    menu.tampilMenuMakanan();
    }
}
package model;

public class userView {
    
    public static void main(String[] args) {
        Owner cliente1= new Owner("Daniel");
        Owner cliente2= new Owner("Jazmín");
        System.out.println(cliente1.getNombre());
        System.out.println(cliente2.getNombre());
    }
}

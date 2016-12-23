/**
 * Created by johnm on 2016-12-15.
 */
public class ex19 {
    public static void main(String[] args){
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer{
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p){
        if(money<p.price) {
            System.out.println("거지새꺄!!!! ");
            return;
        }

        money -= p.price;
        add(p);
    }

    void add(Product p){
        if(i>=cart.length) {
            Product[] temp = new Product[this.cart.length*2];
            System.arraycopy(cart, 0, temp, 0, cart.length);
            this.cart = temp;
        }

        cart[i] = p;
        i++;
    }

    void summary(){

        int total = 0;
        for(int i=0; i<cart.length; i++){
            if(cart[i] == null)
                break;
            System.out.print(cart[i] +",");
            total += cart[i].price;
        }
        System.out.println();
        System.out.println("합계 : " +total+ "남은금액 : " +money);
    }
}

class Product{
    int price;

    Product(int price){
        this.price = price;
    }
}

class Tv extends Product{
    Tv() { super(100); }

    public String toString() { return "Tv"; }
}

class Computer extends Product{
    Computer() { super(200); }

    public String toString() { return "Computer"; }
}

class Audio extends Product{
    Audio() { super(50); }

    public String toString() { return "Audio"; }
}
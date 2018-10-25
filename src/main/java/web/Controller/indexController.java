package web.Controller;

public class indexController {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("橋本");
        Product card2 = factory.create("okeya");
        Product card3 = factory.create("yasuda");

        card1.use();
        card2.use();
        card3.use();
    }
}

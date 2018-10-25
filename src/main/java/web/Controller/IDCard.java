package web.Controller;

public class IDCard extends Product {
    private String owner;
    private int number;

    IDCard(String owner, int number) {
        System.out.print( owner + "のカードを作ります。");
        this.owner = owner;
        this.number = number;
    }

    public void use() {
        System.out.print( "No" + String.valueOf(number) + "のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }
}

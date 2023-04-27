package ex05;

class ReferBook extends Book {
    private double taxRate;

    public ReferBook(String id, double price, String publisher, double taxRate) {
        super(id, price, publisher);
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTotalPrice() {
        return price * (1 + taxRate/100);
    }
}


package ex05;

class TextBook extends Book {
    private String condition;

    public TextBook(String id, double price, String publisher, String condition) {
        super(id, price, publisher);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public double getDiscountedPrice() {
        if (condition.equals("cũ")) {
            return price * 0.7; 
        } else {
            return price;
        }
    }
}


package ex01;

public enum Type {
    A('A'),
    B('B'),
    C('C'),
    D('D'),
    E('E'),
    F('F');
    private char c;
    Type(char c) {
        this.c = c;
    }
    public char getText() {
        return c;
    }

    @Override
    public String toString() {
        return c+"";
    }
}


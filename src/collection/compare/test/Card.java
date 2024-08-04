package collection.compare.test;

public class Card implements Comparable<Card> {
    private CardShape shape;
    private int number;

    public Card(CardShape shape, int number) {
        this.shape = shape;
        this.number = number;
    }

    @Override
    public int compareTo(Card anotherCard) {
        if (this.number != anotherCard.number) {
            return Integer.compare(this.number, anotherCard.number);
        } else {
            return this.shape.compareTo(anotherCard.shape);
        }
    }

    @Override
    public String toString() {
        return number + "(" + shape.getIcon() + ")";
    }

    public int getNumber() {
        return number;
    }
}

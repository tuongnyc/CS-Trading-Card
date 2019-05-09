public class Card implements Comparable<Card> {
    private String name;
    private String nationality;
    private int yearBorn;
    private int yearDied;

    public Card(String nm, String nt, int yb, int yrD) {
        name = nm;
        nationality = nt;
        yearBorn = yb;
        yearDied = yrD;
    }

    public int compareTo(Card card) {
        if(this.name.equals(card.name))
            return 0;
        else
            return this.name.compareTo(card.name);
    }

    public String toString() {
        if(yearDied > 0) {
            return name + "(" + yearBorn + "-" + yearDied + ") - " + nationality;
        }
        else
            return name + "(" + yearBorn + "-" + "present" + ") - " + nationality;
    }
}

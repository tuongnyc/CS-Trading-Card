import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CardCollection {
    private String owner;
    private ArrayList<Card> myCollection;

    public CardCollection(String nm) {
        owner = nm;
        myCollection = new ArrayList<Card>();
    }

    public boolean addCard(Card myCard) {
        if(!myCollection.contains(myCard)) {
            myCollection.add(myCard);
            Collections.sort(myCollection);  // sort it.
            return true;
        }
        return false;
    }

    public void removeCard(int index) {
        if( index >= myCollection.size()) {
            return;
        }
        else {
            myCollection.remove(index);
        }
    }

    public int getSize() {
        return myCollection.size();
    }

    public ArrayList<Card> mergeCollections(CardCollection myColl) {
        for( Card i : myColl.myCollection) {
            if(!myCollection.contains(i)) {
                myCollection.add(i);
            }
        }
        Collections.sort(myCollection);
        myColl.myCollection.clear();
        return myCollection;
    }

    public String toString() {
        String tmp = owner;
        tmp += "\n-----\n";
        for(Card card : myCollection) {
            tmp += card + "\n";
        }
        return tmp;
    }
}

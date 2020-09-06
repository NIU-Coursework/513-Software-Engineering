import java.util.Observable;
import java.util.StringTokenizer;

public class ElectionResults extends Observable {
    int democrats;
    int republicans;
    int crazies;

    void ElectionResults() {
        democrats = 0;
        republicans = 0;
        crazies = 0;
    }

    String getCurrentWinner() {
        // Compute current winner here
        String currentWinner = "Democrats";
        if (democrats == republicans && democrats == crazies) {
            currentWinner = "Tied";
        } else if (republicans > democrats && republicans > crazies) {
            currentWinner = "Republicans";
        } else if (crazies > republicans && crazies > democrats) {
            currentWinner = "Crazies";
        } else if (republicans == democrats) {
            currentWinner = "Tied Democrats & Republicans";
        } else if (republicans == crazies) {
            currentWinner = "Tied Republicans & Crazies";
        } else if (crazies == democrats) {
            currentWinner = "Tied Democrats & Crazies";
        }

        return currentWinner;
    }

    void addNewResults(int dems, int reps, int craz) {
        democrats += dems;
        republicans += reps;
        crazies += craz;
        setChanged();
        notifyObservers();
    }
}

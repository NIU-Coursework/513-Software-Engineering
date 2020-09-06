import java.util.Observable;
import java.util.Observer;

class LeaderBoard implements Observer {
    String currentLeader;

    public LeaderBoard(Observable observable) {
        currentLeader = "Unknown";
        observable.addObserver(this);
    }

    void postLeader() {
        System.out.printf("The current leader is %s", currentLeader);
        System.out.println();
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof NewsFeed) {
            NewsFeed feed = (NewsFeed) o;
            this.currentLeader = (String) arg;
            this.postLeader();
        }
    }
}

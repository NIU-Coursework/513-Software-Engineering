import java.time.LocalDateTime;
import java.util.Observable;
import java.util.Observer;

class NewsFeed extends Observable implements Observer {
    int newsDemocrats;
    int newsRepublicans;
    int newsCrazies;

    public NewsFeed(Observable observable) {
        newsDemocrats = 0;
        newsRepublicans = 0;
        newsCrazies = 0;
        observable.addObserver(this);
    }

    void broadCast() {
        System.out.println("---");
        System.out.println(LocalDateTime.now());
        System.out.printf("Democrats %d,  Republicans % d, Crazies % d", newsDemocrats, newsRepublicans, newsCrazies);
        System.out.println();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ElectionResults) {
            ElectionResults result = (ElectionResults) o;
            this.newsDemocrats = result.democrats;
            this.newsRepublicans = result.republicans;
            this.newsCrazies = result.crazies;
            this.broadCast();
            setChanged();
            notifyObservers(((ElectionResults) o).getCurrentWinner());
        }
    }
}


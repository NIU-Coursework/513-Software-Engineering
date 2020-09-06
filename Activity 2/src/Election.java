public class Election {
    public static void main(String[] args) {
        ElectionResults results = new ElectionResults();
        NewsFeed electionNews = new NewsFeed(results);
        LeaderBoard electionLeaderBoard = new LeaderBoard(electionNews);

        results.addNewResults(10, 8, 13);
        results.addNewResults(12, 7, 8);
    }
}

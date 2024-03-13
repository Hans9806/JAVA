package collection.ex.ex4_3;

public class Candidate {

    private String name;
    private int votes;

    public Candidate(String name, int votes) {
        this.name = name;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    void receiveVote() {
        votes++;
    }

    @Override
    public String toString() {
        return name + " : " + votes +"표";
    }
}

package collection.ex.ex4;

public class Candidata {
    private String name;
    private int votes;

    public Candidata(String name) {
        this.name = name;
        this.votes = 0;
    }
    public void receiveVote() {
        this.votes++;
    }
    public String getName() {
        return this.name;
    }
    public int getVotes() {
        return this.votes;
    }
    @Override
    public String toString(){
        return  this.name + ": " + this.votes;
    }
}

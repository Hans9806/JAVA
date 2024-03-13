package collection.ex.ex4_1;

public class Candidata {
    private String name;
    private int votes;

    @Override
    public String toString(){
        return  this.name + ": " + this.votes;
    }
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
}

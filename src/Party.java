public class Party {
    private String name;
    private int id;
    private int totalNumberOfVotes = 0;

    public Party(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void AddVote(){
        this.totalNumberOfVotes++;
    }

    public void PrintInfo(){
        System.out.println("Party ID : " + this.id +
                "\nParty name : " + this.name +
                "\nNumber of the votes : " + this.totalNumberOfVotes);
    }
}

public class Person {
    private String name;
    private int age;
    private boolean isVote = false;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Vote(int id, Party[] party){

    }
    public void PrintInfo(){
        System.out.println("Name : " + this.name +
                "\nAge : " + this.age +
                "\nVoting State : " + this.isVote);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVote() {
        return isVote;
    }

    public void setVote(boolean vote) {
        isVote = vote;
    }
}

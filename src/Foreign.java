import java.util.Scanner;

public class Foreign extends Person{
    private String passportNum;
    public Foreign(String name, int age) {
        super(name, age);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        this.passportNum = input.next();
    }

    public void Vote(int id, Party[] party){
        if(isPassportValid() && super.getAge() > 18){
            party[id].AddVote();
            super.setVote(true);
        }
    }

    public boolean isPassportValid(){
        int letterCount = 0;
        int digitCount = 0;
        if(this.passportNum.length() == 7 && !isVote()){
            for (int i = 0; i < this.passportNum.length(); i++) {
                if(passportNum.charAt(i) > 47 && passportNum.charAt(i) < 58){
                    digitCount++;
                } else if (passportNum.charAt(i) > 64 && passportNum.charAt(i)< 91) {
                    letterCount++;
                }
            }
            return (letterCount == 1 && digitCount == 6);
        }
        return false;
    }
    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("Citizenship status : Foreign");
    }
}

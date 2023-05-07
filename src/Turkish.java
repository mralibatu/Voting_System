import java.util.Scanner;

public class Turkish extends Person{
    private String id;


    public Turkish(String name, int age) {
        super(name, age);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        this.id = input.next();
    }

    public void Vote(int id, Party[] party){
        if(isValid()){
            party[id].AddVote();
            super.setVote(true);
        }
    }

    public boolean isValid(){
        if(this.id.length() == 11 && isAllDigit(this.id) && super.getAge() > 18 && !isVote()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isAllDigit(String id){
        for (int i = 0; i < id.length(); i++) {
            if(!(id.charAt(i) < 58 && id.charAt(i) > 47)){
                return false;
            }
        }
        return true;
    }


    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("Citizenship status : Turkish");
    }
}

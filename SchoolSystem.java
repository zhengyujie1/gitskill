package program;

import java.util.ArrayList;
import java.util.Scanner;


public class SchoolSystem  implements ISignUp {
    int big;
    int medium;
    int small;
    static Boolean[] b;
    public SchoolSystem(int big, int medium, int small) {
       this. big = big;
        this.small = small;
        this.medium = medium;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] c=(scanner.next()).trim().split("[\\s\\p{Punct}]+");
        b=new Boolean[c.length-1];
        IParams params = ISignUp.parse();//SchoolSystem.parse();
        SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
        ArrayList<Integer> plan = params. getPlanSignUp ();
       for (int i = 0; i < plan.size(); i++) {
            b[i+1]=sc. addStudent (plan.get(i));
        }
        sc.print();
    }

    @Override
    public void print() {
        System.out.print("[");
        for(int i = 0; i<b.length;i++){
            if(i==b.length-1){
                System.out.print(b[i] );
            }else {
                System.out.print(b[i] + ",");
            }
        }
        System.out.print("]");
    }

    @Override
    public boolean addStudent(int stuType) {
        if (stuType==1){
            if((this.big=big-1)>=0){
                return true;
            }else {
                return false;
            }
        }else if (stuType==2){
            if((this.medium=medium-1)>=0){
                return true;
            }else {
                return false;
            }
        }else{
            if((this.small=small-1)>=0){
                return true;
            }else {
                return false;
            }
        }
    }
    static String[] parse(String input){
        String input1 =input.trim();
       String[] a = input1.split("[\\s\\p{Punct}]+");
        return a;
    }
}

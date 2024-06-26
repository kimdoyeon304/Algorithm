import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;

        Stack<Integer> iStack = new Stack<>();

        for(int i=0; i<num; i++){
            int p = sc.nextInt();
                if(p!=0){
                    iStack.push(p);
                    sum+=p;
                }else{
                    if(!iStack.isEmpty()){
                        sum-=iStack.pop();
                    }
                }
        }
        System.out.println(sum);
    }
}
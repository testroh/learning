import java.util.Stack;

public class test {

public  static void printvertically(int i){
        int j,realnum;
        int top = -1;
        j = i;

        Stack<Integer> num = new Stack<>();
        while(j > 0){
            realnum = j %10;
            j= j/10;
            num.push(realnum);
            top = top + 1;
        }
         while(!num.isEmpty()){
            System.out.println(num.pop());
        }
}

public static void main(String[]args) {
    int i = 123;
    printvertically(i);
    }
}
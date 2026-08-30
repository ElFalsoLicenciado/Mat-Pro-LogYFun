import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        Methods mt = new Methods();
        char i;

        while(true){
            mt.show(root);
            System.out.print("\nInput: ");
            i = sc.next().charAt(0);
            if (i == 'q') return;
            root = mt.proc(root,i);
        }
    }
}




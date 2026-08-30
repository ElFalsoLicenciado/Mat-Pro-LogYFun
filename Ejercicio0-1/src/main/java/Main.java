import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        Methods mt = new Methods();
        String input;

        while(true){
            mt.show(root);
            System.out.print("\nInput: ");
            input = sc.next();
            if (input.equals("q")) return;
            for (int i = 0; i < input.length(); i++) {
                root = mt.proc(root,input.charAt(i));
            }
        }
    }
}




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Methods mt = new Methods();

        int[][] maze = {
                {0, 1 , 1 , 0 , 1},
                {0, 1 , 1 , 0 , 2},
                {0, 1 , 1 , 0 , 1},
                {0, 0 , 0 , 0 , 1},
                {0, 1 , 1 , 0 , 1}
        };
        int posX = 0;
        int posY = 0;
        int dir = -1;

        mt.show(maze, posX, posY);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        Methods mt = new Methods(maze, posX, posY, dir);

        mt.show();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] maze = {
                {0, 1 , 1 , 1 , 1},
                {0, 1 , 1 , 0 , 1},
                {0, 0 , 0 , 0 , 1},
                {0, 1 , 1 , 0 , 1},
                {0, 1 , 2 , 1 , 1},
                {0, 0 , 0 , 0 , 0 }

        };
        int posX = 0;
        int posY = 0;

        Methods mt = new Methods(maze, posX, posY);
        mt.move(posX, posY);
    }
}

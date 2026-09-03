public class Methods {

    private final int[][] maze;
    private final int MAX_X;
    private final int MAX_Y;
    private int endX, endY;
    private int posX, posY;

    public Methods(int[][] maze, int posX, int posY) {
        this.maze = maze;
        this.posX = posX;
        this.posY = posY;
        MAX_X = maze[0].length;
        MAX_Y = maze.length;
        getGoalPos();
    }

    public void show() {
        for (int i = 0; i < MAX_Y; i++) {
            System.out.print(" -");
        }
        System.out.println();
        for (int j = 0; j < MAX_Y; j++) {
            for (int i = 0; i < MAX_X; i++) {
                if (i == 0 ) System.out.print("| ");
                if (i == posX && j == posY) System.out.print("X");
                else {
                    switch (maze[j][i]) {
                        case -1 -> System.out.print("*");
                        case 0 -> System.out.print(" ");
                        case 1 -> System.out.print("■");
                        case 2 -> System.out.print("F");
                    }
                }
                if (i == MAX_X-1 ) System.out.print(" |");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < MAX_Y; i++) {
            System.out.print(" -");
        }
    }

    public void show(int x, int y) {
        for (int i = 0; i < MAX_Y; i++) {
            System.out.print(" -");
        }
        System.out.println();

        for (int j = 0; j < MAX_Y; j++) {
            for (int i = 0; i < MAX_X; i++) {
                if (i == 0 ) System.out.print("| ");
                if (i == x && j == y) System.out.print("X");
                else {
                    switch (maze[j][i]) {
                        case -1 -> System.out.print("*");
                        case 0 -> System.out.print(" ");
                        case 1 -> System.out.print("■");
                        case 2 -> System.out.print("F");
                    }
                }
                if (i == MAX_X-1 ) System.out.print(" |");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < MAX_Y; i++) {
            System.out.print(" -");
        }
    }


    private void getGoalPos() {
        for (int j = 0; j < MAX_Y; j++) {
            for (int i = 0; i < MAX_X; i++) {
                if (maze[j][i] == 2) {
                    endX = i;
                    endY = j;
                    return;
                }
            }
        }
    }

    public void move(int dx, int dy) {
        System.out.printf("Current pos: %d, %d\n", dx, dy);
        show(dx, dy);
        System.out.println();

        if (dx == endX && dy == endY) {
            posX = dx;
            posY = dy;
            return;
        }

        if (posX == endX && posY == endY) {
            return;
        }

        if (dx < 0 || dx > MAX_X - 1) return;
        if (dy < 0 || dy > MAX_Y - 1) return;
        if (maze[dy][dx] == 1 || maze[dy][dx] == -1) return;

        posX = dx;
        posY = dy;
        maze[posY][posX] = -1;

        show();

        move(dx, dy - 1);
        move(dx + 1, dy);
        move(dx, dy + 1);
        move(dx - 1, dy);

        maze[posY][posX] = 0;
    }
}

public class Methods {

    private final int[][] maze;
    private final int MAX_X;
    private final int MAX_Y;
    private int posX;
    private int posY;
    private int dir;
    private SavePoint root;

    public Methods(int[][] maze, int posX, int posY, int dir) {
        this.maze = maze;
        this.posX = posX;
        this.posY = posY;
        this.dir = dir;
        MAX_X = maze[0].length;
        MAX_Y = maze.length;
        root = null;
    }

    public void show(){
        for (int j = 0; j < MAX_Y; j++) {
            for (int i = 0; i < MAX_X; i++) {
                if (i == posX && j == posY ) System.out.print("*");
                else {
                    switch (maze[j][i]) {
                        case 0 -> System.out.print(" ");
                        case 1 -> System.out.print("■");
                        case 2 -> System.out.print("F");
                    }
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public void move(int dir) {
        this.dir = dir;

        switch (dir) {
            case 0 -> goUp();
            case 1 -> goRight();
            case 2 -> goDown();
            case 3 -> goLeft();
        }
    }

    private void goUp() {
        if ((posY - 1) > 0) posY--;
    }

    private void goRight() {
        if ((posX + 1) < MAX_X) posX--;
    }

    private void goDown() {
        if ((posY + 1) < MAX_Y) posY++;
    }

    private void goLeft() {
        if ((posX - 1) > 0 ) posX--;
    }


    public void goBack() {
        SavePoint aux,prev = null;


        if (root.next == null) {
            posX = root.posX;
            posY = root.posY;
            dir = root.dir;
            return;
        }

        aux = root;

        while (aux.next != null) {
            prev = aux;
            aux = aux.next;
        }

        posX = prev.posX;
        posY = prev.posY;
        dir = prev.posY;
    }
}

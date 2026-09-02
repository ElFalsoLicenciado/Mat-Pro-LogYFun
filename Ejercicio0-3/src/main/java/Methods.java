public class Methods {

    private int[][] maze;
    private int posX;
    private int posY;
    private int dir;

    public Methods(int[][] maze, int posX, int posY, int dir) {
        this.maze = maze;
        this.posX = posX;
        this.posY = posY;
        this.dir = dir;
    }

    public void show(){
        for (int j = 0; j < maze.length; j++) {
            for (int i = 0; i < maze[0].length; i++) {
                if (i == posX && j == posY ) System.out.print("*");
                else {
                    switch (maze[j][i]) {
                        case 0 -> System.out.print(" ");
                        case 1 -> System.out.print("■");
                        case 2 -> System.out.print("F");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void goBack()
}

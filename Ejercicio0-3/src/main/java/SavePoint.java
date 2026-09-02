public class SavePoint {

    int posX;
    int posY;
    int dir;
    SavePoint next;

    public SavePoint(int posX, int posY, int dir) {
        this.posX = posX;
        this.posY = posY;
        this.dir = dir;
        next = null;
    }
}

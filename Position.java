
public class Position {

    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveForward(){
        this.x = x + 1;
    }

    public  void moveDown(){
        this.y = y - 1;
    }
    public void moveUp(){
        this.y = y + 1 ;
    }

    public int getXPosition (){
        return this.x;
    }

    public int getYPosition (){
        return this.y;
    }
}

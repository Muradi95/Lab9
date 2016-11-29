
public class Monster {
    private int health;
    private int hit = 10;
    private Position currentPosition;

    public Monster (){
        this.health=100;
        Position start = new Position(0, 1);
        this.currentPosition = start;
    }
    public void loseHealth(){
        this.health = health - this.hit;
    }
    public void move(){

        currentPosition.moveDown();
        currentPosition.moveForward();
    }
    public Position getCurrentPosition(){
        return this.currentPosition;
    }

}

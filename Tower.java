import java.util.Random;

public class Tower {
    private Position tower;

    public Tower(Position start){ this.tower = start; }

    public void shoot(Monster monster){
        Random r = new Random();
        boolean hitChance = r.nextBoolean();

        if(hitChance)
        monster.loseHealth();
    }
    public boolean mosterScout(Position monster){
        if(Math.abs(tower.getXPosition()-monster.getXPosition())== 1 ||
                Math.abs(tower.getYPosition()-monster.getYPosition())== 0 
                && Math.abs(tower.getXPosition() - monster.getXPosition()) == 1)
            return true;
        else
            return false;
    }


}
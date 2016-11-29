public class TowerDefenceGame implements Game {

    private Monster monster = new Monster();
    private Tower towerOne = new Tower(new Position(4,2));
    private Tower towerTwo = new Tower(new Position(6,3));
    private enum movements {FRONT, UP, DOWN}
    private movements[] path = { ... }


    @Override
    public void nextTurn() {
        movements move;
        switch (move) {
            case FRONT:
                monster.getCurrentPosition().moveForward();
            case UP:
                monster.getCurrentPosition().moveUp();
            case DOWN:
                monster.getCurrentPosition().moveDown();
        }

    }

    @Override
    public void endGame() {

    }

    @Override
    public void towerAttack() {

    }

    @Override
    public int getMonsterHealth() {
        return 0;
    }
}

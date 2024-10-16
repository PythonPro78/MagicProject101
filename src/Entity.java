public class Entity
{
    private static int numEntities;

    private int health;
    private int money;
    private boolean alive;

    public Entity(int health, int money, boolean alive)
    {
        numEntities ++;

        this.health = health;
        this.money = money;
        this.alive = alive;
    }
}

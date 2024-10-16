public class Entity
{
    // VARIABLES
    private static int numEntities;

    private int health;
    private int money;
    private boolean alive;

    // CONSTRUCTORS
    public Entity(int health, int money, boolean alive)
    {
        numEntities ++;

        this.health = health;
        this.money = money;
        this.alive = alive;
    }

    public Entity(int health, int money)
    {
        numEntities ++;

        this.health = health;
        this.money = money;

        alive = true;
    }

    public Entity(int health)
    {
        numEntities ++;

        this.health = health;

        money = 0;
        alive = true;
    }

    public Entity()
    {
        numEntities ++;

        health = 10;
        money = 0;
        alive = true;
    }

    // SETTERS

    // GETTERS

    // BRAIN METHODS
}

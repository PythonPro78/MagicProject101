public class Wizard extends Entity
{
    // VARIABLES
    private int mana;
    private Staff staff;

    // CONSTRUCTORS
    public Wizard(int health, int money, boolean alive, int mana, Staff staff)
    {
        super(health, money, alive);

        this.mana = mana;
        this.staff = staff;
    }

    public Wizard(int health, int money, int mana, Staff staff)
    {
        super(health, money);

        this.mana = mana;
        this.staff = staff;
    }

    public Wizard(int health)
    {
        super(health);

        mana = 0;
        staff = null;
    }

    public Wizard()
    {
        mana = 0;
        staff = null;
    }

    // SETTERS

    // GETTERS

    // BRAIN METHODS
}

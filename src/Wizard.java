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
    public void setMana(int mana)
    {
        this.mana = mana;

        if (this.mana < 0)
            this.mana = 0;
    }

    public void changeMana(int change)
    {
        mana += change;

        if (mana < 0)
            mana = 0;
    }

    public void setStaff(Staff staff)
    {
        this.staff = staff;
    }

    // GETTERS
    public int getMana()
    {
        return mana;
    }

    public Staff getStaff()
    {
        return staff;
    }

    // BRAIN METHODS
    public void boostedAttack(Entity target, int damage, int mana)
    {
        if (staff == null)
            attack(target, damage);

        attack(target, (int) staff.boost(mana, damage));
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", staff=" + staff +
                ", health=" + health +
                ", money=" + money +
                ", alive=" + alive +
                '}';
    }
}

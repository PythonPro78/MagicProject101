public class Bard extends Entity
{
    // VARIABLES
    public static final double MAX_LEGAL_BAC = 0.08;

    private int mana;
    private double bac;

    // CONSTRUCTORS
    public Bard(int health, int money, boolean alive, int mana, double bac)
    {
        super(health, money, alive);

        this.mana = mana;
        this.bac = bac;
    }

    public Bard(int health, int money, int mana, double bac)
    {
        super(health, money);

        this.mana = mana;
        this.bac = bac;
    }

    public Bard(int health)
    {
        super(health);

        mana = 0;
        bac = 0.0;
    }

    public Bard()
    {
        mana = 0;
        bac = 0.0;
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

    public void setBac(double bac)
    {
        this.bac = bac;
    }

    public void changeBac(double change)
    {
        bac += change;

        if (bac < 0)
            bac = 0;
    }

    // GETTERS
    public int getMana()
    {
        return mana;
    }

    public double getBac()
    {
        return bac;
    }

    // BRAIN METHODS
    public boolean canDrive()
    {
        return bac < MAX_LEGAL_BAC;
    }

    public void giveMana(int mana, Wizard target)
    {
        if (this.mana < mana)
            return;

        target.changeMana(mana);
        this.mana -= mana;
    }

    @Override
    public String toString() {
        return "Bard{" +
                "mana=" + mana +
                ", bac=" + bac +
                ", health=" + health +
                ", money=" + money +
                ", alive=" + alive +
                ", canDrive=" + canDrive() +
                '}';
    }
}

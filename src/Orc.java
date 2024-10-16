public class Orc extends Entity
{
    // VARIABLES
    private int dt;
    private int weaponBst;

    // CONSTRUCTORS
    public Orc(int health, int money, boolean alive, int dt, int weaponBst)
    {
        super(health, money, alive);

        this.dt = dt;
        this.weaponBst = weaponBst;
    }

    public Orc(int health, int money, int dt, int weaponBst)
    {
        super(health, money);

        this.dt = dt;
        this.weaponBst = weaponBst;
    }

    public Orc(int health)
    {
        super(health);

        dt = 0;
        weaponBst = 0;
    }

    public Orc()
    {
        dt = 0;
        weaponBst = 0;
    }

    // SETTERS
    public void setDT(int dt)
    {
        this.dt = dt;

        if (this.dt < 0)
            this.dt = 0;
    }

    public void setWeaponBst(int weaponBst)
    {
        this.weaponBst = weaponBst;

        if (this.weaponBst < 0)
            this.weaponBst = 0;
    }

    // GETTERS
    public int getDt()
    {
        return dt;
    }

    public int getWeaponBst()
    {
        return weaponBst;
    }

    // BRAIN METHODS
    @Override
    public void attack(Entity target, int damage)
    {
        super.attack(target, damage + weaponBst);
    }

    @Override
    public void wasAttacked(int damage)
    {
        if (damage > dt)
            health += dt;
        else
            health += damage;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "dt=" + dt +
                ", weaponBst=" + weaponBst +
                ", health=" + health +
                ", money=" + money +
                ", alive=" + alive +
                '}';
    }
}

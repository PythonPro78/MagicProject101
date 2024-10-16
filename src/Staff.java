public class Staff
{
    // VARIABLES
    private float booster;

    private int minMana;
    private int maxMana;
    private String brand;

    // CONSTRUCTORS
    public Staff(int minMana, int maxMana, String brand)
    {
        this.minMana = minMana;
        this.maxMana = maxMana;
        this.brand = brand;

        booster = 1.0f;
    }

    public Staff(int minMana, int maxMana)
    {
        this.minMana = minMana;
        this.maxMana = maxMana;

        brand = "";

        booster = 1.0f;
    }

    public Staff()
    {
        minMana = 0;
        maxMana = Integer.MAX_VALUE;
        brand = "";

        booster = 1.0f;
    }

    // SETTERS
    public void setMinMana(int minMana)
    {
        this.minMana = minMana;
    }

    public void setMaxMana(int maxMana)
    {
        this.maxMana = maxMana;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    // GETTERS

    public int getMinMana()
    {
        return minMana;
    }

    public int getMaxMana()
    {
        return maxMana;
    }

    public String getBrand()
    {
        return brand;
    }

    // BRAIN METHODS
    public boolean checkMana(int mana)
    {
        return minMana <= mana && mana <= maxMana;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "minMana=" + minMana +
                ", maxMana=" + maxMana +
                ", brand='" + brand + '\'' +
                '}';
    }
}

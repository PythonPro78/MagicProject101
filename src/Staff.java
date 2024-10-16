public class Staff
{
    // VARIABLES
    private int minMana;
    private int maxMana;
    private String brand;

    // CONSTRUCTORS
    public Staff(int minMana, int maxMana, String brand)
    {
        this.minMana = minMana;
        this.maxMana = maxMana;
        this.brand = brand;
    }

    public Staff(int minMana, int maxMana)
    {
        this.minMana = minMana;
        this.maxMana = maxMana;

        brand = "";
    }

    public Staff()
    {
        minMana = 0;
        maxMana = Integer.MAX_VALUE;
        brand = "";
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

    @Override
    public String toString() {
        return "Staff{" +
                "minMana=" + minMana +
                ", maxMana=" + maxMana +
                ", brand='" + brand + '\'' +
                '}';
    }
}

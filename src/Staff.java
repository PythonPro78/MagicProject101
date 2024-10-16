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

    // GETTERS

    // BRAIN METHODS
}

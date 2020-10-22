package nachaloor.six;

public class Assignment {

    //class fields
    private String name;
    private double grade;
    private int category;
    private float categoryMultiplier;
    private String categoryName;

    /**
     * Default Constructor
     */
    public Assignment() {
        this.name = "";
        this.grade = 0;
        this.category = 0;
        this.categoryMultiplier = 1;
        this.categoryName = "";
    }

    /**
     * Partial Constructor
     * @param name name of assignment
     * @param grade grade on the assignment
     */
    public Assignment(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.category = 0;
        this.categoryMultiplier = 1;
        this.categoryName = "";
    }

    /**
     * Full Constructor
     * @param name name of assignment
     * @param grade grade on the assignment
     * @param category the database's index for the grade category
     * @param categoryMultiplier category multiplier
     * @param categoryName name of the assignment category
     */
    public Assignment(String name, double grade, int category, float categoryMultiplier, String categoryName) {
        this.name = name;
        this.grade = grade;
        this.category = category;
        this.categoryMultiplier = categoryMultiplier;
        this.categoryName = categoryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public float getCategoryMultiplier() {
        return categoryMultiplier;
    }

    public void setCategoryMultiplier(float categoryMultiplier) {
        this.categoryMultiplier = categoryMultiplier;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Assignment Name: " + getName() +
                "\nGrade: " + getGrade() +
                "\nCategory Index: " + getCategory() +
                "\nCategory Multiplier: " + getCategoryMultiplier() +
                "\nCategory Name: " + getCategoryName();
    }
}
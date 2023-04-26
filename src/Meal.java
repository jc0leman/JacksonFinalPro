import java.util.ArrayList;

public class Meal {
    String name;
    ArrayList<Food> foods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public Meal(String name, ArrayList<Food> foods)
    {
        this.name = name;

    }

}

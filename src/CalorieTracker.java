import java.util.ArrayList;

public class CalorieTracker {
    User user;
    ArrayList<Meal> meals;
    public CalorieTracker()
    {
        User user = new User();
        ArrayList<Meal> meals = new ArrayList<Meal>();
    }
    public static void main(String[] args) {

        new FrontEnd();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }
}

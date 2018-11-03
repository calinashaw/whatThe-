public class User{
    List<String> pantry;
    bool cookTimeMoreImportant;
    List<String> allergies;
    bool lactose;
    bool nutAllergy;
    String mealType;

    User(){
        pantry = null;
        cookTimeMoreImportant = false;
        allergies = null;
        lactose = false;
        nutAllergy = false;
        mealType = "lunch";
    }

    public bool getCookTimeMoreImportant() {
        return cookTimeMoreImportant;
    }

    public bool getLactose() {
        return lactose;
    }

    public bool getNutAllergy() {
        return nutAllergy;
    }

    public String getMealType() {
        return mealType;
    }

    public String getAllergies(int index) {
        if(index > allergies.size() - 1){
            return "";
        }
        return allergies.get(index);
    }

    public String getPantry(int index) {
        if(index > pantry.size() - 1){
            return ""
        }
        return pantry.get(index);
    }

    public void addAllergies(String allergies) {
        this.allergies.add(allergies);
    }

    public void setCookTimeMoreImportant(bool cookTimeMoreImportant) {
        this.cookTimeMoreImportant = cookTimeMoreImportant;
    }

    public void setLactose(bool lactose) {
        this.lactose = lactose;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public void setNutAllergy(bool nutAllergy) {
        this.nutAllergy = nutAllergy;
    }

    public void addPantry(String pantry) {
        this.pantry.add(pantry);
    }
}
import java.util.Arrays;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;


/**
 * The Recipe class provides an outline for JSON file formatting.
 * Contains public getters for each private instance variable.
 *
 */
public class Recipe {


     @SerializedName("id") private  int id;
     @SerializedName("name") private  String name;
     @SerializedName("source")private  String source;
     @SerializedName("preptime") private  int preptime;
     @SerializedName("waittime") private  int waittime;
     @SerializedName("cooktime") private  int cooktime;
     @SerializedName("servings") private  int servings;
     @SerializedName("comments") private  String comments;
     @SerializedName("calories") private  int calories;
     @SerializedName("fat") private  int fat;


     @SerializedName("satfat") private  int satfat;
     @SerializedName("carbs") private  int carbs;
     @SerializedName("fiber")private  int fiber;
     @SerializedName("sugar") private  int sugar;
     @SerializedName("protein") private  int protein;
     @SerializedName("Instructions") private  String instructions;
     @SerializedName("ingredients") private  String[] ingredients;
     @SerializedName("tags") private  String[] tags;



          public Recipe() {
          }

          public  int getID() {
              return id;
          }

          public  String getName() {
              return name;
          }

          public  String source() {
              return source;
          }

          public  int getPreptime() {
              return preptime;
          }

          public  String getWaittime() {
              return waitime;
          }

          public  int getCooktime() {
              return cooktime;
          }

          public  int getServings() {
              return servings;
          }

          public  String getComments() {
              return comments;
          }

          public int getCalories() {
              return calories;
          }

          public int getFat() {
              return fat;
          }

          public  int getSatfat() {
              return satfat;
          }

          public  int getCarbs() {
              return carbs;
          }

          public  int getFiber() {
              return fiber;
          }

          public  int getSugar() {
              return sugar;
          }

          public int getProtein() {
              return protein;
          }

          public String getInstructions() {
              return instructions;
          }

          public String[] getIngredients() {
              return ingredients;
          }

          public String getTags() {
              return tags;
          }


         //
        //      @Override
        //      public boolean equals(Object o) {
        //          if (this == o) return true;
        //          if (!(o instanceof Course)) return false;
        //          Course course = (Course) o;
        //          return CRN == course.CRN &&
        //                  number == course.number &&
        //                  term == course.term &&
        //                  Double.compare(course.average, average) == 0 &&
        //                  Objects.equals(subject, course.subject) &&
        //                  Objects.equals(title, course.title) &&
        //                  Objects.equals(section, course.section) &&
        //                  Objects.equals(type, course.type) &&
        //                  Objects.equals(instuctor, course.instuctor) &&
        //                  Arrays.equals(grades, course.grades);
        //      }
         //
        //      @Override
        //      public int hashCode() {
         //
        //          int result = Objects.hash(CRN, subject, number, title, section, type, term, instuctor, average);
        //          result = 31 * result + Arrays.hashCode(grades);
        //          return result;
        //      }
        //  }

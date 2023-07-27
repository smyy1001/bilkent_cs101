import java.util.Scanner;

public class Lab02_Q3_acar {
    public static void main(String[] args) {
        Scanner scan;
        double bmr;
        double weight;
        double height;
        double age;
        double pal;
        double calories;
        double protein;
        double carbs;
        double fat;
        

        scan = new Scanner( System.in );
        System.out.print( "Enter your weight(kg): " );
        weight =scan.nextDouble();
        System.out.print( "Enter your height(cm): " );
        height =scan.nextInt();
        System.out.print( "Enter your age(years): " );
        age =scan.nextInt();
        System.out.printf( "Your weight(kg), height(cm), age(years):  %.0f,  %.0f,  %.0f  %n", weight, height, age);
        scan.close();

        
        pal = 1.4;
        bmr = 10 * weight + 6.25 * height - 5 * age - 161;
        calories = pal * bmr;
        //Target percent of daily calories from Protein: 25% && Calories in 1 gram of PROTEIN is 4 calories
        protein = calories * (0.25) / 4; 
        //Target percent of daily calories from Carbs: 45% && Calories in 1 gram of CARBS is 4 calories
        carbs = calories * (0.45) / 4; 
        // Target percent of daily calories from Fat: 30% && Calories in 1 gram of FAT is 9 calories
        fat = calories * (0.30) / 9; 
        System.out.println( "Calories Required: " + calories);
        System.out.printf( "GRAMS PROTEIN: %.2f %n", protein);
        System.out.printf( "GRAMS FAT: %.2f %n", fat);
        System.out.printf( "GRAMS CARBS: %.2f %n", carbs);

    }
    
}

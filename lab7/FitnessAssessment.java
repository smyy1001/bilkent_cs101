/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab07
 * Author: Sumeyye Acar
 * Id: 22103640
*/

import java.time.LocalDate;
public class FitnessAssessment {

    /*
        Data Members
        private LocalDate birthdate;// birthdate stored as LocalDate object.
        private double height;// in meters.
        private double weight;// in kilograms.
        private int restingHeartRate;// beats per minute.
        private double waist;// in centimeters.
        private double hip;// in centimeters.
        private String gender;// (m)ale, (f)emale.
    */

    int calculateAge(String startDate) {
        int birthYear = LocalDate.parse(startDate).getYear();
        LocalDate noW = LocalDate.now();
        int currentYear = noW.getYear();
        int age = currentYear- birthYear;
        return age;
    }    

    public int calculateMaxHeartRate(int age) {
        int maxHeartRate = (int) 220 - age;
        return maxHeartRate;
    }    

    public double calculateTargetHeartRate(int maxHeartRate) {
        double targetHeartRate = maxHeartRate * (0.85);
        return targetHeartRate;
    }

    public double calculateWaistHipRatio(double waist, Double hip) {
        double whratio = waist / hip;
        return whratio;
    }

    public double calculateBMI(double weight, double height) {
        double BMI = weight / Math.pow(height, 2);
        return BMI;
    }

    public String findBMICategory(double BMI) {
        String bmiCategory = "";
        if(BMI >= 30 ) {
            bmiCategory = "Obese"; 
        }
        else if(BMI >= 25 && BMI < 30) {
            bmiCategory = "Overweight";
        }
        else if(BMI < 25 && BMI >= 20) {
            bmiCategory = "Normal";
        }
        else {
            bmiCategory = "Underweight";
        }
        return bmiCategory;
    }

    public String determineFitnessLevel(double height, double weight, double waist, double hip, int restingHeartRate, String gender) {
        String fitnessLevel = "";
        int level = 0;
        if(findBMICategory(calculateBMI(weight, height)).equals("Normal")) {
            level ++;
        }
        if(restingHeartRate < 70) {
            level ++;
        }
        if(gender.equalsIgnoreCase("f")) {
            if(calculateWaistHipRatio(waist, hip) < 0.9) {
                level ++;
            }
        }
        if(gender.equalsIgnoreCase("m")) {
            if(calculateWaistHipRatio(waist, hip) < 1) {
                level ++;
            }
        }
        if(level == 0) {
            fitnessLevel = "Poor!";
        }
        else if(level == 1){
            fitnessLevel = "Avarage!";
        }
        else if(level == 2) {
            fitnessLevel = "Good!";
        }
        else if(level == 3) {
            fitnessLevel = "Excellent!";
        }
        return fitnessLevel;
    }

 
}

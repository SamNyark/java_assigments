package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // defining scanner for taking input
        Scanner entry = new Scanner(System.in);
        //defining arrays for final score exam index number, midsem score and grade
	    double[] finalScore = new double[15];
        double[] examScore = new double[15];
	    int[] indexNumber = new int[15];
	    double[] midSemScore = new double[15];
	    char[] grade = new char[15];
	    //defining variables to store average score, maximum score, minimum score and total score
 	    double average, maximumScore, minimumScore, totalScores = 0;
 	    //defining int variables to store the frequency of grades
 	    int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;

	    for(int i=0; i<15; i++){
	        //looping to take input for index number, midsem score, exam score
            System.out.print("Enter index number :");
            indexNumber[i] = entry.nextInt();
            System.out.print("Enter midsem score :");
            double value = entry.nextInt();
            //calculating the 30% midsem score
            midSemScore[i] = value / 100 * 30;
            System.out.print("Enter exam score :");
            //calculating for 70% final score
            double solution = entry.nextInt();
            examScore[i] = (solution / 100) * 70;
            //finding the total score  for each student
            finalScore[i] = examScore[i] + midSemScore[i];
            //calculating the total score for all student to find the average
            totalScores += finalScore[i];
        }
        maximumScore = finalScore[0];
        minimumScore = finalScore[0];

	    for(int i=0; i<15; i++){
	        //checking for grade letter and calculating frequency
            if (finalScore[i] >= 70) {
                grade[i] = 'A';
                gradeA += 1;
            } else if (finalScore[i] >= 60) {
                grade[i] = 'B';
                gradeB += 1;
            } else if (finalScore[i] >= 50) {
                grade[i] = 'C';
                gradeC += 1;
            } else if (finalScore[i] >= 40) {
                grade[i] = 'D';
                gradeD += 1;
            } else if(finalScore[i] < 40){
                grade[i] = 'F';
                gradeF += 1;
            }
                //checking for maximum score
            if(finalScore[i] > maximumScore){
                maximumScore = finalScore[i];
            }
            //checking for minimum score
            if(finalScore[i] < minimumScore){
                minimumScore = finalScore[i];
            }
        }
	    //calculating the average
	    average = totalScores / 15;
	    //printing out frequencies, average, maximum score and minimum score
        System.out.printf("Frequency of grade A is :%s\n" +
                "Frequency of grade B is:%s\nFrequency of grade C is :%s\n" +
                "Frequency of grade D is :%s\nFrequency of grade F is :%s\n", gradeA, gradeB, gradeC, gradeD, gradeF);
        System.out.println("Average score is :"+ average);
        System.out.println("Maximum score is :"+ maximumScore + "\nMinimum score is :"+ minimumScore);
        //printing out the table
	    for(int i=0; i<15; i++) {
            System.out.println(indexNumber[i] + "       "+ finalScore[i] + "     " + grade[i]);
        }

    }
}

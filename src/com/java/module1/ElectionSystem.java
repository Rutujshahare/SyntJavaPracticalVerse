package com.java.module1;
import java.util.*;

public class ElectionSystem {
    public static void main(String args[]) {
        String name;
        int age;
        String address;
        String dob;

        int votechoice;
        int votescount1 = 0, votescount2 = 0, votescount3 = 0, votescount4 = 0;

        Scanner sc = new Scanner(System.in);

        // ✅ NEW: ask how many voters in total
        System.out.print("Enter total number of voters: ");
        int totalVoters = sc.nextInt();
        sc.nextLine(); // consume newline

        // ✅ CHANGED: Added for loop for multiple voters
        for (int i = 1; i <= totalVoters; i++) {
            System.out.println("\nVoter " + i + " details:");

            System.out.println("Enter the name of the person");
            name = sc.nextLine();

            System.out.println("Enter the address of the person");
            address = sc.nextLine();

            System.out.println("Enter the dob of the person");
            dob = sc.nextLine();

            System.out.println("Enter the age of the person");
            age = sc.nextInt();
            sc.nextLine(); // consume newline

            if (age >= 18) {
                System.out.println("You are eligible to vote ::::");
                System.out.println("--------------- VOTING SYSTEM --------------------------");
                System.out.println(name + " " + age + " " + address + " " + dob);

                // ❌ REMOVED do...while loop (one person shouldn’t vote multiple times)
                // ✅ NOW only one vote per person
                System.out.println("1. BJP");
                System.out.println("2. CONGRESS");
                System.out.println("3. AAP");
                System.out.println("4. OTHERS");
                System.out.print("Enter the choice you want to vote: ");
                votechoice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (votechoice) {
                    case 1:
                        System.out.println("The vote is casted and your vote has been added.");
                        votescount1 += 1;
                        break;
                    case 2:
                        System.out.println("The vote is casted and your vote has been added.");
                        votescount2 += 1;
                        break;
                    case 3:
                        System.out.println("The vote is casted and your vote has been added.");
                        votescount3 += 1;
                        break;
                    case 4:
                        System.out.println("The vote is casted and your vote has been added.");
                        votescount4 += 1;
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter between 1-4.");
                }
            } else {
                System.out.println("You are not eligible to vote !!!!");
            }
        }

        // ✅ CHANGED: Results are printed after all voters finish (case 5 removed)
        System.out.println("\nThe votes list won is: ");
        if (votescount1 > votescount2 && votescount1 > votescount3 && votescount1 > votescount4) {
            System.out.println("BJP has won the election and got total votes: " + votescount1);
        } else if (votescount2 > votescount1 && votescount2 > votescount3 && votescount2 > votescount4) {
            System.out.println("CONGRESS has won the election and got total votes: " + votescount2);
        } else if (votescount3 > votescount2 && votescount3 > votescount1 && votescount3 > votescount4) {
            System.out.println("AAP has won the election and got total votes: " + votescount3);
        } else if (votescount4 > votescount2 && votescount4 > votescount1 && votescount4 > votescount3) {
            System.out.println("OTHERS has won the election and got total votes: " + votescount4);
        } else {
            System.out.println("It is a tie between the parties!");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundtosecondprime;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RoundtoSecondPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
             int input = reader.nextInt();
             if(input >=5 && input<=100){
                 int out = SecondP(input);
                 System.out.println(out);
             }
        }
    }

    private static int SecondP(int input) {
        int output = 0;
        int PrimeArray[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103}; //27 prime
        int checkNum1 = 0;
        int checkNum2 = 0;
        for(int i = 0; i < PrimeArray.length -1;i++){
            if(input>PrimeArray[i] && input <PrimeArray[i+1]){
                checkNum1 = PrimeArray[i-1];
                checkNum2 = PrimeArray[i+2];
                break;
            }
            else if(input == PrimeArray[i]){
                checkNum1 = PrimeArray[i-2];
                checkNum2 = PrimeArray[i+2];
                break;
            }
        }
        int Diff1 = input - checkNum1;
        int Diff2 = checkNum2 - input;
        if(Diff1 > Diff2)
            output = checkNum2;
        if(Diff1 < Diff2)
            output = checkNum1;
        if(Diff1 == Diff2)
            output = checkNum2;
        return output;
    }
    
}

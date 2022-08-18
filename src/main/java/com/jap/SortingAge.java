package com.jap;

public class SortingAge {

    public static void main(String[] args) {
        //Declare and initialize an integer array containing age.
        int[] ageArray = {22, 34, 33, 32, 36, 27, 28};

        //Create an object of the class SortingAge
        SortingAge sortingAge = new SortingAge();
        sortingAge.getSortedAge(ageArray);

        //Call the method getSortedAge and pass the parameter


    }

    //Write the logic to sort the array containing the age in descending order
    // inside the below method and return the sorted array
    public int[] getSortedAge(int[] ageArray) {
        //Arrays.sort(ageArray);
        // System.out.println(Arrays.toString(ageArray);
        int temporary = 0;

        for (int index = 0; index < ageArray.length; index++) {
            for (int counter = index + 1; counter < ageArray.length; counter++) {
                if (ageArray[index] < ageArray[counter]) {
                    temporary = ageArray[index];
                    ageArray[index] = ageArray[counter];
                    ageArray[counter] = temporary;
                }

            }

            System.out.print(ageArray[index] + ",");
        }
        return ageArray;

       /* for (int counter = 0; counter < ageArray.length; counter++) {
            for (int index = 0; index < ageArray.length; index++) {
                if (ageArray[index]<ageArray[counter+1]){
                    //swap the numbers
                    int temporary = ageArray[index];
                    ageArray[index] = ageArray[index +1];
                    ageArray[index+1] = temporary;
                }
            }
        }
        //System.out.println(temporary);
        return ageArray;

        */

    }
}

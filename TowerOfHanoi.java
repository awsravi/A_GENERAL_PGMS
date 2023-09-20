package com.General;
public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDisks = 3; // Change this to the desired number of disks
        solveHanoi(numDisks, 'A', 'C', 'B');
    }

    public static void solveHanoi(int numDisks, char source, char destination, char auxiliary) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }//awsravi

        // Move the top (numDisks-1) disks from source to auxiliary peg using destination peg as auxiliary
        solveHanoi(numDisks - 1, source, auxiliary, destination);

        // Move the nth disk from source to destination peg
        System.out.println("Move disk " + numDisks + " from " + source + " to " + destination);

        // Move the (numDisks-1) disks from auxiliary peg to destination peg using source peg as auxiliary
        solveHanoi(numDisks - 1, auxiliary, destination, source);
    }
}

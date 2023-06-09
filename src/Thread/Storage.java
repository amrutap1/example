package Thread;
//Implement three classes: Storage, Counter, and Printer. The Storage class should store an integer.
// The Counter class should create a thread that starts counting from 0 (0, 1, 2, 3 ...) and
// stores each value in the Storage class. The Printer class should create
// a thread that keeps reading the value in the Storage class and printing it.
//Write a program that creates an instance of the Storage class and sets up a Counter and
// a Printer object to operate on it.


//Modify the program from the previous exercise to ensure that each number is printed exactly once,
// by adding suitable synchronization.

public class Storage {

    int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }


}


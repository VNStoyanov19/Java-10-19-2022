import java.util.*;
class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScores) {

        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    char calculate() {

        int average = (this.testScores.length);

        if (average > 40) {
            if (average >= 90) {
                return 'O';
            }
            if (average >= 80 && average < 90) {
                return 'E';
            }
            if (average >= 70 && average < 80) {
                return 'A';
            }
            if (average >= 55 && average < 70) {
                return 'P';
            }
            if (average >= 40 && average < 55) {
                return 'D';
            }
        }

        return 'T';
    }
}

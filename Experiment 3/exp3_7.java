/* 7.	Write a Program to design a student class representing student roll no. and a test class (derived class of student) 
representing the scores of the student in various subjects and sports class representing the score in sports.
 The sports and test class should be inherited by a result class having the functionality to add the scores and display the final result for a student. */

 
 class Student {
    private int rollNo;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    private int[] testScores;

    public Test(int rollNo, int[] testScores) {
        super(rollNo);
        this.testScores = testScores;
    }

    public int[] getTestScores() {
        return testScores;
    }
}

class Sports extends Student {
    private int sportsScore;

    public Sports(int rollNo, int sportsScore) {
        super(rollNo);
        this.sportsScore = sportsScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }
}

class Result extends Test {
    private int totalScore;

    public Result(int rollNo, int[] testScores, int sportsScore) {
        super(rollNo, testScores);
        this.totalScore = calculateTotalScore(testScores, sportsScore);
    }

    private int calculateTotalScore(int[] testScores, int sportsScore) {
        int total = sportsScore;
        for (int score : testScores) {
            total += score;
        }
        return total;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void displayResult() {
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Total Score: " + totalScore);
    }
}

public class exp3_7 {
    public static void main(String[] args) {
        // Example usage
        int[] testScores = {80, 85, 90};
        int sportsScore = 95;
        int rollNo = 2078;

        Result result = new Result(rollNo, testScores, sportsScore);
        result.displayResult();
    }
}

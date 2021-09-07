/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.ArrayList;

public class Archive {

    private ArrayList<Integer> listOfPoints;
    private double passPercentage;

    public Archive() {
        this.listOfPoints = new ArrayList<>();

    }

    public void addPoint(int point) {
        if (point >= 0 && point <= 100) {
            this.listOfPoints.add(point);
        }
    }

    public double getOverallAverage() {
        double sum = 0;

        if (this.listOfPoints.size() != 0) {
            for (int point : this.listOfPoints) {
                sum += point;
            }
            return sum / this.listOfPoints.size();

        } else {
            return 0;
        }
    }

    public double getPassingAverage() {
        double sum = 0;
        int c = 0;
        if (this.listOfPoints.size() != 0) {
            for (int point : this.listOfPoints) {
                if (point >= 50) {
                    sum += point;
                    c++;
                }
            }
            this.passPercentage = (double) c * 100. / this.listOfPoints.size();
            return sum / c;

        } else {
            this.passPercentage = 0.;
            return 0;
        }
    }

    public void printOverallAverage() {
        if (getOverallAverage() != 0) {
            System.out.println("Point average (all): " + getOverallAverage());
        } else {
            System.out.println("Point average (all): -");
        }
    }

    public void printPassingAverage() {
        if (getPassingAverage() >= 50) {
            System.out.println("Point average (passing): " + getPassingAverage());
            System.out.println("Pass percentage: " + this.passPercentage);
        } else {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        }
    }

    public void printDistribution() {
        int fives = 0;
        int fours = 0;
        int threes = 0;
        int twos = 0;
        int ones = 0;
        int zeros = 0;

        for (int point : this.listOfPoints) {
            if (point < 50) {
                zeros++;
            } else if (point < 60) {
                ones++;
            } else if (point < 70) {
                twos++;
            } else if (point < 80) {
                threes++;
            } else if (point < 90) {
                fours++;
            } else {
                fives++;
            }
        }
        System.out.println("Grade distribution:");
        printDistrHelper("5", fives);
        printDistrHelper("4", fours);
        printDistrHelper("3", threes);
        printDistrHelper("2", twos);
        printDistrHelper("1", ones);
        printDistrHelper("0", zeros);
    }

    public void printDistrHelper(String grade, int count) {
        System.out.print(grade + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }System.out.println("");
    }
}

package test;

public class LeastSquare {
    private double a;
    private double b;
    
    public LeastSquare(double[] y) {
        int n = y.length;
        double sumX = n * (n + 1) / 2;
        double sumY = 0, sumX2 = 0, sumXY = 0;
        
        for (int x = 1; x <= y.length; x++) {
            sumY += y[x - 1];
            sumX2 += x * x;
            sumXY += x * y[x - 1];
        }
        
        double k = sumX2 / sumX;
        
        b = (sumXY - sumY * k) / (sumX - n * k);
        a = (sumXY - sumX * b) / sumX2;
    }
    
    public double LinearPredict(int x) {
        return a * x + b;
    }
}
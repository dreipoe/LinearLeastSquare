package test;

public class LeastSquare {
    private double a;
    private double b;
    
    public LeastSquare(double[] y) {
        int n = y.length;
        double k = (2 * n + 1) / 3;
        double sumX = n * (n + 1) / 2;
        double sumX2 = sumX * k;
        double sumY = 0, sumXY = 0;
        
        for (int x = 0; x < n; x++) {
            sumY += y[x];
            sumXY += (x + 1) * y[x];
        }
        
        b = (sumXY - sumY * k) / (sumX - n * k);
        a = (sumXY - sumX * b) / sumX2;
    }
    
    public double LinearPredict(int x) {
        return a * x + b;
    }
}

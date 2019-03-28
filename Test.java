package test;

public class Test {
    public static void main(String[] args) {       
        double[] data = {54, 57, 62, 65, 67, 69, 70};
        LeastSquare me = new LeastSquare(data);
        
        double predict = me.LinearPredict(10);
        System.out.println(predict);
    }    
}

package JavaSamples;

public class Year1 {

    //public //private //protected //default - package private
    static double total;

    public double cumulativeAvg()
    {
        Student george = new Student();
        double georgeAverageScore  = george.averageOfStudentMarks(80.7,98.9, 89.7);

        Student michael =  new Student();
        double michaelAverageScore = michael.averageOfStudentMarks(67.8, 67.9,78.0);

        Student adam =  new Student();
        double adamAverageScore =  adam.averageOfStudentMarks(78.0, 78.6, 87.7);

        total  = georgeAverageScore+michaelAverageScore+adamAverageScore;

        return (total)/3;

    }

    public static void main(String[] args) {

        Year1 year1 = new Year1();

        double cumulativeAvg = year1.cumulativeAvg();

        System.out.println(cumulativeAvg);

    }
}

public class Student {
    int math;
    int korean;
    int english;
    String name;

    public double getSum() {
        return math + korean + english;
    }

    void sum() {
        System.out.println("총점은 : " + getSum());
    }

    void avg() {
        double avg = getSum() / 3;
        System.out.println("평균은 : " + avg);
    }
}

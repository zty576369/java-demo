package exam9m;

public class Student {
    private int id;private String name;private double score;
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        setScore(score);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("成绩必须在0～100之间");
        }
    }
    public String getLevel() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}

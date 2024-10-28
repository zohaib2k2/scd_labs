class Student {
    private String name;
    private int totalMarks;
    private int obtainedMarks;
    
    public Student(String name, int totalMarks, int obtainedMarks){
        this.name = name;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }
    //method for percentage
    public double calculatePercentage(){
        double percentage;
        percentage = (double)(((float)this.obtainedMarks / (float)this.totalMarks) * 100.0);
        return percentage;
        
    }
    
    // Method to calculate GPA based on percentage
    public double calculateGPA(double percentage) {
        if (percentage >= 90) return 4.0;
        else if (percentage >= 80) return 3.7;
        else if (percentage >= 70) return 3.0;
        else if (percentage >= 60) return 2.0;
        else return 0.0; // Below 60
    }

    // Method to determine letter grade based on percentage
    public String determineGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F"; // Below 60
    }
}
public class MarkSheet {
    public static void main(String[] args){
        Student me = new Student("Zohaib",500,430);
        double my_percentage = (me.calculatePercentage());
        System.out.println(my_percentage);
        System.out.println(me.calculateGPA(my_percentage));
        System.out.println(me.determineGrade(my_percentage));
    }
}

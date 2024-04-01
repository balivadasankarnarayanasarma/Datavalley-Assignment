import java.util.ArrayList;
import java.util.List;

class StudentProject {
    String projectName;
    int completionTime; // in days

    public StudentProject(String projectName, int completionTime) {
        this.projectName = projectName;
        this.completionTime = completionTime;
    }
}

public class ProjectAnalyzer {
    public static void main(String[] args) {
        List<StudentProject> projects = new ArrayList<>();
        projects.add(new StudentProject("Project A", 10));
        projects.add(new StudentProject("Project B", 5));
        projects.add(new StudentProject("Project C", 15));

        int onTime = 0, late = 0, early = 0;
        int totalCompletionTime = 0;

        for (StudentProject project : projects) {
            if (project.completionTime == 10) {
                onTime++;
            } else if (project.completionTime < 10) {
                early++;
            } else {
                late++;
            }
            totalCompletionTime += project.completionTime;
        }

        System.out.println("Projects completed on time: " + onTime);
        System.out.println("Projects completed early: " + early);
        System.out.println("Projects completed late: " + late);
        System.out.println("Average completion time: " + (double) totalCompletionTime / projects.size() + " days");
    }
}

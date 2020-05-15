package project;

import java.util.Comparator;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 20:48
 */
public class Project {
    public static final CompByName _COMP_NAME = new CompByName();
    public static final CompByEmployeeCount _COMP_EMP_COUNT = new CompByEmployeeCount();
    public static final CompByGrant _COMP_GRANT = new CompByGrant();

    private String name;
    private int employeeCount;
    private double grant;

    public Project(String name, int employeeCount, double grant) {
        this.name = name;
        this.employeeCount = employeeCount;
        this.grant = grant;
    }

    @Override
    public String toString() {
        return "Project{" +
                "Name = '" + name + '\'' +
                ", employee count = " + employeeCount +
                ", grant = " + grant +
                '€';
    }

    // Comparators

    private static class CompByName implements Comparator<Project> {
        @Override
        public int compare(Project o1, Project o2) {
            if (o1 == o2) {
                return 0;
            }
            if (o1 == null) {
                return -1;
            }
            if (o2 == null) {
                return 1;
            }
            return o1.name.compareTo(o2.name);
        }
    }

    private static class CompByEmployeeCount implements Comparator<Project> {
        @Override
        public int compare(Project o1, Project o2) {
            if (o1 == o2) {
                return 0;
            }
            if (o1 == null) {
                return -1;
            }
            if (o2 == null) {
                return 1;
            }
            return o1.employeeCount - o2.employeeCount;
        }
    }

    private static class CompByGrant implements Comparator<Project> {
        @Override
        public int compare(Project o1, Project o2) {
            if (o1 == o2) {
                return 0;
            }
            if (o1 == null) {
                return -1;
            }
            if (o2 == null) {
                return 1;
            }
            return Double.compare(o1.grant, o2.grant);
        }
    }

}


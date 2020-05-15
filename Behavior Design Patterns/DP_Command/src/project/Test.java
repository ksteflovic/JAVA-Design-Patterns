package project;

import java.util.Arrays;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 20:50
 */
public class Test {

    public static void main(String[] args) {
        Project[] myProject = new Project[6];

        myProject[0] = new Project( "A", 25, 5000 );
        myProject[1] = new Project( "X", 10, 1000 );
        myProject[2] = new Project( "C", 8, 25000 );
        myProject[3] = new Project( "B", 55, 100000 );
        myProject[4] = new Project( "AB", 5, 0 );
        myProject[5] = new Project( "Y", 13, 715.50 );

        Arrays.sort(myProject, Project._COMP_NAME);
       // Arrays.sort(myProject, Project._COMP_EMP_COUNT);
       // Arrays.sort(myProject, Project._COMP_GRANT);

        for(Project p : myProject)
            System.out.println(p);

    }
}

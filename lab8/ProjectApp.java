/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab08
 * Author: Sumeyye Acar
 * Id: 22103640
*/


public class ProjectApp {

    public static void main(String[] args) {
        Project project1 = new Project("Sys-Renew", "Upgrade payroll system and hardware", 
                                        "2022-05-22", "2022-06-10");
        Project project2 = new Project("LAB-IMPLEMENT", "Update Lab Results Reports", 
                                        "2023-05-22", "2023-09-30"); 

        System.out.println(project1);
        System.out.println(project1.equals(project2));
        project1.pushProject(100);
        System.out.println(project1);
        project1.deactivateProject("2022-04-19");
        System.out.println(project1);
        project1.activateProject();
        System.out.println(project1);
        
    }

}

/*
 * Course: CS-101
 * Semester: Spring 2022
 * Assignment: Lab08
 * Author: Sumeyye Acar
 * Id: 22103640
*/

public class Project {
    private String projectId;
    String projectName;
    String projectDescription;
    private String projectType;
    Date projectStartDate;
    private Date estimatedEndDate;
    private Date actualEndDate;
    private boolean isActive = true;
    static int projectCounter = 1000;

    public Project( String projectName, String projectDescription, String startdate, String endDate) {
        this.projectStartDate = new Date(startdate);
        estimatedEndDate = new Date(endDate);
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        setProjectType( estimatedEndDate );
        setProjectId( this.projectType );
        setEstimatedEndDate( estimatedEndDate );
        setActualEndDate( this.estimatedEndDate );
    }

    /**
     * getter (because it is private) for IsActive 
     */
    public boolean getIsActive() {
        return this.isActive;
    }

    /**
     * setter and getter for EstimatedEndDate
     */
    public void setEstimatedEndDate(Date a) {
        this.estimatedEndDate = a;
    }
    public Date getEstimatedEndDate() {
        return this.estimatedEndDate;
    }


    /**
     * setter and getter for ActualEndDate 
     */
    public void setActualEndDate(Date a) {
        this.actualEndDate = a;
    }
    public Date getActualEndDate() {
        return this.actualEndDate;
    }


    /**
     * setter and getter for ProjectType
     */
    public void setProjectType(Date estEndDate) {
        if( this.projectStartDate.daysBetween(estEndDate) <= 365 ) {
            this.projectType = "SHORT TERM";
        }
        else if( this.projectStartDate.daysBetween(estEndDate) <= 1095 ) {
            this.projectType = "INTERMEDIATE";
        }
        else if( this.projectStartDate.daysBetween(estEndDate) > 1095 ) {
            this.projectType = "LONG TERM";
        }
    }
    public String getProjectType() {
        return this.projectType;
    }


    /**
     * setter and getter for ProjectId
     */
    public void setProjectId(String type) {
        if(type.equals("SHORT TERM")) {
            this.projectId = "ST-" + projectCounter;
            projectCounter++;
        }
        else if(type.equals("INTERMEDIATE")) {
            this.projectId = "IM-" + projectCounter;
            projectCounter++;
        }
        else if(type.equals("LONG TERM")) {
            this.projectId = "LT-" + projectCounter;
            projectCounter++;
        }
    }
    public String getProjectId() {
        return this.projectId;
    }


    /**
     * Deactivates the program
     * @param str the Date of Deactivation
     */
    public void deactivateProject(String str) {
        Date a = new Date(str);
        setActualEndDate(a);
        this.isActive = false;
    }


    /**
     * Reactivates the program 
     */
    public void activateProject() {
        setActualEndDate(this.estimatedEndDate);;
        this.isActive = true;
    }


    /**
     * pushes the ending Date because the project is completed "numberofdaystopush" days late
     * @param numberofdaystopush number of "late" days
     */
    public void pushProject(int numberofdaystopush) {
        Date a = new Date(estimatedEndDate.addDays(numberofdaystopush));
        setProjectType(a);
        setEstimatedEndDate(a);
        setActualEndDate(this.estimatedEndDate);
    }


    /**
     * calculates the duration 
     * @return the calculated number of days 
     */
    public int estimatedDaysToCompletion(){
        int estimatedDaysToCompletion = this.projectStartDate.daysBetween(this.estimatedEndDate);
        return estimatedDaysToCompletion;
    }

    /**
     * determine wether two projects are the same or not 
     * @param other second project
     * @return true if they are the same, false if not 
     */
    public boolean equals(Project other) {
        return this.projectName.equalsIgnoreCase(other.projectName);
    }


    /**
     * converts the created project object's information into a displayable paragraph 
     */
    public String toString() {
        String output = "Estimated days to completion: " + estimatedDaysToCompletion() + "\n" ;
        output += "ID = " + this.projectId + "\n" + "Name: " + this.projectName + "\n" + this.projectDescription + "\n";
        if(isActive) {
            output += "Start = " + this.projectStartDate + "  " + "End = " + this.actualEndDate;
        }
        else if(!isActive) {
            output += "Completed:  " + this.actualEndDate;
        }
        return output;
    }
}
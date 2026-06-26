package model;

public class Task {

    private int taskId;
    private int groupId;
    private int assignedUser;
    private String taskName;
    private String description;
    private String deadline;
    private String status;
    private String assignedUserName;
    



    public Task() {
    }

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getAssignedUser() {
		return assignedUser;
	}

	public void setAssignedUser(int assignedUser) {
		this.assignedUser = assignedUser;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getAssignedUserName() {
	    return assignedUserName;
	}

	public void setAssignedUserName(String assignedUserName) {
	    this.assignedUserName = assignedUserName;
	}
   
}
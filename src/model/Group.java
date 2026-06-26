package model;

public class Group {

    private int groupId;
    private String groupName;
    private String createdDate;

    public Group() {
    }

    public Group(int groupId, String groupName, String createdDate) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.createdDate = createdDate;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    
    @Override
    public String toString() {

        return groupName;

    }
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
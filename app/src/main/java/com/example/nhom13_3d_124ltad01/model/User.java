package com.example.nhom13_3d_124ltad01.model;

public class User {
    private int id;
    private String name;
    private String className;
    private String studentId;
    private String image;
    private String groupName;

    // Constructor
    public User(int id, String name, String className, String studentId, String image, String groupName) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.studentId = studentId;
        this.image = image;
        this.groupName = groupName;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}

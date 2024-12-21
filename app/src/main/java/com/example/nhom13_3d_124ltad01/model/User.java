package com.example.nhom13_3d_124ltad01.model;

public class User {
    private int id;
    private String name;
    private String className;
    private String studentId;
    private String image;
    private String groupName;

    // Constructor, getters và setters
    public User(int id, String name, String className, String studentId, String image, String groupName) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.studentId = studentId;
        this.image = image;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getImage() {
        return image;
    }

    public String getGroupName() {
        return groupName;
    }
}

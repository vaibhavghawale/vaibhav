package com.masai.Model;

import java.util.Objects;

public class Department {
    private int deptId;
    private String deptName;
    private String location;

    public int getDeptId() {
        return deptId;
    }
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(deptId, deptName, location);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Department other = (Department) obj;
        return deptId == other.deptId && Objects.equals(deptName, other.deptName)
                && Objects.equals(location, other.location);
    }
    public Department(int deptId, String deptName, String location) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
        this.location = location;
    }


}

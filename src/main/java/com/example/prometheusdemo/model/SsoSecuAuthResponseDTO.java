package com.example.prometheusdemo.model;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JacksonXmlRootElement(localName = "Response")
public class SsoSecuAuthResponseDTO {

    @JacksonXmlProperty(localName = "ReturnCode")
    private String returnCode;

    @JacksonXmlProperty(localName = "ReturnMessage")
    private String returnMessage;

    @JacksonXmlProperty(localName = "EmpId")
    private String empId;

    @JacksonXmlProperty(localName = "EmpName")
    private String empName;

    @JacksonXmlProperty(localName = "BranchId")
    private String branchId;

    @JacksonXmlProperty(localName = "BranchName")
    private String branchName;

    @JacksonXmlProperty(localName = "Class")
    private String className;

    // Getters 和 Setters
    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}


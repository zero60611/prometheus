package com.example.prometheusdemo.model;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

@JacksonXmlRootElement(localName = "Request")
public class SsoRequestDTO {

    @JacksonXmlProperty(localName = "Token")
    private String token;

    @JacksonXmlProperty(localName = "AppName")
    private String appName;

    @JacksonXmlProperty(localName = "EmpId")
    private String empId;

    @JacksonXmlProperty(localName = "IP")
    private String ip;

    // Getters 和 Setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "SsoRequestDTO{" +
                "token='" + token + '\'' +
                ", appName='" + appName + '\'' +
                ", empId='" + empId + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsoRequestDTO that = (SsoRequestDTO) o;
        return Objects.equals(token, that.token) && Objects.equals(appName, that.appName) && Objects.equals(empId, that.empId) && Objects.equals(ip, that.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, appName, empId, ip);
    }
}

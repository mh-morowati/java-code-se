package net.holosen.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class employ {
    private String employCode;
private String nama;
private String familyName;
private vacation[] vacations;

    public String getEmployCode() {
        return employCode;
    }

    public void setEmployCode(String employCode) {
        this.employCode = employCode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public vacation[] getVacations() {
        if (vacations == null){
            vacations = new vacation[10];
        }
        return vacations;
    }

    public void setVacations(vacation[] vacations) {
        this.vacations = vacations;
    }
    public void addVacation(vacation v){
        if (vacations == null){
            vacations = new vacation[10];
        }
        for (Integer index = 0; index < this.vacations.length; index++){
            if (vacations[index] == null){
                vacations[index] = v;
                break;
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entity;

import org.json.JSONObject;

/**
 *
 * @author WORKGROUP
 */
public class User {
    private String UserID;
    private String Name;
    private String Title;
    private String BirthDate;
    private String HireDate;
    private String Position;
    private String Email;

    public User() {
    }
    
    public User(JSONObject obj) {
        this.UserID = obj.optString("UserID");
        this.Name = obj.optString("Name");
        this.Title = obj.optString("Title");
        this.BirthDate = obj.optString("BirthDate");
        this.HireDate = obj.optString("HireDate");
        this.Position = obj.optString("Position");
        this.Email = obj.optString("Email");
        
    }

    public User(String UserID, String Name, String Title, String BirthDate, 
            String HireDate, String Position, String Email) {
        this.UserID = UserID;
        this.Name = Name;
        this.Title = Title;
        this.BirthDate = BirthDate;
        this.HireDate = HireDate;
        this.Position = Position;
        this.Email = Email;
    }
    
    public JSONObject toJson(){
        JSONObject json = new JSONObject();
        json.put("UserID", UserID);
        json.put("Name", Name);
        json.put("Title", Title);
        json.put("BirthDate", BirthDate);
        json.put("HireDate", HireDate);
        json.put("Position", Position);
        json.put("Email", Email);
        return json;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getHireDate() {
        return HireDate;
    }

    public void setHireDate(String HireDate) {
        this.HireDate = HireDate;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public Object getValue (int index){
        switch(index){
            case 0: return UserID;
            case 1: return Name;
            case 2: return Title;
            case 3: return BirthDate;
            case 4: return HireDate;
            case 5: return Position;
            case 6: return Email;
            default: return null;
        }
    }
}


    
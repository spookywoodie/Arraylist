/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistsample;

/**
 *
 * @author Metch
 */
public class Node {
    private String ID;
    private String Name;
    
    Node(){
        ID="";
        Name="";
    }
    
    Node (String strID, String strName){
        ID=strID;
        Name=strName;
    }
    
    public void setData(String ID, String Name){
        this.ID = ID;
        this.Name = Name;
    }
    
    public void changeName(String strName){
        Name=strName;
    }
    
    @Override
    public String toString(){
        return "ID: " + ID + " \t "    + "  Name: " +  Name +" \n ";
    }
}
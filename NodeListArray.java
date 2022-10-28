/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistsample;

import javax.swing.JOptionPane;

/**
 *
 * @author Metch
 */
public class NodeListArray {
    
    private int size; //number of elements
    private int defaultSize=10;
    private Node []nodeList;
    
    NodeListArray(){
        nodeList = new Node[defaultSize];
        size=0;
    }
    
    NodeListArray(int s){
        defaultSize=s;
        nodeList=new Node[defaultSize];
        size=0;
    }
  
    public void add(int idx, Node n){
        if (size == (defaultSize)){
            System.out.println("Array overflow.");
            return;   
        } 
        else if (idx < size){
            for (int i=size; i>idx; i--)
                nodeList[i]=nodeList[i-1];
            nodeList[idx]=n;
            size++;
            } 
        else {
            nodeList[size] = n;
            size++;       
        }
      
    }
    
    public void add(Node n){
        add(size,n);
      
    }
    
    public Node getNode(int idx){
        return nodeList[idx];
    }
    
    public int getSize(){
        return size;
    }
         
     //display or printlist
    public String display(){
          String nodeList="";
        
      //  for(Node n:NodeObj)  nodeList+=n;// nodeList = nodeList+n;
        for (int i=0; i<this.getSize();i++)
            nodeList +=this.getNode(i);
        
        JOptionPane.showMessageDialog(null,nodeList);                                       
        
        return null;
    }
    public void makeEmty(){
        size= 0;
    }
    public void Delete(int idx){
        for(int i=idx; i< size-1;i++)
            nodeList[i]=nodeList[i+1];
        size--;
    }
    public void Find (int idx){
        String index = "";
        index += nodeList[idx-1];
         
         JOptionPane.showMessageDialog(null, index + "located at index: " + (idx-1));
    
    }
   
    public void next (int idx){
        String index = "";
        index += nodeList[idx+1];
        
         JOptionPane.showMessageDialog(null, index + "located at index: " + (idx-1));
    }
     public void previous (int idx){
        String index = "";
        index += nodeList[idx-1];
        
         JOptionPane.showMessageDialog(null, index + "located at index: " + (idx-1));
}
}
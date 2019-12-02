/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package arrays;

/**
 *
 * @author Donald
 */
import java.util.*;
public class Arrays {

    public void takeArray(String name[])
    {
        String total = "";
        for(int i = 0; i < name.length;i++){
            total= total + name[i] + " ";
        }
        System.out.println(total);
        
    }
    public static void main(String[] args) {
        String[] victor = {"I","want","to","learn","how","to","program","data","encryption","#YOLO"};
        takeArray(victor);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.ArrayList;

/**
 *
 * @author Davis
 */
public class Final {
    public static Arbol arbol = new Arbol();
    public static ArrayList NameIn = new ArrayList();
    public static ArrayList CarneIn = new ArrayList();
    public static ArrayList NamePre = new ArrayList();
    public static ArrayList CarnePre = new ArrayList();
    public static ArrayList NamePost = new ArrayList();
    public static ArrayList CarnePost = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu v = new Menu();
        v.show();
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.Iterator;

/**
 *
 * @author Davis
 */
public class Final {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu v = new Menu();
        v.show();
        
        Arbol arbol = new Arbol();
        //ArbolABB Arbol = new ArbolABB();
        int [] lista = {100,29,71,82,48};
        String [] lista1 = {"mario","carlos","alberto","Tulio","Senia"};
        
        for(int i=0;i<lista.length;i++){
           
           arbol.insertar(lista[i],lista1[i],"",null);
        }
        Iterator it = arbol.graficar().iterator();
        while(it.hasNext()){
            String h = (String)it.next();
            System.out.println(h);
        }
        
        
         
        if(arbol.RetornarRaiz()!=null){
        Nodo dato =arbol.RetornarRaiz();
        System.out.println(dato.llave);
        System.out.println(dato.balance);
        
        
        }
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Aless
 
 * 
 */

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class MyServiceClass {
    
    @WebMethod
    public int AddNumbers(int a,int b){
       return a+b;
    }
    
    @WebMethod
    public String SayHello(String name){
       return "Hello "+name;
    }
     
}

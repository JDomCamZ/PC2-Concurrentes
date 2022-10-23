/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ArmandoLluen <armando.lluen.g@uni.pe>
 */
public class Verificador {
    
    public static boolean verificarIp(String ip){
        return ip.matches("^([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])$");
    }
    
    public static boolean verificarPuerto(String puerto){
        if(puerto.length() > 0){
            for(int i =0; i< puerto.length(); i++){
                char a = puerto.charAt(i);
                if(!(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' ||
                        a == '6' || a == '7' || a == '8' || a == '9' || a == '0'))return false; 
            }
        }else return false;
        return true;
    }
    
}

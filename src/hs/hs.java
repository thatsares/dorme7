/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hs;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Gabriel
 */
public class hs {
    
         public static void main(String args []) throws NoSuchAlgorithmException,
         UnsupportedEncodingException {

                
      
}
         
         private byte[] hash(String Senha)throws NoSuchAlgorithmException,
         UnsupportedEncodingException
         {
             MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
             byte messageDigest[] = algorithm.digest(Senha.getBytes("UTF-8"));
        
             return messageDigest;
         }
         
         
   public byte[] hashSenha(String Senha)throws NoSuchAlgorithmException,
         UnsupportedEncodingException{
        
       System.out.println(Senha);
       System.out.println(hash(Senha));
        return hash(Senha);
    }
}

 
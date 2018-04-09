/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere;


public class Vigenere {


    public static void main(String[] args) {
        String m=Ventanas.entradaS("Enter the message:");
        String k=Ventanas.entradaS("Enter the key:");
        Ventanas.mensaje("This is your ciphertext:\n"+cipher.vigenereEncrypt(m,k));
        
        String c=Ventanas.entradaS("Enter the ciphertext:");
        k=Ventanas.entradaS("Enter the key:");
        Ventanas.mensaje("This is your plaintext:\n"+cipher.vigenereDecrypt(c,k));        
    }
    
}

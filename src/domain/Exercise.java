/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 * Exercise Scytale
 * @author i-kom
 */
public class Exercise {
    
    private String message="";
    private String scytaleMessage;
    private int m;
    private int length;
    
    /**
     * Method that set key
     * @param k key that is needed to decrypt 
     */
    public void setKey(int k) {
        this.m = k;
    }
    
    /**
     * Method which returns key of scytale
     * @return key for scytale
     */
    public int getKey() {
        return this.m ;
    }
    
    /**
     *  Method which returns encrypted message
     * @return scytale message
     */
    public String getScytaleMessage() {
        return this.scytaleMessage;
    }
    
    /**
     * Method set message for for encryption
     * @param message message to be encrypted
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Method which returns decrypted message
     * @return massage which was encrypted
     */
    public String getMessage() {
        return this.message;
    }
    
    /**
     * Method for cipher
     */
    public void cipher(){
        this.length = this.message.length();
        int n =(((Integer) (length-1)/m)+1);
        String s = new String();
        System.out.println(n);
        for(int i = 0;i <n; i++){
            for(int j = 0;j < m; j++)
            {
                try{
                    s+=this.message.charAt(i+n*j);
                }catch(IndexOutOfBoundsException e){
                    s+=" ";
                }
            }
        }
        this.scytaleMessage = s;
        this.message = "";
    }
    
    /**
     *  Method for decrypt
     */
    public void decrypt(){
        int n =(((Integer) (length-1)/m)+1);
        char[] s = new char[this.scytaleMessage.length()];
        int number =0;
        for(int i = 0; i < n;i++){
            for(int j = 0;j < m; j++)
            {
                s[i+n*j]= this.scytaleMessage.charAt(number);
                number++;
            }
        }
        for (int i = 0; i < s.length; i++) {
            this.message+=s[i];
        };
    }
}

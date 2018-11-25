/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Daniel Marinho
 */
public class signIn_data 
{
 
    public String username;
    public String password;
    
    public signIn_data(String str1, String str2)
    {
        username=str1;
        password=str2;
    }
    
    public String returnUser()
    {
        return username;
    }
    
    
    
    
}

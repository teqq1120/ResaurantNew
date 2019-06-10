/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author tkonieczny
 */
public class Parsing {
    
    public static boolean isPossibleToParseInt(String stringToTest){
        try{
            Integer.parseInt(stringToTest);
            return true;
        }
        catch(Exception notPossible){
            return false;
        }
    }
}

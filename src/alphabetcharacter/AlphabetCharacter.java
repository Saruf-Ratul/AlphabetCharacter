/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetcharacter;

/**
 *
 * @author Saruf
 */
public class AlphabetCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
    
}

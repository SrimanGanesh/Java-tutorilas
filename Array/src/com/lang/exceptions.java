/**
 * 
 */
package com.lang;

/**
 * @author ksrimang
 *
 */
public class exceptions {

	try {
        
        String str=null;
        
        System.out.println(str.length());
        
        }catch(ArithmeticException e) {
            System.out.println(e);
        }catch(NullPointerException e) {
            System.out.println(e);
        }catch(Exception e) {
            System.out.println(e);
        }

 

        
        System.out.println("Hello");
    }

 

}
}
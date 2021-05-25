/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdatest;

/**
 *
 * @author lenovo
 */
public class LambdaTest  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String s1="abcddfsdefsadssfdgfghf";
       String s2="abccsfsgdhfjghljh";
       String Longer= StringUtils.betterString(s1, s2, ((t, u) -> t.length() < u.length()));
     
        System.out.println(Longer);
       
    }
    
        
}    
//        LambdaTestInterface mytest = new LambdaTestInterface() {
//            @Override
//            public String betterString(String s1, String s2) {
//                if (s1.length()>s2.length())
//                {
//                    return s1;
//                }
//                else return s2;
//            }
//        };
//        System.out.println(mytest.betterString("ahmed", "shekoo"));
//    }
//    


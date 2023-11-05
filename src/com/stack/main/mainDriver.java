package com.stack.main;
import com.stack.service.Service;
public class mainDriver {
    public static void main(String[] args) {
        //String inputString1 = "( [ [ { } ] ] )";
        //String inputString1 = "( [ [ { } ] ] ) )";
        //String inputString1 = "( [ } { ] )";
        //String inputString1 = "( ) [ ] { }";
        //String inputString1 = "( { [ } ) ]";
        String inputString1 = "( ( ( ( ( ) ) ) )";
        if (Service.isBalancedBrackets(inputString1)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
}

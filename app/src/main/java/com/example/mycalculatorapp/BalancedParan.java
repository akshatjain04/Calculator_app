package com.example.mycalculatorapp;
import java.util.*;
import android.util.Log;
public class BalancedParan {
    // function to check if paranthesis are balanced
    public  static boolean areParanthesisBalanced(String expr) {
        Log.d("expression" ,expr);
       int i,c=0,d=0;
       for(i=0;i<expr.length();i++){
          if(i==0&&(expr.charAt(i)=='+'||expr.charAt(i)=='-'||expr.charAt(i)=='/'||expr.charAt(i)=='*'))
               return false;
           if(expr.charAt(i)=='(')
               c--;
           else if(expr.charAt(i)==')')
               c++;
       }
       if(c!=0)
           return false;
       else
           return true;
    }
}
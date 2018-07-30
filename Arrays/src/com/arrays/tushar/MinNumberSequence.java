package com.arrays.tushar;

import java.util.Stack;

public class MinNumberSequence{
	
public static void PrintMinNumberForPattern(String seq)
{
    // result store output string
    StringBuffer result =new StringBuffer();
 
    // create an empty stack of integers
    Stack<Integer> stk = new Stack<Integer>();
 
    // run n+1 times where n is length of input sequence
    for (int i = 0; i <= seq.length(); i++)
    {
        // push number i+1 into the stack
        stk.push(i + 1);
 
        // if all characters of the input sequence are
        // processed or current character is 'I'
        // (increasing)
        if (i == seq.length() || seq.charAt(i) == 'I')
        {
            // run till stack is empty
            while (!stk.empty())
            {
                // remove top element from the stack and
                // add it to solution
                result.append(String.valueOf(stk.pop()));
                result.append(" ");
                //stk.pop();
            }
        }
    }
 
    System.out.println(result);
}
 
// main function
public static void main(String[] args){
   /* PrintMinNumberForPattern("IDID");
    PrintMinNumberForPattern("I");
    PrintMinNumberForPattern("DD");
    PrintMinNumberForPattern("II");
    PrintMinNumberForPattern("DIDI");
    PrintMinNumberForPattern("IIDDD");*/
    PrintMinNumberForPattern("DDIDDIID");
   
}
}
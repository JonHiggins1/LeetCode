/**
 * Share
  Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

  Example 1:

  Input: 121
  Output: true
  Example 2:
  
  Input: -121
  Output: false
  Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
  Example 3:

  Input: 10
  Output: false
  Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 **/

class Solution {
    public boolean isPalindrome( int x ) {
        if ( x < 0)
            return false;
        int div = 1;
        while (x / div >= 10){
            div *= 10;
        }
        while( x != 0 ){
            int left = x /div;
            int right = x % 10;
            
            if (left != right)
                return false;
            
            x = ( x % div) /10;
            div /= 100;
        }
        return true;
    }
}

/**  
 Below is my Answer that I tried that was rejected, 
 so I restarted from scratch and approached the 
 issue a different way.
       
       if( x >=0 && x <= 9)
 
            return true;
        if( x%10 ==0 )
            return false;
        
        int y = 0;
        while ( x >= y ) {
            if ( x == y )
                return true;
            y = y * 10 + x % 10;
            if ( x == y )
                return true;
            x = x / 10;
        }
        return true;
    }
}
**/
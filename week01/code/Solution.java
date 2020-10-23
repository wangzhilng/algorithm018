import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean backspaceCompare(String S, String T) {
        String s=null;
      char[] arrayS= S.toCharArray();
      char[] arrayT= T.toCharArray();
      String newS="";
        String newT="";
      for (char c:arrayS){
          if (c=='#'&& newS.length()>0){
              newS=newS.substring( 0,newS.length()-1 );
          }else if (c=='#'&& newS.length()==0){
             continue;
          }else {
              newS=newS +c;
          }

      }

        for (char c:arrayT){
            if (c=='#'&& newT.length()>0){
                newT=newT.substring( 0,newT.length()-1 );
            }else if (c=='#'&& newT.length()==0){
                continue;
            }else {
                newT=newT+c;
            }

        }
      System.out.println( newS );
        System.out.println( newT);
        return newS.equals( newT );
    }
}

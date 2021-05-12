// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.List;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{        
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days)
    {
    // WRITE YOUR CODE HERE
        List<Integer> newstates = null;
        int daycount = 0;
        int[] newArr = new int[states.length + 2];
        for(int i = 1; i < states.length - 1; i++){
            newArr[i] = states[i];
        }
        newArr[0] = 0;
        newArr[newArr.length-1] = 0;
        
        while(daycount < days){
            int[] temp = new int[newArr.length];
            temp[0] = 0;
            temp[temp.length-1] = 0;
            
            for(int i = 1; i < newArr.length -1; i++) {
                if(newArr[i-1] == 0 && newArr[i+1] == 0 || newArr[i-1] == 1 && newArr[i+1] == 1){
                    //flip status
                    if(newArr[i] == 0){
                        temp[i] = 1;
                    }else{
                        temp[i] = 0;
                    }
                } 
                    
            }
            newArr = temp;
            daycount++;
        }
        
        for(int i = 1 ; i < newArr.length-1; i++){
            newstates.add(newArr[i]);
        }
        
        return newstates;
        
    }
    //iterate new states one day at a time using a while loop
    
  // METHOD SIGNATURE ENDS
}
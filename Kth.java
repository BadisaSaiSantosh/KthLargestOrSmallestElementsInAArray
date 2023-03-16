//K largest elements from a big file or array.



import java.util.*;
class Kth{
import java.util.*;
class HelloWorld {
   
 public static void main(String[] args) {
  
     Scanner sc=new Scanner(System.in);
    
     int k=sc.nextInt();
      
     int Arr[]={63,34,8,90,233,67,34,23};
    
     Arrays.sort(Arr);
       
      
  for(int i=0;i<k;i++){
      
      // For largest kth elements
   
      System.out.print(Arr[(Arr.length)-1-i]+",");
   
      // For smallest kth elements
      
      // System.out.print(Arr[i]);
     
       }
      
 
   }

}


// expected output

// 4

// 233,90,67,63,


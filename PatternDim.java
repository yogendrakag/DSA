
public class PatternDim {
    public static void main(String[] args) {
  
  
      int n = 8;
  
      for(int i = 1;i<=2*n-1;i++){
          int space1 = n-i;
        if(i>n){
          space1 = Math.abs(n-i);
          
        }
  
        for(int j = 1;j<=space1;j++){
          System.out.print(" ");
        }
  
        System.out.print("*");
  
        int space2 = 2*i-3;
        if(i > n){
          space2 =  (2 * (2 * n - i) - 3);
        }
  
        for(int j= 1;j<=space2;j++){
  
          System.out.print(" ");
        }
  
       if(i == 1 || i == 2*n-1){
         
       }else{
          System.out.print("*");
       }
         System.out.println();
      }
  
     
    }
  
   
  }
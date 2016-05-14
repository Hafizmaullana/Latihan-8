package bab8;

public class Nilai implements D1,I1{
    
    boolean nilai;
   
    public Nilai (Double n){
        nilai = n%1==0;
        cekvalue();
    }
    public void cekvalue(){
        if(nilai){
            I1();
        }
        else{
            D1();
        }
    }
     
     public void D1(){
         System.out.println("\tDouble");
         System.out.println("----------------------");
     }
     public void I1(){
         System.out.println("\tInteger");
         System.out.println("----------------------");
     } 
}
     


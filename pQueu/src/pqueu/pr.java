
package pqueu;


public class pr {
    
    private int max;
    private int n;
    private int[] q;
     public pr(int s){
     max=s;
     q=new int[max];
     n=0;
     }
     
     public void insert(int k){
         int j;
     if(n==max)
       System.out.println("LOL");
     else if(n==0)
         q[n++]=k;
     else{
         for(j=n-1;j>=0;j--){
             if(k>q[j])
                 q[j+1]=q[j];
             else
                 break;
         }
         q[j+1]=k;
         n++;
       
     } }
     
     public int del(){
     return q[--n];}
     
     public boolean IsEmpty(){
     return n==0;}
     
     public boolean IsFull(){
     return n==max;}
public int peek(){
return q[n-1];}   
public int d(){
return n;}
}

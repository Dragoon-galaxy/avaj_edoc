import java.util.*;



public class Main { 
    public static void main(String[] args) { 
        /////////////////////
    empDetails c1= new empDetails(); 
    c1.id="1"; 
    c1.bs=100000; 
    c1.name="Ash";
    c1.add="ImperialHeights_56_kingswayRoad_440017";
    System.out.println("Name:"+c1.name+ " Id: "+c1.id+ " Address: "+c1.add+" Basic salary: "+ c1.bs+ " H.R.A: "+c1.getHra()+" DA: "+c1.getDa()+" PT: "+c1.getPt()+" TS: "+c1.getTs()+" Ths: "+c1.getThs()); 
    /////////////////////////
    empDetails c2= new empDetails(); 
    c2.id="2"; 
    c2.bs=200000; 
    c2.name="Tyson";
    c2.add="EmpressCity_45_QueenswayRoad_440090";
    System.out.println("Name:"+c2.name+ " Id: "+c2.id+ " Address: "+c2.add+" Basic salary: "+ c2.bs+ " H.R.A: "+c2.getHra()+" DA: "+c2.getDa()+" PT: "+c2.getPt()+" TS: "+c2.getTs()+" Ths: "+c2.getThs()); 
   
   } 
}
    class empDetails { 
     String id,name,add; 
     double bs;
     public double getHra(){
        double hra=(0.2)*(bs);
        return hra;
     }
     public double getDa(){
        double Da=(0.45)*(bs);
        return Da;
     }
     public double getPt(){
        double Pt=(0.07)*(bs);
        return Pt;
     }
     public double getTs(){
        double Ts=bs+getHra()+getDa();
        return Ts;
     }
      
     public double getThs(){
        double Ths=getTs()-getPt();
        return Ths;
     }
    

    
   }

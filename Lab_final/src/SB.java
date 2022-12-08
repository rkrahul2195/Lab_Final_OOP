public class SB extends Bank{
    public void GetIntrestRate(Double rate , Double monthly){
        if(monthly>12){
            System.out.println("Month Grater than 12");
        }
        else{
            intrest = (rate*monthly)/12; 
            System.out.println("SB Intrest Rate : "+intrest + " % ");
        }
       
    }
}

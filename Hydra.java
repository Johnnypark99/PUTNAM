import java.util.Random;

public class Hydra{
    public static void main(String [] args){
        int successes=0;
        for(int hercules=0;hercules<1000;hercules++){
            int Chop = 0;
            int head=2;
            while(head!=0&&Chop<100){
                Random rand = new Random();
                int value = rand.nextInt(3);
                if(value == 0){
                    head -= 1;
                    Chop++;
                }
                if(value ==1){
                    head += 1;
                    Chop++;
                }
                if(value ==2){
                    head += 2;
                    Chop ++;
                }
            } 
           if(head == 0){
               successes++;
            }
            System.out.println("Herculues number: "+hercules+" Number of heads "+head+" Number of Chop: "+Chop);
            System.out.println("Successes: "+successes);
        }

    }
}

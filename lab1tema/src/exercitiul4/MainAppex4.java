package exercitiul4;
import java.util.Random;

public class MainAppex4 {

    public static void main(String [] args)
    {
        int n,m;
        Random random= new Random();
        int maxi=30;
        n=random.nextInt(maxi);
        m=random.nextInt(maxi);
        System.out.println("Numarul n ales random este: " +n+ "\n Numarul m ales random este: "+ m);
        while(n!=m){
            if(n>m)
            {
                n-=m;
            }
            else
            {
                m-=n;
            }
        }
        System.out.println("Cel mai mic divizor este: "+n);
    }
}

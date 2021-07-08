import java.util.Arrays;
public class main
{
    public static void main(String[] args)
    {
        float c;
        String[] tablica2 = new String [100];

        for(int i=0; i<100; i++)
        {
            String str2 = Integer.toString(i+1);
            tablica2[i]=str2; // tab[i] =i+1;
            c = (i+1)%3;
            if(c==0) {
                             tablica2[i]="fizz "+str2;
                     }
            c = (i+1)%5;
             if(c==0)
                   {
                            tablica2[i]="buzz "+str2; //+1
                   }
             float d;
             float e;
             d = (i+1)%3;
             e = (i+1)%5;
            if(d==0 && e==0)
                    {
                           tablica2[i]="fizz n buzz "+str2;
                    }
        }
        System.out.println(Arrays.toString(tablica2));
    }
}


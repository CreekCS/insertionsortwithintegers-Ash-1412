import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class InsSortInt {
    public static void main(String[] args)
    {
        int[] arrInt = new int[1000];
        int i = 0;
        String[] arrString = new String[1000];
        try {
            File file = new File("randInts.txt");
            Scanner reader = new Scanner(file);
            
            while(reader.hasNextLine())
            {
                String num = reader.nextLine();
                arrString[i] = num;
                i++;
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        for(int j = 0; j < 1000; j++)
        {
            arrInt[j] = Integer.parseInt(arrString[j]);
            //System.out.println(arrInt[j]);

        }
        for( i = 0; i < 1000; i++)
        {
            int key = arrInt[i];
            int j = i - 1;
            while( j >=0 && arrInt[j] > key)
            {
                arrInt[j + 1] = arrInt[j];
                j = j - 1;
            }
            arrInt[j + 1] = key;
        }
        System.out.println("Smallest: " + arrInt[0] + " Largest: " + arrInt[999]);
    }
}

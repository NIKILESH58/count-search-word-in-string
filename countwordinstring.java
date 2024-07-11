import java.util.*;
public class countwordinstring
{      
   public static void main(String[] args)
   {    
        Scanner in=new Scanner(System.in);
        String finalline="",word="";
        System.out.println("ENTER THE WORD TO SEARCH IN LINES");
        String wordtosearch=in.nextLine();
        System.out.println("ENTER NUMBER OF LINES TO BE ENTER");
        int nooflines=in.nextInt();
        in.nextLine();
        String lines[]=new String[nooflines];
        int countofsearchword[]=new int[nooflines];
       System.out.println("ENTER THE LINES");
        for( int i=0; i<nooflines;i++)
                                  {
                        lines[i]=in.nextLine();
                         lines[i]=lines[i]+" ";
       } 
       for(int j=0;j<nooflines;j++)
        {
            int length = lines[j].length();
         for(int i=0;i<length;i++)
        {
            char character = lines[j].charAt(i);
            if(character==' ')
            {
              if(word.equals(wordtosearch))
              countofsearchword[j]=countofsearchword[j]+1;
              word="";
            }
            else
            word=word+character;
        }
    }
    for(int j=0;j<nooflines;j++)
        {
         for(int i=j+1;i<nooflines;i++)
        {
            if(countofsearchword[j]>=countofsearchword[i])
            {
                int temp=countofsearchword[j];
                countofsearchword[j]=countofsearchword[i];
                countofsearchword[i]=temp;
                String templine = lines[j];
                lines[j]=lines[i];
                lines[i]=templine;
            }
        }
    }
    System.out.println("PRINTING IN LOW TO HIGH FORMAT");
    for( int i=0; i<nooflines;i++)
                                  {
    System.out.println(lines[i]+"--->NUMBER OF SEARCH WORD PRESENT--->"+countofsearchword[i]);
       } 
    }
}
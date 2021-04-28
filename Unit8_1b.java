public class Unit8_1b
{
  public int [] [] modifyRows (int [] [] array)
 { 
   for(int a = 0; a < array.length; a++)
   {
     if(a%2 != 0)
     {
       for(int b = 0; b < array[a].length; b++)
       {
         array[a][b] = array[a - 1][b];
       }
     }
   }
return array;
      }
    }
 
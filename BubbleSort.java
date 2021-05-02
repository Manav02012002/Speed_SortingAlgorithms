class BubbleSort
{
  int i;
  double a[] = new double[100000];
  void arrayels()
  {
  for(i=0;i<100000;i++)
  {
   a[i]=(Math.random()*100);
  }
 }
 void bubbleSort() 
 {  
    int n = a.length;  
    double temp = 0.0;  
     for(int i=0; i < n; i++)
     {  
      for(int j=1; j < (n-i); j++)
      {  
        if(a[j-1] > a[j])
        {  
            //swap elements  
         temp = a[j-1];  
         a[j-1] = a[j];  
         a[j] = temp;  
        }  
                      
       }  
     }  
    }
  public static void main(String args[])
  {
    BubbleSort B = new BubbleSort();
    B.arrayels();
    final double st = System.currentTimeMillis();
    B.bubbleSort();
    final double et = System.currentTimeMillis();
    System.out.println("Time to run program: "+(et-st)+"ms");
  }
}
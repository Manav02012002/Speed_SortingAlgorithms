class InsertionSort
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
 void insertionSort() 
 {  
    int n = a.length;  
    for (int j = 1; j < n; j++) 
    {  
        double key = a[j];  
        int i = j-1;  
        while ( (i > -1) && ( a [i] > key ) ) 
        {  
            a [i+1] = a [i];  
            i--;  
        }  
        a[i+1] = key;  
    }  
}  
  public static void main(String args[])
  {
    InsertionSort I = new InsertionSort();
    I.arrayels();
    final double st = System.currentTimeMillis();
    I.insertionSort();
    final double et = System.currentTimeMillis();
    System.out.println("Time to run program: "+(et-st)+"ms");
  }
}
class SelectionSort
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
 void selectionSort()
 {  
    for (int i = 0; i < a.length - 1; i++)  
    {  
        int index = i;  
        for (int j = i + 1; j < a.length; j++){  
            if (a[j] < a[index])
            {  
                index = j;
            }  
        }  
        double smallerNumber = a[index];   
        a[index] = a[i];  
        a[i] = smallerNumber;  
    }  
}  
  public static void main(String args[])
  {
    SelectionSort S = new SelectionSort();
    S.arrayels();
    final double st = System.currentTimeMillis();
    S.selectionSort();
    final double et = System.currentTimeMillis();
    System.out.println("Time to run program: "+(et-st)+"ms");
  }
}
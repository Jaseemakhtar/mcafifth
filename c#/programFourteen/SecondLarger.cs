using System;

namespace ProgramFourteen
{
    class Program
    {
        static void Main(string[] args)
        {
            int n;
            Console.WriteLine("Enter the size of the array");
            n = Int16.Parse(Console.ReadLine());
            int[] array = new int[n];
            Console.WriteLine("Enter {0} elements into array", n);
            
            for (int i = 0; i < n; i++)
                array[i] = Int16.Parse(Console.ReadLine());

            
            for (int i = 0; i < n; i++) {
                int max = array[i];
                for (int j = 0; j < n; j++) {        
                        if (array[j] > max) {
                            int t = array[j];
                            array[j] = array[i];
                            array[i] = t;
                        }
                   
                }
            }

            Console.WriteLine("Second largest element: {0}", array[n - 2]);

            Console.ReadLine();
        }
    }
}

using System;

namespace ProgramFour
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = { 1, 4, 6, 2, 8, 9, 7 };
            Console.WriteLine("Properties & Methods of an Array: ");
            displayArray(array);
            Console.WriteLine();
            Console.WriteLine("Length: {0}", array.Length);
            Console.WriteLine("Rank: {0}", array.Rank);
            Console.WriteLine("Max(): {0}", array.Max());
            Console.WriteLine("Min(): {0}", array.Min());
            Console.WriteLine("Sum(): {0}", array.Sum());
            
            Console.WriteLine("Array.Reverse()");
            Array.Reverse(array);
            displayArray(array);

            Console.WriteLine("Array.Sort()");
            Array.Sort(array);
            displayArray(array);

            Console.WriteLine();
            Console.WriteLine("____________________________________");
            Console.WriteLine();

            Console.WriteLine("Properties & Methods of a String: ");
            String str1 = "Hello World!, I am Jaseem!. ";
            Console.WriteLine();
            String str2 = "Full-Stack Android & Web Developer.";
            Console.WriteLine("String 1: {0}", str1);
            Console.WriteLine("String 2: {0}", str2);
            Console.WriteLine("str1.Length: {0}", str1.Length);
            Console.WriteLine("str1.IndexOf('J'): {0}", str1.IndexOf('J'));
            Console.WriteLine("str2.Contains(\"Developer\"): {0}", str2.Contains("Developer"));
            Console.WriteLine("str1.Insert(19 + 6, \"-Akhtar\"): {0}", str1.Insert(str1.IndexOf('J') + 6, "-Akhtar"));
            Console.WriteLine("str1.Replace(\"I am\", \"This is\"): {0}", str1.Replace("I am", "This is"));
            Console.WriteLine("str1.Remove(str1.IndexOf(','): {0}", str1.Remove(str1.IndexOf(',')));
            Console.WriteLine("str1.Substring(str1.IndexOf(','): {0}", str1.Substring(str1.IndexOf(',') + 1));

            Console.WriteLine("String.Concat(str1, str2): {0}", String.Concat(str1, str2));
            Console.WriteLine("String.Equals(str1, str2): {0}", String.Equals(str1, str2));
            Console.WriteLine("String.Compare(str1, str2): {0}", String.Compare(str1, str2));
            

            Console.ReadLine();
        }

        static void displayArray(int[] a)
        {
            Console.Write("[");
            for (int i = 0; i < a.Length; i++)
            {
                Console.Write(" {0} ", a[i]);
            }
            Console.WriteLine("]");
        }
    }
}

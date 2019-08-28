using System;

namespace ProgramSix
{
    class Program
    {
        static void Main(string[] args)
        {
            int sum = 0;
            Console.WriteLine("First 10 natural numbers");

            for (int i = 1; i <= 10; i++)
            {
                sum += i;
                Console.WriteLine(i);
            }

            Console.WriteLine("Sum: {0}", sum);
            Console.ReadLine();
        }
    }
}

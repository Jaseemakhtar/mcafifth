using System;

namespace ProgramSixteen
{
    class Program
    {
        static void Main(string[] args)
        {
            if (args.Length >= 2)
            {
                int num1 = Int32.Parse(args[0]);
                int num2 = Int32.Parse(args[1]);
                int sum = num1 + num2;
                Console.WriteLine("Addition of CLA: {0}", sum);
            }
            else
            {
                Console.WriteLine("No command line arguments to process");
            }
            Console.ReadLine();
        }
    }
}

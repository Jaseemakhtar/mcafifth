using System;

namespace ProgramNine
{
    class Program
    {
        static void Main(string[] args)
        {
            string input;
            Console.WriteLine("Enter any word");
            input = Console.ReadLine();
            Console.WriteLine("Upper case: {0}", input.ToUpper());
            Console.WriteLine("Lower case: {0}", input.ToLower());
            Console.ReadLine();
        }
    }
}

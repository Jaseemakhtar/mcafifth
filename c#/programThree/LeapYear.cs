using System;

namespace ProgramThree
{
    class Program
    {
        static void Main(string[] args)
        {
            long year;
            Console.WriteLine("Enter the year");
            year = Int64.Parse(Console.ReadLine());
            
            if (checkYear(year))
                Console.WriteLine("{0} is a Leap year", year);
            else
                Console.WriteLine("{0} is not a Leap year", year);

            Console.ReadLine();
        }

        static bool checkYear(long year) {
            if (year % 400 == 0)
                return true;
            else if (year % 100 == 0)
                return false;
            else if (year % 4 == 0)
                return true;
            else
                return false;
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace EnumerationDemo
{
    class ProgramOne
    {
        enum CollegeDays
        {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

        static void Main(string[] args)
        {

            foreach (var day in Enum.GetValues(typeof(CollegeDays)))
            {
                Console.WriteLine("{0} : {1}",day, (int) day);
            }
            Console.Read();
        }
    }
}

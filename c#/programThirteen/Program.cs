using System;

namespace ProgramThirteen
{
    class Program
    {
        static void Main(string[] args)
        {
            Car car = new Car("Tesla");
            car.aboutToBlowListener += new Car.EventHandler(aboutToBlow);
            car.exploadListener += new Car.EventHandler(exploded);

            Console.WriteLine("*****Speeding Up*******");

            try
            {
                for (int i = 0; i < 20; i++)
                {
                    car.accelerate(20);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception: Car is dead already!");
            }
            

                Console.ReadLine();
        }

        public static void aboutToBlow(string msg)
        {
            Console.WriteLine("-> Reporting: {0}", msg);
        }

        public static void exploded(string msg)
        {
            Console.WriteLine("-> Reporting: {0}", msg);
            throw new Exception("Car dead");
        }
    }
}

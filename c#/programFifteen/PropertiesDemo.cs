using System;

namespace ProgramFifteen
{
    class PropertiesDemo
    {
        private string name;
        private int age;

        public string Name{
            set {
                name = value;
            }
            get {
                return name;
            }
        }

        public int Age {
            set {
                if (value > 0)
                    age = value;
            }

            get {
                return age;
            }
        }

        static void Main(string[] args)
        {
            PropertiesDemo p = new PropertiesDemo();
            p.Name = "Jaseem";
            p.Age = 23;

            PropertiesDemo d = new PropertiesDemo();
            d.Name = "Mr.X";
            d.Age = -1;

            Console.WriteLine("{0} : {1}", p.Name, p.Age);
            Console.WriteLine("{0} : {1}", d.Name, d.Age);
            Console.ReadLine();
        }
    }
}

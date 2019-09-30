using System;

namespace ProgramTwelve
{
    class Rectangle
    {
        int width;
        int height;

        Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public static Rectangle operator +(Rectangle a, Rectangle b)
        {
            int totalWidth = a.width + b.width;
            int totalHeight = a.height + b.height;
            return new Rectangle(totalWidth, totalHeight);
        }

        static void Main(string[] args)
        {
            Rectangle r1 = new Rectangle(60, 40);
            Rectangle r2 = new Rectangle(80, 50);
            Console.WriteLine("R1 Width: {0}", r1.width);
            Console.WriteLine("R1 Height: {0}", r1.height);
            
            Console.WriteLine();            
            
            Console.WriteLine("R2 Width: {0}", r2.width);
            Console.WriteLine("R2 Height: {0}", r2.height);

            Console.WriteLine();            

            Rectangle r3 = r1 + r2;
            Console.WriteLine("Total Width: {0}", r3.width);
            Console.WriteLine("Total Height: {0}", r3.height);
            Console.Read();
        }
    }
}

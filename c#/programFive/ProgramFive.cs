using System;

namespace ProgramFive
{
    class Program
    {
        static void Main(string[] args)
        {
            double num1, num2;
            double sum, sub, mul, div;

            Console.WriteLine("Enter the two numbers");
            num1 = Double.Parse(Console.ReadLine());
            num2 = Double.Parse(Console.ReadLine());

            sum = num1 + num2;
            sub = num1 - num2;
            mul = num1 * num2;
            div = num1 / num2;

            Console.WriteLine("Addition: {0}", sum);
            Console.WriteLine("Substraction: {0}", sub);
            Console.WriteLine("Multiplication: {0}", mul);
            Console.WriteLine("Division: {0}", div);
            Console.ReadLine();
        }
    }
}

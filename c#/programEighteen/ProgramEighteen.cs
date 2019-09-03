using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

    class Animal
    {
        public virtual void speak() { }
    }

    class Dog : Animal
    {
        public override void speak()
        {
            Console.WriteLine("Woof woof...");
        }
    }

    class Cat : Animal
    {
        public override void speak()
        {
            Console.WriteLine("Meow meow...");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Animal dog = new Dog();
            Animal cat = new Cat();
            dog.speak();
            cat.speak();
            Console.ReadLine();
        }
    }

using System;

namespace ProgramThirteen
{
    class Car
    {
        public delegate void EventHandler(string msg);
        
        public event EventHandler exploadListener;
        public event EventHandler aboutToBlowListener;

        private string name;
        private bool isExhausted;
        private int currentSpeed;
        private const int maxSpeed = 140;

        public Car(String name)
        {
            this.name = name;
        }

        public void accelerate(int delta)
        {
            if (isExhausted)
            {
                if (exploadListener != null)
                    exploadListener("Sorry, the car is dead!");
            }
            else
            {
                currentSpeed += delta;

                if (10 >= maxSpeed - currentSpeed && aboutToBlowListener != null)
                {
                    aboutToBlowListener("Be Careful, Gonna blow!");
                }

                if (currentSpeed >= maxSpeed)
                    isExhausted = true;
                else
                    Console.WriteLine("-> Current Speed: {0}", currentSpeed);

            }
        }
    }
}

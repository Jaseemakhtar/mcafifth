using System;

namespace ProgramTwo
{
    class Program
    {
        static void Main(string[] args)
        {
            User user1 = new User("Tony");
            Admin user2 = new Admin("Jaseem", "jaseem@gmail.com", "akhtar");

            Console.WriteLine("User 1:");
            Console.WriteLine("Name: {0}", user1.getName());
            Console.WriteLine("Email: {0}", user1.getEmail());

            Console.WriteLine();

            Console.WriteLine("User 2 (Admin):");
            Console.WriteLine("Name: {0}", user2.getName());
            Console.WriteLine("Email: {0}", user2.getEmail());
            Console.WriteLine("Password: {0}", user2.getPassword());

            Console.Read();
        }
    }

    class User {
        private string name;
        private string email;

        public User(String name) {
            this.name = name;
        }

        public User(String name, String email)
        {
            this.name = name;
            this.email = email;
        }

        public string getName() {
            return name;
        }

        public string getEmail()
        {
            return email;
        }

        public void setName(string name)
        {
            this.name = name;
        }

        public void setEmail(string email)
        {
            this.email = email;
        }
    }

    class Admin : User {
        private string password;
        public Admin(string name, string email, string password): base(name, email)
        {
            this.password = password;
        }

        public void setPassword(string password) {
            this.password = password;
        }

        public string getPassword() {
            return password;
        }
    }
}

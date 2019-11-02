using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;

namespace ProgramEleven
{
    class UserAccessLayer
    {
        private List<User> users;
        private string connectionString = "Data Source=(LocalDB)\\v11.0;AttachDbFilename=\"C:\\Users\\Jaseem\\Documents\\Visual Studio 2013\\Projects\\ProgramEleven\\ProgramEleven\\myDatabase.mdf\";Integrated Security=True";
        private SqlConnection connection;
        private SqlCommand command;
        private string query;
        
        public List<User> getAllUsers()
        {
            users = new List<User>();
            try
            {
                connection = new SqlConnection(connectionString);
                connection.Open();
                query = "SELECT * FROM _user";
                command = new SqlCommand(query, connection);
                SqlDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    User user = new User();
                    user.Id = Convert.ToInt16(reader.GetValue(0));
                    user.UserName = reader.GetValue(1).ToString();
                    user.Email = reader.GetValue(2).ToString();
                    user.RollNumber = reader.GetValue(3).ToString();

                    users.Add(user);
                }
        
            }
            catch (SqlException ex)
            {
                Console.WriteLine("Error in fetching database!: " + ex.Message);
            }

            return users;
        }
    }
}

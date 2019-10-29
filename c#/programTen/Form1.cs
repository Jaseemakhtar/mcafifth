using System;
using System.Windows.Forms;

namespace ProgramTen
{
    public partial class Form1 : Form
    {
        string[] names;
        string[] passs;
        int rows;

        public Form1()
        {
            InitializeComponent();
            names = new string[10];
            passs = new string[10];

            names[0] = "Jaseem";
            names[1] = "Tony";
            names[2] = "Morgan";

            passs[0] = "sugarcane";
            passs[1] = "pepper";
            passs[2] = "burger";

            rows = 3;
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            string username = txtName.Text;
            string password = txtPass.Text;

            for (int i = 0; i < rows; i++)
            {
                if (names[i].Equals(username.Trim()) && passs[i].Equals(password.Trim()))
                {
                    MessageBox.Show("Login Successfull!");
                    return;
                }
            }

            MessageBox.Show("Incorrect username/password!");
        }

        
    }
}

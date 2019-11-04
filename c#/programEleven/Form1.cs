using System;
using System.Collections.Generic;
using System.Data;
using System.Windows.Forms;

namespace ProgramEleven
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnFetch_Click(object sender, EventArgs e)
        {
            UserAccessLayer uAL = new UserAccessLayer();
            List<User> users = uAL.getAllUsers();
            if(users.Count == 0)
                lblStatus.Text = "No data!";
            else
                lblStatus.Text = "Data Fetched!";

            dGV.DataSource = users;

        }
    }
}

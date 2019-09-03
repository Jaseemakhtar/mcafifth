using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace ProgramSeven
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int num1 = Int16.Parse(textBox1.Text);
            int num2 = Int16.Parse(textBox2.Text);

            int sum = num1 + num2;
            label1.Text = "Sum: " + sum;
        }
    }
}

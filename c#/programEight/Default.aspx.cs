using System;
using System.Web;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
       
    }
    protected void clickMeButton_Click(object sender, EventArgs e)
    {
        object value = ViewState["HitCount"];
        int i = (value == null) ? 1 : (int)value + 1;
        lblOutput.Text = string.Format("You score is: {0}", i);
        ViewState["HitCount"] = i;
    }
}
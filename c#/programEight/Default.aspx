<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Game - Hit the button</title>
    <style>
        html{
            height: 100%;
        }
        body{
            min-height: 100%;
            padding: 0;
            margin: 0;
        }
        *{
            font-family: Arial;
        }
        .container{
            height: 100vh;
            display: flex;
            flex-direction: column;
            align-items:center;
        }
        .space{
            flex-grow: 1;
        }
        footer{
            font-size: 0.8em;
            padding: .4em;
            color: gray;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div class="container">
        <h1>Welcome to Game - Hit the button!</h1>
        <asp:Label ID="lblOutput" Text="Your score is 0" runat="server" />
        <asp:button id="clickMeButton" runat="server" text="Hit!" onClick="clickMeButton_Click" />
        <div class="space"></div>
        <footer>&copy; 2019 Jaseemakhtar. All Rights Reserved.</footer>
    </div>
    </form>
</body>
</html>
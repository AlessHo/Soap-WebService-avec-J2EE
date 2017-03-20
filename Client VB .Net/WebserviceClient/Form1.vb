Imports WebserviceClient.localhost

Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        Dim s As New MyServiceClassService
        Dim number1 = TextBox1.Text
        Dim number2 = TextBox2.Text
        Dim result = s.AddNumbers(number1, number2)
        Label3.Text = result
    End Sub

End Class

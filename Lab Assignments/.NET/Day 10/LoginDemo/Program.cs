using Microsoft.Data.SqlClient;

namespace LoginDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDB;Integrated Security=True";

            Console.Write("Enter Username: ");
            string username = Console.ReadLine();

            Console.Write("Enter Password: ");
            string password = Console.ReadLine();

            SqlConnection con = new SqlConnection(connectionString);
            
                con.Open();

                string query = "SELECT USERNAME, PASSWORD FROM Users";
                SqlCommand cmd = new SqlCommand(query, con);

                SqlDataReader reader = cmd.ExecuteReader();

                bool isAuthenticated = false;

                while (reader.Read())
                {
                    string dbUser = reader["Username"].ToString();
                    string dbPass = reader["Password"].ToString();

                    if (dbUser == username && dbPass == password)
                    {
                        Console.WriteLine($"Welcome {dbUser}");
                        isAuthenticated = true;
                        break; 
                    }
                }

                if (!isAuthenticated)
                {
                    Console.WriteLine("Invalid credentials. Exiting...");
                }

                con.Close();
            
        }
    }
}

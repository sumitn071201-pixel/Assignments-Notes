using ConnectionADODemo.Models;
using Microsoft.Data.SqlClient; // Data Source

namespace ConnectionADODemo.DAL
{
    // Controller
    // Business Logic
    // Database Connectivity Layer
    public  class IETDBContext
    {
        string connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDB;Integrated Security=True";

        public List<Emp> GetEmpRecords()
        {
            SqlConnection connection = new SqlConnection(connectionString);
            SqlCommand cmd = new SqlCommand("SELECT * FROM Emp", connection);
            
            connection.Open();

            SqlDataReader reader = cmd.ExecuteReader();

            List<Emp> allEmpRecords = new List<Emp>();

            while (reader.Read())
            {
                allEmpRecords.Add(new Emp()
                {
                    EId = Convert.ToInt32(reader["Id"]),
                    EName = reader["Name"].ToString(),
                    EAddress = reader["Address"].ToString()

                });
            }
            connection.Close();

            return allEmpRecords;

        }
        public List<Emp> GetEmpRecordsById(int idToBeSearched)
        {
            SqlConnection connection = new SqlConnection(connectionString);

            string selectByIDQuery = $"SELECT * FROM Emp WHERE ID = {idToBeSearched}";

            SqlCommand cmd = new SqlCommand(selectByIDQuery, connection);

            connection.Open();

            SqlDataReader reader = cmd.ExecuteReader();

            List<Emp> allEmpRecords = new List<Emp>();

            while (reader.Read())
            {
                allEmpRecords.Add(new Emp()
                {
                    EId = Convert.ToInt32(reader["Id"]),
                    EName = reader["Name"].ToString(),
                    EAddress = reader["Address"].ToString()
                });
            }
            connection.Close();

            return allEmpRecords;
        }

        public int InsertEmpRecord(Emp emp)
        {
            SqlConnection conn = new SqlConnection(connectionString);

            string insertQuery = $"INSERT INTO EMP(NAME, ADDRESS) VALUES ('{emp.EName}','{emp.EAddress}')";

            SqlCommand cmd = new SqlCommand(insertQuery, conn);
            conn.Open();
            int rowsAffected = cmd.ExecuteNonQuery();
            conn.Close();
            return rowsAffected;
        }
        public int UpdateEmpRecord(int idToBeUpdated, Emp emptoBeUpdated)
        {
            SqlConnection conn = new SqlConnection(connectionString);

            string updateQuery = $"UPDATE EMP SET NAME= '{emptoBeUpdated.EName}', ADDRESS = '{emptoBeUpdated.EAddress}' WHERE ID = {idToBeUpdated} ";

            SqlCommand cmd = new SqlCommand(updateQuery, conn);
            conn.Open();
            int rowsAffected = cmd.ExecuteNonQuery();
            conn.Close();
            return rowsAffected;
        }
        public int DeleteEmpRecord(int idToBeDeleted)
        {
            SqlConnection conn = new SqlConnection(connectionString);

            string deleteQuery = $"DELETE FROM EMP WHERE ID = {idToBeDeleted} ";

            SqlCommand cmd = new SqlCommand(deleteQuery, conn);
            conn.Open();
            int rowsAffected = cmd.ExecuteNonQuery();
            conn.Close();
            return rowsAffected;
        }
    }
}
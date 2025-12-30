using Microsoft.Data.SqlClient;
namespace StoredProceduresDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string _conStr = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDB;Integrated Security=True";

            //InsertDepartment(_conStr, "Sales");

            //InsertEmployee(_conStr, "Timothy", 4);
            //InsertEmployee(_conStr, "John", 2);
            //InsertEmployee(_conStr, "Rob", 4);

            GetEmployeeById(_conStr, 4);
            GetEmployeeById(_conStr, 1);

            Console.WriteLine("Done");

            
        }

        public static void InsertDepartment(string conStr, string deptName)
            {
                  using(SqlConnection con= new SqlConnection(conStr)) 
                  {
                      con.Open();
                        using (SqlCommand cmd = new SqlCommand())
                        {
                            cmd.CommandType = System.Data.CommandType.StoredProcedure;
                            cmd.CommandText = "InsertDepartment";
                            cmd.Connection = con;
                            cmd.Parameters.AddWithValue("@DepartmentName", deptName);

                            cmd.ExecuteNonQuery();
                        }
                  }

                  
            }
         
            public static void InsertEmployee(string conStr, string empName, int deptId)
            {
                  using( SqlConnection con= new SqlConnection(conStr))
                  { 
                      
                    con.Open() ;
                     using (var cmd = new SqlCommand("InsertEmployee", con))
                     {

                             cmd.CommandType = System.Data.CommandType.StoredProcedure;
                             cmd.Parameters.AddWithValue("@EmployeeName", empName);
                             cmd.Parameters.AddWithValue("@DepartmentId", deptId);
                             cmd.ExecuteNonQuery();
                         
                     }
                 


                  }
            }

            public static void GetEmployeeById(string conStr, int id)
            {

                using (var connection = new SqlConnection(conStr))
                {
                    connection.Open();
                    using (var command = new SqlCommand("GetEmployeeByDepartment", connection))
                    {
                        command.CommandType = System.Data.CommandType.StoredProcedure;
                        command.Parameters.AddWithValue("@DepartmentId", id);
                        using (var reader = command.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                Console.WriteLine($"Id: {reader["EmployeeId"]}, Name: {reader["EmployeeName"]}");
                            }
                        }
                    }
                }
            }
           




    }
}

        
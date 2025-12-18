namespace PropertiesDemo
{
    #region Getters and Setters code : old approach
    //public void set_EId(int id)
    //{
    //    _EId = id;
    //}
    //public int get_EId()
    //{
    //    if( _EId == 0 )
    //        return _EId + 1;
    //    else
    //        return _EId;
    //}
    #endregion
    // Properties : - compiler will generate getter ans setter methods for you
    // Syntax:
    //accessModifier DataType PropertyName
    //{
    //    set
    //    {
    //        _PrivateMemeber = value;
    //    }
    //    get
    //    {
    //        return _PrivateMemeber;
    //    }
    //}
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee emp = new Employee();
           int id= emp.Eid = 10;
            Console.WriteLine($"ID : {id}");
            emp.EName = "Hugh Jackson";
            Console.WriteLine($"Name : {emp.EName}");
            emp.EAddress = "New York";
            Console.WriteLine($"Address : {emp.EAddress}");

        }
    }
    public class Employee
    {
        private int _Eid;
        private string _EName;
        private string _EAddress;

        public int Eid
        {
            set
            {
                _Eid = value;
            }
            get
            {
                return _Eid;
            }
        }

        public string EName
        {
            set
            {
                if (value != null)
                {
                    _EName = "Mr." + value;
                }
                else
                {
                    _EName = "Invalid format";
                }
            }
            get
            {
                return _EName;
            }
        }
        public string EAddress
        {
            set
            {
                _EAddress = value;
            }
            get
            {
                return _EAddress;
            }
        }
       
    }
    
    

}

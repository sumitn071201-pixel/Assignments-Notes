using BVSAttributeDemo;
using CustomAttributesDemo;
using System;
namespace EmpLibDemo
{
    #region refer for demo: MyApplicationDemo
   // [BonaventureSystems(CompanyName = "BVS", DeveloperName = "ABC")]
    //[Serializable] 
    #endregion

    //[Table(TableName = "Employee")]
    public class Emp
    {
        private int _Id;
        private string _Name;
        private string _Address;

        [Column(ColumnName = "EId", ColumnType = "int")]
        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }
        [Column(ColumnName = "EName", ColumnType = "varchar(50)")]
        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }
        [Column(ColumnName = "EAddress", ColumnType = "varchar(50)")]
        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }
    }
}
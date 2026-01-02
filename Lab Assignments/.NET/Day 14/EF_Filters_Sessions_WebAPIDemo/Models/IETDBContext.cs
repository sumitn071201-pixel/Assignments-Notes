using Microsoft.EntityFrameworkCore;

namespace EF_Filters_Sessions_WebAPIDemo.Models
{
    public class IETDBContext:DbContext
    {
        public DbSet<Emp> emps { get; set; }

        public IETDBContext(DbContextOptions options) : base(options)
        {

        }
    }
}
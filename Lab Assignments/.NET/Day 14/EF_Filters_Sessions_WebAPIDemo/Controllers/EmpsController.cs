using EF_Filters_Sessions_WebAPIDemo.Models;
using Microsoft.AspNetCore.Cors;
using Microsoft.AspNetCore.Mvc;

namespace EF_Filters_Sessions_WebAPIDemo.Controllers
{
    [EnableCors(PolicyName = "IET")]
    [Route("api/[controller]")]
    [ApiController]
    public class EmpsController : ControllerBase
    {
        private readonly IETDBContext _db;

        public EmpsController(IETDBContext db)
        {
            _db = db;
        }
        // GET: api/Emps
        [HttpGet]
        public IEnumerable<Emp> GetEmps()
        {
            return _db.emps.ToList();
        }

        // GET api/<EmpsController>/5
        [HttpGet("{id}")]
        public Emp Get(int id)
        {
            Emp emp = _db.emps.Find(id);
            return emp;
        }

        // POST api/<EmpsController>
        [HttpPost]
        public void Post([FromBody] Emp entity)
        {
            _db.emps.Add(entity);
            _db.SaveChanges();
        }

        // PUT api/<EmpsController>/5
        [HttpPut("{id}")]
        public void Put(int id, [FromBody] Emp entity)
        {
            Emp emp = _db.emps.Find(id);
            emp.Name = entity.Name;
            emp.Address = entity.Address;
            _db.SaveChanges();
        }

        // DELETE api/<EmpsController>/5
        [HttpDelete("{id}")]
        public void Delete(int id)
        {
            Emp emp = _db.emps.Find(id);
            _db.emps.Remove(emp);
            _db.SaveChanges();
        }
    }
}
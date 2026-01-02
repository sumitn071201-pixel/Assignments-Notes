using System.Diagnostics;
using EF_Filters_Sessions_WebAPIDemo.Models;
using EF_Filters_Sessions_WebAPIDemo.Filters;
using Microsoft.AspNetCore.Mvc;

namespace EF_Filters_Sessions_WebAPIDemo.Controllers
{
     //[Auth]
    public class HomeController : BaseController
    {
        private readonly IETDBContext _dbContext;

        public HomeController(IETDBContext context)
        {
            _dbContext = context;
        }

        public IActionResult Index()
        {
            ViewBag.ctr = "Home";
            var allEmps = _dbContext.emps.ToList();
            return View(allEmps);
        }

        [HttpGet]
        public IActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public IActionResult AfterCreate(Emp emp)
        {
            _dbContext.emps.Add(emp);
            _dbContext.SaveChanges();
            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
            if (id == 1111)
            {
                throw new Exception("Id can not be 1111");
            }
            Emp emp = _dbContext.emps.Find(id);
            if (emp != null)
            {
                return View(emp);
            }
            else
            {
                return NotFound(404);
            }
        }
        [HttpPost]
        public IActionResult Edit(int id, Emp emp)
        {
            if (ModelState.IsValid)
            {
                Emp em = _dbContext.emps.Find(id);
                em.Name = emp.Name;
                em.Address = emp.Address;
                _dbContext.SaveChanges();
            }
            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            Emp emp = _dbContext.emps.Find(id);
            _dbContext.emps.Remove(emp);
            _dbContext.SaveChanges();
            return RedirectToAction("Index");
        }
        [HttpGet]
        public IActionResult Details(int id)
        {
            Emp emp = _dbContext.emps.Find(id);
            return View(emp);
        }
        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
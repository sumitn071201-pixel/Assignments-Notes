using EF_Filters_Sessions_WebAPIDemo.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System.Diagnostics;

namespace EF_Filters_Sessions_WebAPIDemo.Controllers
{
    public class DemoController : BaseController
    {
        private readonly IETDBContext _db;

        public DemoController(IETDBContext context)
        {
            _db = context;
        }

        public IActionResult Index()
        {
            ViewBag.ctr = "Home";
            var allEmps = _db.emps.ToList();
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
            _db.emps.Add(emp);
            _db.SaveChanges();
            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult Edit(int id)
        {
            if (id == 1111)
            {
                throw new Exception("Id can not be 1111");
            }
            Emp emp = _db.emps.Find(id);
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
                Emp em = _db.emps.Find(id);
                em.Name = emp.Name;
                em.Address = emp.Address;
                _db.SaveChanges();
            }
            return RedirectToAction("Index");
        }

        [HttpGet]
        public IActionResult Delete(int id)
        {
            Emp emp = _db.emps.Find(id);
            _db.emps.Remove(emp);
            _db.SaveChanges();
            return RedirectToAction("Index");
        }
        [HttpGet]
        public IActionResult Details(int id)
        {
            Emp emp = _db.emps.Find(id);
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
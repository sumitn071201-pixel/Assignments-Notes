using ConnectedDemo.DAL;
using ConnectedDemo.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace ConnectedDemo.Controllers
{
    public class HomeController : Controller
    {

        private readonly IETDBContext _DbContext;

        public HomeController(IETDBContext context)
        {
            _DbContext = context;
        }

        public IActionResult Index()
        {
            var allEmps = _DbContext.GetAllEmps();
            return View(allEmps);
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

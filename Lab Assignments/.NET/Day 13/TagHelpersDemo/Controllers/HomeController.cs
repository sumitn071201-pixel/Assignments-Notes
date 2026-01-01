using Microsoft.AspNetCore.Mvc;
using TagHelpersDemo.Models;

namespace TagHelpersDemo.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult GetNewUserDetails(NewUser newuser)//Model Binder
        {
            return View(newuser);
        }
    }
}
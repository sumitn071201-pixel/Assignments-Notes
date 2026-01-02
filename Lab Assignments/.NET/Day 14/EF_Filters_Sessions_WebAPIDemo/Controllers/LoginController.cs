using EF_Filters_Sessions_WebAPIDemo.Models;
using Microsoft.AspNetCore.Mvc;

namespace EF_Filters_Sessions_WebAPIDemo.Controllers
{
    public class LoginController : Controller
    {
        [HttpGet]
        public IActionResult SignIn()
        {
            return View();
        }
        [HttpPost]
        public IActionResult SignIn(User user)
        {
            if (user.UserName == "admin" && user.Password == "1234")
            {
                HttpContext.Session.SetString("token", user.UserName);
                return Redirect("/Home/Index");
            }
            else
            {
                ViewBag.message = "Invalid Credentials";
                return View();
            }
        }
        public IActionResult Signout()
        {
            HttpContext.Session.Remove("token");
            return Redirect("/Login/SignIn");
        }
    }
}
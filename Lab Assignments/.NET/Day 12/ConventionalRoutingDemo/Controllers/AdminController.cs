using Microsoft.AspNetCore.Mvc;

namespace ConventionalRoutingDemo.Controllers
{
    public class AdminController : Controller
    {
        // URL: /Admin/Index?nm=Hugh Jackman
        public string Index(string nm)
        {
            return nm;
        }
    }
}

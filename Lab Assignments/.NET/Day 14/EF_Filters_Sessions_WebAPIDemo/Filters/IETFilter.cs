using EF_Filters_Sessions_WebAPIDemo.Controllers;
using EF_Filters_Sessions_WebAPIDemo.Logger;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Filters;
using System.Runtime.ConstrainedExecution;

namespace EF_Filters_Sessions_WebAPIDemo.Filters
{
    public class IETFilter : ActionFilterAttribute
    {
        public override void OnActionExecuting(ActionExecutingContext context)
        {
            FileLogger.CurrentLogger.Log($"Calling :{context.HttpContext.Request.Path.Value} ");
        }

        public override void OnActionExecuted(ActionExecutedContext context)
        {
            FileLogger.CurrentLogger.Log($"Called:  {context.HttpContext.Request.Path.Value} ");
        }

        public override void OnResultExecuting(ResultExecutingContext context)
        {
            FileLogger.CurrentLogger.Log($"Generating View: {context.HttpContext.Request.Path.Value} ");
        }
        public override void OnResultExecuted(ResultExecutedContext context)
        {
            FileLogger.CurrentLogger.Log($"Generated View: {context.HttpContext.Request.Path.Value} ");
        }
    }
}
using _09_OOPInheritanceDemo.Logic;
using System;

namespace _09_OOPInheritanceDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {

            //UI
            #region Demo 01
            Player player = new Player();
            ////Person person = new Person();
            player.PlayerName = "Deadshot";
            ////person.first_name = "John";
            player.PlayerId = 001;
            ////person.last_name = "Doe";

            //Console.WriteLine(player);// fully qualified name _06Demo_OOP_Inheritance.logic.Person
            ////Console.WriteLine(person);
            //Console.WriteLine("Player Name: {0} ", player.PlayerName );
            //Console.WriteLine("Player Id: {0}", player.PlayerId);
            ////Console.WriteLine("Name : {0} {1}", person.first_name, person.last_name); 
            #endregion

            #region Demo 02
            Tester tester = new Tester();
            //Employee employee = new Employee();
            tester.TesterId = 10;
            //employee.employee_id = 1001;
            Console.WriteLine("TesterID: {2},Player Name : {0}, Player ID: {1}", player.PlayerName, player.PlayerId, tester.TesterId);
            //Console.WriteLine("ID:");
            //Console.WriteLine("ID: {2}, Name : {0} {1} {2}", person.first_name, person.last_name, employee.employee_id);
            #endregion
        }
        }
    }


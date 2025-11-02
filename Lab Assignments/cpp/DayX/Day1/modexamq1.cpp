#include <iostream>
#include <string>
#include <vector>
using namespace std;

// ----------------- Vehicle Base Class (Abstraction) -----------------
class Vehicle {
protected:
    string model;
    double dailyRate;
public:
    Vehicle(string m, double rate) : model(m), dailyRate(rate) {}
    virtual void displayDetails() = 0;          // pure virtual
    virtual double calculateRentalCost(int days) = 0; // pure virtual
    virtual string getType() = 0;              // pure virtual
    virtual ~Vehicle() {}
};

// ----------------- Car Class -----------------
class Car : public Vehicle {
protected:
    int seatCapacity;
public:
    Car(string m, double rate, int seats) : Vehicle(m, rate), seatCapacity(seats) {}
    void displayDetails() override {
        cout << "Car Model: " << model << ", Seats: " << seatCapacity
             << ", Daily Rate: $" << dailyRate << endl;
    }
    double calculateRentalCost(int days) override {
        return dailyRate * days; // simple calculation
    }
    string getType() override {
        return "Car";
    }
};

// ----------------- Bike Class -----------------
class Bike : public Vehicle {
protected:
    int engineCapacity;
public:
    Bike(string m, double rate, int engine) : Vehicle(m, rate), engineCapacity(engine) {}
    void displayDetails() override {
        cout << "Bike Model: " << model << ", Engine: " << engineCapacity << "cc"
             << ", Daily Rate: $" << dailyRate << endl;
    }
    double calculateRentalCost(int days) override {
        return dailyRate * days * 0.9; // bikes get 10% discount
    }
    string getType() override {
        return "Bike";
    }
};

// ----------------- Diamond Inheritance Example -----------------
class LandVehicle : virtual public Vehicle {
public:
    LandVehicle(string m, double rate) : Vehicle(m, rate) {}
};

class WaterVehicle : virtual public Vehicle {
public:
    WaterVehicle(string m, double rate) : Vehicle(m, rate) {}
};

class AmphibiousVehicle : public LandVehicle, public WaterVehicle {
public:
    AmphibiousVehicle(string m, double rate) : Vehicle(m, rate), LandVehicle(m, rate), WaterVehicle(m, rate) {}
    void displayDetails() override {
        cout << "Amphibious Vehicle Model: " << model << ", Daily Rate: $" << dailyRate << endl;
    }
    double calculateRentalCost(int days) override {
        return dailyRate * days * 1.2; // amphibious premium
    }
    string getType() override { return "Amphibious Vehicle"; }
};

// ----------------- Customer Class -----------------
class Customer {
public:
    string name;
    int age;
    string contact;
    Customer(string n, int a, string c) : name(n), age(a), contact(c) {}
};

// ----------------- Rental Transaction -----------------
class RentalTransaction {
public:
    Customer customer;
    Vehicle* vehicle;
    int days;
    RentalTransaction(Customer c, Vehicle* v, int d) : customer(c), vehicle(v), days(d) {}
    void displayReceipt() {
        cout << "----- Rental Receipt -----\n";
        cout << "Customer: " << customer.name << ", Age: " << customer.age 
             << ", Contact: " << customer.contact << endl;
        cout << "Vehicle Type: " << vehicle->getType() << endl;
        vehicle->displayDetails();
        cout << "Rental Days: " << days << endl;
        cout << "Total Cost: $" << vehicle->calculateRentalCost(days) << endl;
        cout << "--------------------------\n";
    }
};

// ----------------- Main Program -----------------
int main() {
    vector<Vehicle*> vehicles;
    vehicles.push_back(new Car("Toyota Corolla", 50, 5));
    vehicles.push_back(new Bike("Yamaha R15", 30, 150));
    vehicles.push_back(new AmphibiousVehicle("AmphiX", 80));

    cout << "Welcome to Vehicle Rental System!\n";
    cout << "Available Vehicles:\n";
    for (int i = 0; i < vehicles.size(); i++) {
        cout << i + 1 << ". " << vehicles[i]->getType() << " - ";
        vehicles[i]->displayDetails();
    }

    int choice, days;
    cout << "Enter vehicle number to rent: ";
    cin >> choice;
    cout << "Enter rental days: ";
    cin >> days;

    string name, contact;
    int age;
    cout << "Enter your name: ";
    cin >> ws;
    getline(cin, name);
    cout << "Enter your age: ";
    cin >> age;
    cout << "Enter your contact number: ";
    cin >> ws;
    getline(cin, contact);

    Customer cust(name, age, contact);
    RentalTransaction txn(cust, vehicles[choice - 1], days);
    txn.displayReceipt();

    // Clean up
    for (auto v : vehicles) delete v;

    return 0;
}

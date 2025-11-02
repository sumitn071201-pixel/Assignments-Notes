#include <iostream>
#include <vector>
#include <string>

using namespace std;

// Abstract Base Class: Abstraction
class HospitalPerson {
protected:
    string name;
public:
    HospitalPerson(const string& name_) : name(name_) { }
    virtual ~HospitalPerson() { }
    virtual void displayDetails() const = 0;    // Pure virtual
    virtual string getRole() const = 0;         // Pure virtual
};

// Patient Class: Inheritance, Encapsulation
class Patient : public HospitalPerson {
private:
    int patientID;
    int age;
    string illness;
    string assignedDoctor;
public:
    Patient(int id, const string& name_, int age_, const string& illness_)
        : HospitalPerson(name_), patientID(id), age(age_), illness(illness_) { }
    void assignDoctor(const string& docName) { assignedDoctor = docName; }

    void displayDetails() const override {
        cout << "Role: " << getRole() << endl;
        cout << "Patient ID: " << patientID << endl;
        cout << "Name: " << name << endl;
        cout << "Age: " << age << endl;
        cout << "Illness: " << illness << endl;
        cout << "Assigned Doctor: " << assignedDoctor << endl;
        cout << "--------------------------" << endl;
    }
    string getRole() const override {
        return "Patient";
    }
    int getPatientID() const { return patientID; }
    string getIllness() const { return illness; }
};

// Doctor Class: Inheritance, Encapsulation
class Doctor : public HospitalPerson {
private:
    int doctorID;
    string specialization;
    vector<int> patientIDs;    // To store assigned patient IDs
public:
    Doctor(int id, const string& name_, const string& spec_)
        : HospitalPerson(name_), doctorID(id), specialization(spec_) { }
    void assignPatient(int patientID) { patientIDs.push_back(patientID); }
    void displayDetails() const override {
        cout << "Role: " << getRole() << endl;
        cout << "Doctor ID: " << doctorID << endl;
        cout << "Name: " << name << endl;
        cout << "Specialization: " << specialization << endl;
        cout << "Assigned Patients: ";
        for (int id : patientIDs)
            cout << id << " ";
        cout << "\n--------------------------" << endl;
    }
    string getRole() const override {
        return "Doctor";
    }
    string getSpecialization() const { return specialization; }
};

int main() {
    // Create Doctors
    Doctor* doc1 = new Doctor(101, "Dr. Smith", "Cardiology");
    Doctor* doc2 = new Doctor(102, "Dr. Adams", "Neurology");

    // Create Patients
    Patient* pat1 = new Patient(1, "Alice", 30, "Heart Disease");
    Patient* pat2 = new Patient(2, "Bob", 55, "Stroke");
    Patient* pat3 = new Patient(3, "Charlie", 45, "Arrhythmia");
    Patient* pat4 = new Patient(4, "Dana", 60, "Migraine");

    // Assign patients to doctors based on specialization
    if (pat1->getIllness() == "Heart Disease" || pat3->getIllness() == "Arrhythmia") {
        pat1->assignDoctor(doc1->getRole() + " - " + doc1->getSpecialization());
        pat3->assignDoctor(doc1->getRole() + " - " + doc1->getSpecialization());
        doc1->assignPatient(pat1->getPatientID());
        doc1->assignPatient(pat3->getPatientID());
    }
    if (pat2->getIllness() == "Stroke" || pat4->getIllness() == "Migraine") {
        pat2->assignDoctor(doc2->getRole() + " - " + doc2->getSpecialization());
        pat4->assignDoctor(doc2->getRole() + " - " + doc2->getSpecialization());
        doc2->assignPatient(pat2->getPatientID());
        doc2->assignPatient(pat4->getPatientID());
    }

    // Store all persons as base class pointers: Polymorphism demonstration
    vector<HospitalPerson*> persons;
    persons.push_back(doc1);
    persons.push_back(doc2);
    persons.push_back(pat1);
    persons.push_back(pat2);
    persons.push_back(pat3);
    persons.push_back(pat4);

    // Display details of all persons
    for (HospitalPerson* person : persons) {
        person->displayDetails(); // Polymorphic call
    }

    // Clean up (destructor demo)
    for (HospitalPerson* person : persons)
        delete person;

    return 0;
}

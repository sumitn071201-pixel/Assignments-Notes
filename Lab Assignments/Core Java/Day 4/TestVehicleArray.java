import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestVehicleArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        do {
            System.out.println("\n--- Vehicle Management System ---");
            System.out.println("1. Add new vehicle");
            System.out.println("2. Display all vehicles");
            System.out.println("3. Search by Vehicle ID");
            System.out.println("4. Search by Owner Name");
            System.out.println("5. Update Vehicle Details (Type & Date)");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();
            
            sc.nextLine(); 

            switch (choice) {
                case 1: 
                    boolean status = VehicleService.addNewVehicle();
                    if (status) {
                        System.out.println("Vehicle added successfully!");
                    } else {
                        System.out.println("Error: Vehicle not added. Array capacity reached.");
                    }
                    break;
                    
                case 2: 
                    System.out.println("--- All Vehicles ---");
                    VehicleService.displayAll();
                    break;
                    
                case 3: 
                    System.out.print("Enter Vehicle ID to search: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    
                    Vehicle v = VehicleService.findById(id);
                    if (v != null) {
                        System.out.println("Found Vehicle: " + v);
                    } else {
                        System.out.println("Vehicle with ID " + id + " not found.");
                    }
                    break;
                    
                case 4: 
                    System.out.print("Enter Owner Name to search: ");
                    String nm = sc.nextLine();
                    
                    Vehicle[] vArr = VehicleService.findByOwnerName(nm);
                    if (vArr != null) {
                        System.out.println("Found Vehicles for Owner '" + nm + "':");
                        for (Vehicle vehicle : vArr) {
                            System.out.println(vehicle);
                        }
                    } else {
                        System.out.println("No vehicles found for owner '" + nm + "'.");
                    }
                    break;
                    
                case 5: 
                    System.out.print("Enter Vehicle ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter NEW Vehicle Type: ");
                    String newType = sc.nextLine();
                    
                    System.out.print("Enter NEW Purchase Date (dd/mm/yyyy): ");
                    String dtString = sc.nextLine();
                    
                    Date newDate = null;
                    boolean dateParseError = false;
                    try {
                        newDate = sdf.parse(dtString);
                    } catch (ParseException e) {
                        System.err.println("Error parsing date: Invalid format. Update failed.");
                        dateParseError = true;
                    }
                    
                    if (!dateParseError) {
                        boolean status1 = VehicleService.updateDetails(updateId, newType, newDate);
                        if (status1) {
                            System.out.println("Details updated successfully.");
                        } else {
                            System.out.println("Failed to update details. Vehicle ID not found.");
                        }
                    }
                    break;
                    
                case 6: 
                    System.out.println("Thank you for visiting! System shutting down...");
                    break;
                    
                default:
                    System.out.println("Wrong choice. Please select an option between 1 and 6.");
            }
            
        } while (choice != 6);

        sc.close();
    }
}
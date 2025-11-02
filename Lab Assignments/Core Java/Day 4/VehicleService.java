import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class VehicleService {
	static Vehicle[] vehicleArr;
	static int cnt;
	static {
		   vehicleArr=new Vehicle[100];
		   vehicleArr[0]=new Vehicle(12,"Rajan","2 wheeler",new Date(2000-11-11));
		   vehicleArr[1]=new Vehicle(13,"Atharva","3 wheeler",new Date(1997-11-11));
		   vehicleArr[2]=new Vehicle(12,"Ashu","4 wheeler",new Date(1997-11-11));
		   cnt=3;
	}

	    public static boolean addNewVehicle() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the Vehicle ID (VID)");
	        int vid = sc.nextInt();
	        sc.nextLine(); 
	        
	        System.out.println("Enter the Owner Name");
	        String oname = sc.nextLine();
	        
	        System.out.println("Enter the Vehicle Type");
	        String vtype = sc.nextLine();
	        
	        System.out.println("Enter Purchase Date (dd/mm/yyyy)");
	        String dt = sc.next();
	        
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        Date dPurchase = null;
	        try {
	            dPurchase = sdf.parse(dt);
	        } catch (ParseException e) {
	            System.err.println("Error parsing date: " + e.getMessage());
	        }
	        
	        Vehicle v = new Vehicle(vid, oname, vtype, dPurchase); 
	        
	        if (cnt == vehicleArr.length) {
	            return false;
	        } else {
	            vehicleArr[cnt] = v;
	            cnt++;
	            return true;
	        }
	    }
	    
	    public static void displayAll() {
	        for (int i = 0; i < cnt; i++) {
	            System.out.println(vehicleArr[i]);
	        }
	    }

	    public static Vehicle findById(int id) {
	        for (int i = 0; i < cnt; i++) {
	            if (vehicleArr[i] != null && vehicleArr[i].getVid() == id) {
	                return vehicleArr[i];
	            }
	        }
	        return null;
	    }

	    public static Vehicle[] findByOwnerName(String name) {
	        int matchCount = 0;
	        for (int i = 0; i < cnt; i++) {
	            if (vehicleArr[i] != null && vehicleArr[i].getOname().equalsIgnoreCase(name)) {
	                matchCount++;
	            }
	        }

	        if (matchCount == 0) {
	            return null;
	        }

	        Vehicle[] vTemp = new Vehicle[matchCount];
	        int i = 0;
	        
	        for (Vehicle v : vehicleArr) {
	            if (v == null) break; 
	            
	            if (v.getOname().equalsIgnoreCase(name)) {
	                vTemp[i] = v;
	                i++;
	            }
	        }
	        
	        return vTemp;
	    }

	    public static boolean updateDetails(int id, String newType, Date newDate) {
	        Vehicle v = findById(id);
	        if (v != null) {
	            v.setVtype(newType);
	            v.setDpurchase(newDate);
	            return true;
	        }
	        return false;
	    }
	}



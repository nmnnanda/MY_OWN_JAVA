package O_LamdaExpression;

	import java.util.ArrayList;
	import java.util.List;

	// Define the User class (parent class for all user types)
	class User {
	    private String name;
	    private String password;
	    private String contactNo;
	    private String email;

	    // Constructor
	    public User(String name, String password, String contactNo, String email) {
	        this.name = name;
	        this.password = password;
	        this.contactNo = contactNo;
	        this.email = email;
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getContactNo() {
	        return contactNo;
	    }

	    public void setContactNo(String contactNo) {
	        this.contactNo = contactNo;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	}


	// Define the Admin class (extends User class)
	class Admin extends User {
	    // Constructor
	    public Admin(String name, String password, String contactNo, String email) {
	        super(name, password, contactNo, email);
	    }

	    // Admin-specific methods
	}

	// Define the Doctor class (extends User class)
	class Doctor extends User {
	    private List<Appointment> appointments;

	    // Constructor
	    public Doctor(String name, String password, String contactNo, String email) {
	        super(name, password, contactNo, email);
	        appointments = new ArrayList<>();
	    }

	    // Doctor-specific methods
	    public void approveAppointment(Appointment appointment) {
	        appointments.add(appointment);
	        // Notify patient about the approved appointment
	    }

	    public void cancelAppointment(Appointment appointment) {
	        appointments.remove(appointment);
	        // Notify patient about the canceled appointment
	    }
	}

	// Define the Patient class (extends User class)
	class Patient extends User {
	    private List<Appointment> appointments;
	    private List<MedicalReport> medicalReports;

	    // Constructor
	    public Patient(String name, String password, String contactNo, String email) {
	        super(name, password, contactNo, email);
	        appointments = new ArrayList<>();
	        medicalReports = new ArrayList<>();
	    }

	    // Patient-specific methods
	    public void viewAppointments() {
	        // Display the list of appointments
	    }

	    public void viewMedicalReports() {
	        // Display the list of medical reports
	    }

	    // Other methods related to patient functionality
	}

	// Define the Nurse class (extends User class)
	class Nurse extends User {
	    // Constructor
	    public Nurse(String name, String password, String contactNo, String email) {
	        super(name, password, contactNo, email);
	    }

	    // Nurse-specific methods
	}

	// Define the Receptionist class (extends User class)
	class Receptionist extends User {
	    // Constructor
	    public Receptionist(String name, String password, String contactNo, String email) {
	        super(name, password, contactNo, email);
	    }

	    // Receptionist-specific methods
	}

	// Define the Pharmacist class (extends User class)
	class Pharmacist extends User {
	    // Constructor
	    public Pharmacist(String name, String password, String contactNo, String email) {
	        super(name, password, contactNo, email);
	    }

	    // Pharmacist-specific methods
	}

	// Define the Accountant class (extends User class)
	class Accountant extends User {
	    // Constructor
	    public Accountant(String name, String password, String contactNo, String email) {
	        super(name, password, contactNo, email);
	    }

	    // Accountant-specific methods
	}

	// Define the Laboratories class (extends User class)
	class Laboratories extends User {
	    // Constructor
	    public Laboratories(String name, String password, String contactNo, String email) {
	        super(name, password, contactNo, email);
	    }

	    // Laboratories-specific methods
	}

	// Define the Appointment class
	class Appointment {
	    private String appointmentId;
	    private String doctorId;
	    private String patientId;
	    private String appointmentDate;

	    // Constructor
	    public Appointment(String appointmentId, String doctorId, String patientId, String appointmentDate) {
	        this.appointmentId = appointmentId;
	        this.doctorId = doctorId;
	        this.patientId = patientId;
	        this.appointmentDate = appointmentDate;
	    }

	    // Getters and setters

	    // Other methods related to appointment management
	}

	// Define the MedicalReport class
	class MedicalReport {
	    private String reportId;
	    private String patientId;
	    private String reportDetails;
	    private String reportDate;

	    // Constructor
	    public MedicalReport(String reportId, String patientId, String reportDetails, String reportDate) {
	        this.reportId = reportId;
	        this.patientId = patientId;
	        this.reportDetails = reportDetails;
	        this.reportDate = reportDate;
	    }

	    // Getters and setters

	    // Other methods related to medical report management
	    
	}

	// Define the Hospital class (main class)
	class Hospital {
	    private List<User> users;

	    // Constructor
	    public Hospital() {
	        users = new ArrayList<>();
	    }

	    // Methods for user registration, login, etc.

	    public void registerUser(User user) {
	        users.add(user);
	        // Add user to the database or any other storage mechanism
	    }

	    public User loginUser(String email, String password) {
	        for (User user : users) {
	            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
	                return user;
	            }
	        }
	        return null;
	    }

	    // Other methods related to hospital management

	    // Implement the main method to run the application
	    public static void main(String[] args) {
	        // Instantiate the Hospital class and start the application
	        Hospital hospital = new Hospital();

	        // Register users
	        Admin admin = new Admin("John Doe", "admin123", "1234567890", "admin@example.com");
	        hospital.registerUser(admin);

	        Doctor doctor = new Doctor("Dr. Jane Smith", "doctor123", "9876543210", "doctor@example.com");
	        hospital.registerUser(doctor);

	        Patient patient = new Patient("Alice Johnson", "patient123", "5555555555", "alice@example.com");
	        hospital.registerUser(patient);

	        // Login
	        User loggedInUser = hospital.loginUser("admin@example.com", "admin123");
	        if (loggedInUser instanceof Admin) {
	            Admin loggedInAdmin = (Admin) loggedInUser;
	            // Perform admin-specific actions
	        }

	        loggedInUser = hospital.loginUser("doctor@example.com", "doctor123");
	        if (loggedInUser instanceof Doctor) {
	            Doctor loggedInDoctor = (Doctor) loggedInUser;
	            // Perform doctor-specific actions
	        }

	        loggedInUser = hospital.loginUser("alice@example.com", "patient123");
	        if (loggedInUser instanceof Patient) {
	            Patient loggedInPatient = (Patient) loggedInUser;
	            // Perform patient-specific actions
	        }
	    }
	}

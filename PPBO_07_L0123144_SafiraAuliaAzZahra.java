
//Safira Aulia Az Zahra
//L0123144

package pbo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PPBO_07_L0123144_SafiraAuliaAzZahra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ArrayList untuk menyimpan daftar pasien
        ArrayList<String> patients = new ArrayList<>();
        System.out.println("Masukkan jumlah pasien: ");
        int patientCount = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        for (int i = 0; i < patientCount; i++) {
            System.out.println("Masukkan nama pasien ke-" + (i + 1) + ":");
            patients.add(scanner.nextLine());
        }

        //HashMap untuk menyimpan dokter dan layanan kesehatan yang dipilih pasien
        HashMap<String, String> patientChoices = new HashMap<>();

        //Daftar dokter
        ArrayList<String> doctors = new ArrayList<>();
        doctors.add("Dr. Adams");
        doctors.add("Dr. Baker");
        doctors.add("Dr. Carter");

        //Daftar layanan kesehatan
        ArrayList<String> services = new ArrayList<>();
        services.add("General Checkup");
        services.add("Pediatrics");
        services.add("Cardiology");

        //Code untuk memilih dokter dan layanan untuk setiap pasien
        for (String patient : patients) {
            System.out.println("\nPasien: " + patient);

            System.out.println("Pilih dokter (masukkan nomor):");
            for (int i = 0; i < doctors.size(); i++) {
                System.out.println((i + 1) + ". " + doctors.get(i));
            }
            int doctorChoice = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Pilih layanan kesehatan (masukkan nomor):");
            for (int i = 0; i < services.size(); i++) {
                System.out.println((i + 1) + ". " + services.get(i));
            }
            int serviceChoice = scanner.nextInt();
            scanner.nextLine();

            String chosenDoctor = doctors.get(doctorChoice - 1);
            String chosenService = services.get(serviceChoice - 1);

            patientChoices.put(patient, "Dokter: " + chosenDoctor + ", Layanan: " + chosenService);
        }

        // Print hasil pilihan pasien
        System.out.println("\nHasil Pilihan Pasien:");
        for (String patient : patients) {
            System.out.println(patient + " -> " + patientChoices.get(patient));
        }

        scanner.close();
    }
}
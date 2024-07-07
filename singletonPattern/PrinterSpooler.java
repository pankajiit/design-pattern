package DesignPatterns.singletonPattern;

import java.util.ArrayList;
import java.util.List;

public class PrinterSpooler {

    // Inner class Printer
    public static class Printer {

        private static Printer printer;
        private List<String> jobs;

        // Private constructor to prevent instantiation
        private Printer() {
            jobs = new ArrayList<>();
        }

        // Thread-safe method to get the single instance of the class
        public static synchronized Printer getInstance() {
            if (printer == null) {
                printer = new Printer();
            }
            return printer;
        }

        // Method to add a print job to the queue
        public void addJob(String jobId) {
            this.jobs.add(jobId);
            System.out.println("Added print job: " + jobId);
        }

        // Method to view all added print jobs
        public void viewJobs() {
            System.out.println("Added Jobs are:");
            for (String jobId : jobs) {
                System.out.println(jobId);
            }
        }
    }

    public static void main(String[] args) {
        Printer printer = Printer.getInstance();

        printer.addJob("job1");
        printer.addJob("job2");
        printer.viewJobs();
    }
}

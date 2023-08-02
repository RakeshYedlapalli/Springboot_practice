package newpackage;

public class DeadlockExample {
    public static void main(String[] args) {
        // Create two resource objects
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        // Create two threads that will acquire resources in different order
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 acquired resource 1");

                try {
                    Thread.sleep(100); // Introduce a delay to increase the chance of deadlock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1 acquired resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 acquired resource 2");

                synchronized (resource1) {
                    System.out.println("Thread 2 acquired resource 1");
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }

    // Resource class
    static class Resource {
        private String name;

        public Resource(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

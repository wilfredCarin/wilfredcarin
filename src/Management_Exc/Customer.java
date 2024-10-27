package Management_Exc;

public class Customer extends Person {

    public Customer(String name, int age) {
        super(name, age);
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is browsing through");
    }

    /**
     * TODO implementation
     *
     * @param e employee to be spoken to
     * @return the dialogue of the customer
     */
    public String speak(Employee e) {

        if (e instanceof Developer) {
            Developer dev = (Developer) e;
            if (dev.getProjectManager() != null) {
                return "Can I see your manager " + dev.getProjectManager().getName() + "?";
            } else {
                return "Oh, hello, " + e.getName() + ". Can you assist me?";
            }
        } else {
            return "Oh, hello, " + e.getName() + ". Can you assist me?";
        }
    }
}
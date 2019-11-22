package lab5.Objects;

public class Worker extends Person {
    String workerPosition;

    public Worker() {

    }

    public Worker(String name, String email, int phone, String workerPosition) {
        super(name, email, phone);
        this.workerPosition = workerPosition;

    }

    public String getWorkerPosition() {
        return workerPosition;
    }

    public void setWorkerPosition(String workerPosition) {
        this.workerPosition = workerPosition;
    }

    @Override
    public String toString() {
        return "{" +
                "position='" + workerPosition + ", " +
                super.toString() +
                '}';
    }
}

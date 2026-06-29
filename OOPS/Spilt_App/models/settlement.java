public class Settlement {

    private User fromUser;
    private User toUser;
    private double amount;

    public Settlement(
            User fromUser,
            User toUser,
            double amount) {

        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
    }

    public User getFromUser() {
        return fromUser;
    }

    public User getToUser() {
        return toUser;
    }

    public double getAmount() {
        return amount;
    }
}
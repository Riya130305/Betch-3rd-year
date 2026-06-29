public class Main {
    public static void main(String[] args) {
         User user1= new User("Riya",1);
        User user2= new User("Tiya",2);
        User user3= new User("Arya",3);
        User user4= new User("Durga",4);

        List<Expense> expense= new ArrayList<>();
        // object ban raha hia ye but esse 
        // Expense e1 = new Expense(a, 400);
        // expenses.add(e1);
        expense.add(new expense(400, "Riya"));
        expense.add(new expense(250,"Tiya") );
        expense.add(new expense(70, "Arya"));
        expense.add(new expense(30,"Durga") );

        Split calculation = new SplitCalculator();
        double total = calculation.getAmt(expense);
        System.out.println(total);
    }
}

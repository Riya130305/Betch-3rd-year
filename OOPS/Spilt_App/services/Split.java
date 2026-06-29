public interface SplitCalculator{
    double calculateTotal(List<Expense> expense);
    double calculateShare(List<Expense> expense);
}

public class  EqualSpilt implements SplitCalculator{
    @Override
    public double calculateTotal(List<Expense> expense){
        double total=0;
           for(Expense e : expenses) {
            total += e.getAmount();
        }

        return total;
    }
}

public class shareSpilt implements SplitCalculator{
    @Override
    public double calculateShare(List<Expense> expense){
        double total=  calculateTotal(expense);
        return total/ expense.size();
    }
}

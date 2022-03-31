public class Main {
  public static void main(String[] args) {
    Dompet<Double> t = new Dompet<Double>();
    Transaction<Number> tr = new Transaction<Number>('+', 100);
    t.addMoney(10.234);
    t.addMoney(10.2312512);
    t.addMoney(1015.234);
    t.takeMoney(1000.0);
    t.printTransactions();
    System.out.println(t.getMinimumTransaction());
    System.out.println(t.getBalance());
    System.out.println(t.getMinimumTransaction());
  }
}

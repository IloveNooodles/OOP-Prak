import java.util.*;

public class Dompet<T extends Number> {
  private ArrayList<Transaction> transactions;

  public Dompet() {
    // Constructor tanpa parameter, transactions diinisialisasi dengan array list
    // baru
    this.transactions = new ArrayList<Transaction>();
  }

  public Dompet(T initialBalance) {
    // Constructor dengan parameter T initialBalance, inisialisasi transactions
    // dengan array list baru dan tambahkan transaksi tambah dengan value initial
    // balance
    /* contoh transaksi tambah: new Transaction<T>('+', initialBalance) */
    this.transactions = new ArrayList<Transaction>();
    this.transactions.add(new Transaction<T>('+', initialBalance));
  }

  public void addMoney(T money) {
    // Buat prosedur addMoney dengan parameter T money, tambahkan transaksi tambah
    // dengan senilai money
    this.transactions.add(new Transaction<T>('+', money));
  }

  public boolean takeMoney(T money) {
    // Tambahkan transaksi kurang sebesar money (perlu ada pengecekan apakah balance
    // cukup atau tidak)
    // false bila transaksi gagal, true bila berhasil
    Double sum = this.getBalance();
    if (sum >= money.doubleValue()) {
      this.transactions.add(new Transaction<T>('-', money));
      return true;
    }
    return false;
    // Number amount = 0;
    // for (int i = 0; i < this.transactions.size(); i++) {
    // amount = this.transactions.get(i).getAmount();
    // }

  }

  public void setBalance(T balance) {
    // Mengganti transaksi agar bernilai sama dengan balance
    // Tips: inisialisasi ulang transactions, lalu tambahkan transaksi tambah
    // sebanyak balance
    this.transactions = new ArrayList<Transaction>();
    this.transactions.add(new Transaction<T>('+', balance));
  }

  // Akses nilai Double dilakukan dengan .doubleValue()
  // Contoh: amount.doubleValue()

  public Double getBalance() {
    Double sum = new Double(0);
    for (Transaction t : this.transactions) {
      if (t.getType() == '+')
        sum += t.getAmount().doubleValue();
      else if (t.getType() == '-')
        sum -= t.getAmount().doubleValue();
    }
    return sum;
    // Mencari balance dompet dari transaksi dengan cara menghitung total transaksi
  }

  public void printTransactions() {
    int i = 1;
    for (Transaction t : this.transactions) {
      System.out.println("Transactions " + i + ": " + t.getType() + " " + t.getAmount());
      i += 1;
    }
    // Print seluruh transaksi yang ada pada array
    // Format: Transactions [indeks + 1]: [tipe transaksi] [amount]
    // Contoh: Transactions 3: + 500
  }

  public Double getAverageTransaction() {
    int size = this.transactions.size();
    if (size == 0)
      return null;
    return this.getBalance() / size;
    // Mencari rata-rata transaksi (jika tidak ada transaksi, berikan hasil null)
  }

  public Double getMinimumTransaction() {
    if (this.transactions.size() == 0)
      return null;
    Double min = this.transactions.get(0).getAmount().doubleValue();
    for (Transaction t : this.transactions) {
      min = min > t.getAmount().doubleValue() ? t.getAmount().doubleValue() : min;
    }
    return min;
    // Mencari nilai minimum transaksi (jika tidak ada transaksi, berikan hasil
    // null; hanya perlu membandingkan nilainya saja tanpa peduli type)
  }

  public Double getMaximumTransaction() {
    if (this.transactions.size() == 0)
      return null;
    Double max = this.transactions.get(0).getAmount().doubleValue();
    for (Transaction t : this.transactions) {
      max = max < t.getAmount().doubleValue() ? t.getAmount().doubleValue() : max;
    }
    return max;
    // Mencari nilai maksimum transaksi (jika tidak ada transaksi, berikan hasil
    // null; hanya perlu membandingkan nilainya saja tanpa peduli type)
  }
}
public class Time {
  private int hour;
  private int minute;
  private int second;

  public Time() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0;
  }

  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Time(Time t) {
    this.hour = t.hour;
    this.minute = t.minute;
    this.second = t.second;
  }

  public int getHour() {
    return this.hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getMinute() {
    return this.minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public int getSecond() {
    return this.second;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  public int convertToSecond() {
    return this.getHour() * 3600 + this.getMinute() * 60 + this.getSecond();
  }

  public Time add(Time t) {
    int second = (this.convertToSecond() + t.convertToSecond()) % 86400;
    int second_time = second % 60;
    int minute_time = (second / 60) % 60;
    int hour_time = (second / 3600) % 24;
    return new Time(hour_time, minute_time, second_time);
    // Return penjumlahan dua objek jam, yaitu *this* dan t.
    // Apabila hasil penjumlahan melebihi 23:59:59, maka Anda harus mengonversinya
    // seperti tampilan jam digital asli.
    // Contoh : 24:00:00 dituliskan 00:00:00, 25:00:00 dituliskan 01:00:00, dst.
  }

  public Time minus(Time t) {
    if (this.lessThan(t)) {
      return this;
    }
    int second = (this.convertToSecond() - t.convertToSecond()) % 86400;
    int second_time = second % 60;
    int minute_time = (second / 60) % 60;
    int hour_time = (second / 3600) % 24;
    return new Time(hour_time, minute_time, second_time);
    // Return selisih antara dua objek jam, yaitu *this* dan t.
    // Perhitungan selisih hanya dapat dilakukan jika objek ruas kiri lebih akhir
    // dari atau sama dengan objek ruas kanan.
    // Jika objek ruas kiri lebih awal, maka kembalikan nilai objek ruas kiri.
    // Contoh: 00:00:01 - 00:00:02 = 00:00:01
  }

  public boolean lessThan(Time t) {
    return this.convertToSecond() < t.convertToSecond();
    // Returns true jika *this* < t menurut definisi waktu
  }

  public boolean greaterThan(Time t) {
    return this.convertToSecond() > t.convertToSecond();
    // Returns true jika *this* > t menurut definisi waktu
  }

  public void printTime() {
    System.out.printf("%02d:%02d:%02d\n", this.hour, this.minute, this.second);
    // Menuliskan jam dalam format hh:mm:ss diakhiri dengan newline. Perhatikan
    // bahwa setiap parameter harus dituliskan 2 digit.
  }
}
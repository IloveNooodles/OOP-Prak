import java.lang.reflect.*;

public class LaptopTest {
  private String currentclassName;

  public LaptopTest(String className) {
    /**
     * Memeriksa apakah ada kelas dengan nama className.
     * Jika tidak, tuliskan "Tidak ada kelas dengan nama yang diberikan" (tanpa
     * petik) ke layar
     */
    this.currentclassName = className;
    try {
      Class.forName(className);
    } catch (Exception e) {
      System.out.println("Tidak ada kelas dengan nama yang diberikan");
    }
  }

  public boolean testMethods() {
    Boolean test = true;
    try {
      Method[] listMethods = Class.forName(this.currentclassName).getDeclaredMethods();
      if (listMethods.length == 1) {
        if (!listMethods[0].getName().equals("getRamSize")) {
          System.out.println("Nama method harus getRamSize");
          test = false;
        }
        if (!listMethods[0].getReturnType().equals(Integer.class)) {
          System.out.println("Tipe return method harus Integer");
          test = false;
        }
      } else {
        System.out.println("Banyaknya method hanya boleh 1");
        test = false;
      }
    } catch (Exception e) {
      test = false;
    }
    // Return true jika semua tes berhasil
    // Jika ada 1 yang salah, return false
    return test;
  }

  public boolean testFields() {
    Boolean test = true;
    try {
      Field[] listField = Class.forName(this.currentclassName).getDeclaredFields();
      if (listField.length == 1) {
        if (!listField[0].getName().equals("serialNumber")) {
          System.out.println("Nama field harus serialNumber");
          test = false;
        }
        if (!listField[0].getType().equals(String.class)) {
          System.out.println("Tipe field harus String");
          test = false;
        }
      } else {
        System.out.println("Banyaknya field hanya boleh 1");
        test = false;
        // Menuliskan "Banyaknya field hanya boleh 1" (tanpa petik) ke layar
      }
    } catch (Exception e) {
      test = false;
    }

    return test;
    // Return true jika semua tes berhasil
    // Jika ada 1 yang salah, return false
  }
}
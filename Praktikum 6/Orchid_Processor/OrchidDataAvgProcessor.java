import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class OrchidDataAvgProcessor implements Runnable {
  // Tambahkan atribut sesuai kebutuhan
  protected OrchidMeanDatum meanDatum;
  protected String rawDataFilename;

  public OrchidDataAvgProcessor(OrchidMeanDatum meanDatum, String rawDataFilename) {
    this.meanDatum = meanDatum;
    this.rawDataFilename = rawDataFilename;
  }

  @Override
  public void run() {
    try {
      CSVReader reader = new CSVReader(this.rawDataFilename, ",");
      List<String[]> data = reader.read();
      float petalLength = 0, petalWidth = 0, stemLength = 0;
      for (String[] datum : data) {
        petalLength += Float.parseFloat(datum[0]);
        petalWidth += Float.parseFloat(datum[1]);
        stemLength += Float.parseFloat(datum[2]);
      }
      int len = data.size();
      this.meanDatum.setMean(petalLength / len, petalWidth / len, stemLength / len);
    } catch (IOException e) {

    }
    // Menghitung rata-rata dari data yang dibaca dengan CSVReader, lalu update
    // meanDatum dengan rata-rata dari setiap aspek data

    // Apabila muncul IOException, maka hasil pembacaan data adalah kosong
    // dan meanDatum tidak di-update (tidak di throw lagi)
  }
}
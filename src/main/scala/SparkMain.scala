
import org.apache.spark.sql.SparkSession

object MainClass {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("first")
      .master("local")
      .getOrCreate()


    print("aaaaa");

    Thread.sleep(100000)
    spark.stop()
  }

}



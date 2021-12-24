package LAB2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;


public class AirportMapper extends Mapper<LongWritable, Text, AirportWritable, Text> {
    private static final int helper = 1;
    private static final int AIR_ID = 0;
    private static final int ID = 0;

    public static String removeQuote(String s) {
        return  s.replaceAll("\"","");

    }

    protected void map (LongWritable key, Text value, Context context) throws IOException,
            InterruptedException {
                String[] airposrts = value.toString().split("");
                if (key.get() >= 0 ) {
                    String airportName = removeQuote(airposrts[AIR_ID]);
                    context.write(new AirportWritable(Integer.parseInt(airportName), 0), new Text(airposrts[helper]));
                }
    }


}

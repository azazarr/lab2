package LAB2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.io.LongWritable;

import java.io.IOException;


public class AirportMapper extends Mapper<LongWritable, Text, AirportWritable, Text> {
    private static final int helper = 0;
    private static final int AIR_ID = 0;
    protected void map (LongWritable key, Text value, Context context) throws IOException,
            InterruptedException {
                String[] airposrts = value.toString().split("");
                if (key.get() >= 0 ) {
                    String airportName = removeQuote(airposrts[AIR_ID]);
                    context.write(new AirportWritable(Integer, parseInt(airportName), 0), new Text(airposrts[helper]));
                }
    }


}

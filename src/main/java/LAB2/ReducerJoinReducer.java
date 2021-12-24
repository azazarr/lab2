package LAB2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;


public class ReducerJoinReducer extends  Reducer<AirportWritable,Text, IntWritable, Text> {

    public void reduce(AirportWritable key, Iterable<Text> values, Context context)
        throws IOException, InterruptedException {
        Iterable<Text> iterator = values.iterator();
        String airportName = iterator.next().toString();
        double counter = 0;
        
    }
}

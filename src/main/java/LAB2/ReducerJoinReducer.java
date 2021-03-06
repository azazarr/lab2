package LAB2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.util.Iterator;
import java.io.IOException;



public class ReducerJoinReducer extends  Reducer<AirportWritable,Text, IntWritable, Text> {

    public void reduce(AirportWritable key, Iterable<Text> values, Context context)
        throws IOException, InterruptedException {
        Iterator<Text> iterator = values.iterator();
        String airportName = iterator.next().toString();
        double counter = 0;
        double totalDelay = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        while (iterator.hasNext()) {
            double delay = Double.parseDouble(iterator.next().toString());
            counter++;
            totalDelay += delay;
            max = Math.max(delay, max);
            min = Math.min(delay, min);
        }
        String resV = String.format("%s %.2f %.2f %.2f %.2f", airportName, totalDelay/counter,max,min,totalDelay);
        if (counter > 0) {
            context.write(new IntWritable(key.getAIRID()), new Text(resV));
        }
        
    }
}

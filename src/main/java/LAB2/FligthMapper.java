package LAB2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.io.LongWritable;
import java.io.IOException;

public class FligthMapper extends Mapper<LongWritable, Text, AirportWritable, Text> {
    private static final int ID = 0;
    private static final int DEL = 0;
    private static final int FID = 0;

    protected void map (LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        if (key.get() > 0) {
            if (!(delay)
        }
    }

}

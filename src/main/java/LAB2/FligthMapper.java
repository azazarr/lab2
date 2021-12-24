package LAB2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FligthMapper extends Mapper<LongWritable, Text, AirportWritable, Text> {
    private static final int ID = 14;
    private static final int DEL = ;
    private static final int FID = 0;

    protected void map (LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] delays = value.toString().split(",");
        if (key.get() > 0) {
            if (!delays[DEL].isEmpty()) {
                context.write(new AirportWritable(Integer.parseInt(delays[ID]), FID), new Text(delays[DEL]));
            }
        }
    }

}

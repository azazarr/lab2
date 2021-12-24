package LAB2;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;



public class ReducerJoinReducer extends  Reducer<AirportWritable,Text, IntWritable, Text> {

    public void reduce(AirportWritable key, Iterable<Text> values, Context)
}

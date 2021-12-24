package LAB2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.io.LongWritable;

public class AirportPartitioner {
    
    public int getPartition(AirportWritable key, Text value, int nReduceTask){
        return key.getAIRID() % nReduceTask
    }
}

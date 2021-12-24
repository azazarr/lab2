package LAB2;

import org.apache.hadoop.io.WritableComparable;
import java.io.DataInput;
import java.io.DataOutput;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.io.LongWritable;

public class AirportWritable {
    int AIRID, IND;

    public AirportWritable(int x, int z){
        this.AIRID = x;
        this.IND = 
    }

    public int getAIRID() {
        return AIRID;
    }
}

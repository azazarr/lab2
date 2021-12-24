package LAB2;

import org.apache.hadoop.io.WritableComparable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.io.LongWritable;

public class AirportWritable {
    int AIRID, IND;

    public AirportWritable(int x, int z){
        this.AIRID = x;
        this.IND = z;
    }

    public int getAIRID() {
        return AIRID;
    }

    public void readFiels(DataInput dataInput) throws IOException
}

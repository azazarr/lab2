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


    @Override
    public AirportWritable(int x, int z){
        this.AIRID = x;
        this.IND = z;
    }

    @Override
    public int getAIRID() {
        return AIRID;
    }

    @Override
    public void readFiels(DataOutput dataInput) throws IOException {
        dataOutput.writeInt(AIRID);
        dataOutput.writeInt(IND);
        
    }

    @Override
    public void write(DataInput dataInput) throws IOException {
        AIRID = dataInput.readInt();
        IND = dataInput.readInt();
    }

    @Override
    public int CompareTo(Airt)

}

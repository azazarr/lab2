package LAB2;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritable implements WritableComparable<AirportWritable> {
    int AIRID, IND;

    public AirportWritable () {}

    public AirportWritable(int x, int z){
        this.AIRID = x;
        this.IND = z;
    }


    public int getAIRID() {
        return AIRID;
    }


    public void readFields(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(AIRID);
        dataOutput.writeInt(IND);
        
    }

    @Override
    public void write(DataInput dataInput) throws IOException {
        AIRID = dataInput.readInt();
        IND = dataInput.readInt();
    }


    public int CompareTo(AirportWritable o) {
        if (AIRID == o.AIRID)
            return IND - o.IND;
        return AIRID - o.AIRID;
    }

}

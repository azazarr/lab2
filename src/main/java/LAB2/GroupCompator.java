package LAB2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class GroupCompator extends WritableComparator {
    protected GroupCompator () {
       super(AirportWritable.class, true)

    }

    public int compare(WritableComparable w1, WritableComparable w2) {
        return ((AirportWritable)w1).getAIRID() - ((AirportWritable)w2).getAIRID();
    }
}

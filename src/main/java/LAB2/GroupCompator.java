package LAB2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.v2.app.webapp.dao.CounterGroupInfo;

public class GroupCompator extends WritableComparable {
    protected GroupCompator () {
        super(AirportWritable.class, true);

    }

    public int compare(WritableComparable w1, WritableComparable w2) {
        return ((AirportWritable)w1).getAIRID() - ((AirportWritable)w2).getAIRID();
    }
}

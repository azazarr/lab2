package LAB2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.v2.app.webapp.dao.CounterGroupInfo;

public class GroupCompator extends WritableComparable {
    protected GroupCompator () {
        super(AirportWritable.class, true);
        
    }
}

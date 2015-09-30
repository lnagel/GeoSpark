package org.datasyslab.geospark.utils;

import com.vividsolutions.jts.geom.Envelope;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by jinxuanw on 9/29/15.
 */
class RectangleYMaxComparator extends GemotryComparator implements Comparator<Envelope>, Serializable {

	 public int compare(Envelope envelope1, Envelope envelope2) {
	    if(envelope1.getMaxY()>envelope2.getMaxY())
	    {
	    	return 1;
	    }
	    else if (envelope1.getMaxY()<envelope2.getMaxY())
	    {
	    	return -1;
	    }
	    else return 0;
	    }
}

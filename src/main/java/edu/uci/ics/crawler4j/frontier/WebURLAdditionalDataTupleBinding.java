package edu.uci.ics.crawler4j.frontier;

import com.sleepycat.bind.tuple.TupleBinding;
import com.sleepycat.bind.tuple.TupleInput;
import com.sleepycat.bind.tuple.TupleOutput;
import com.sleepycat.je.DatabaseEntry;
import edu.uci.ics.crawler4j.url.WebURL;

public class WebURLAdditionalDataTupleBinding extends TupleBinding<WebURLAdditionalData> {
    @Override
    public WebURLAdditionalData entryToObject(TupleInput tupleInput) {
        WebURLAdditionalData result = new WebURLAdditionalData();
        result.category = tupleInput.readInt();
        return result;
    }

    @Override
    public void objectToEntry(WebURLAdditionalData webURLAdditionalData, TupleOutput tupleOutput) {
        tupleOutput.writeInt(webURLAdditionalData.category);
    }
}

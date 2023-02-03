package com.contact.foysaltech;

import java.util.ArrayList;

public interface DataListener {
    void onPreExecute();

    void onProgress(int progress);

    void onCompletion(ArrayList<RetrieveContactRecord> userRecords);
}

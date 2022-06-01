

package com.mycompany.piskvorky1;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.FirestoreOptions;
import java.io.IOException;
import java.io.InputStream;
import com.google.cloud.firestore.Firestore;


public class Databaza {

    private static Firestore db;

    private static void init() throws IOException {
        
        InputStream serviceAccount = MAIN.class.getResourceAsStream("/key.json");

        
        FirestoreOptions firestoreOptions = FirestoreOptions.getDefaultInstance().toBuilder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();
        db = firestoreOptions.getService();
    }

    public static Firestore instance() throws IOException {
        if (db == null) {
           init();
        }
        return db;
    }
}

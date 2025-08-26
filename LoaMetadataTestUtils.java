package testutils;

import com.lmig.globalspecialty.surety.grsindividualdocmgmtapi.loa.metadata.entity.dynamodb.LoaMetadata;
import com.lmig.globalspecialty.surety.grsindividualdocmgmtapi.loa.metadata.entity.store.LoaStoreMetadata;


public class LoaMetadataTestUtils {

    public static final String LOA_ID = "12345";
    public static final String TRACKING_ID = "12345-6789-54321";

    public static LoaMetadata getBaseLoaMetadata() {

        LoaMetadata loaMetadata = new LoaMetadata();

        loaMetadata.setLoaId(LOA_ID);
        loaMetadata.setUniqueDocId("99999");
        loaMetadata.setCreatedById("2244");
        loaMetadata.setDocumentName("test.txt");
        loaMetadata.setDocumentExtension("txt");
        loaMetadata.setDocumentSizeInBytes(10.0);
        loaMetadata.setCategoryId(1);
        loaMetadata.setSubCategoryId(1);
        loaMetadata.setNotes("Some notes here.");
        loaMetadata.setNppi(true);
        loaMetadata.setReceivedDate("2023-01-01");

        return loaMetadata;
    }

    public static LoaStoreMetadata getBaseLoaStoreMetadata() {

        LoaStoreMetadata loaStoreMetadata = new LoaStoreMetadata();

        loaStoreMetadata.setUniqueDocId("99999");
        loaStoreMetadata.setDocumentName("test.txt");
        loaStoreMetadata.setDocumentSizeInBytes(10.0);
        loaStoreMetadata.setCreatedById("2244");
        loaStoreMetadata.setCategoryId(1);
        loaStoreMetadata.setSubCategoryId(1);
        loaStoreMetadata.setNotes("Some notes here.");
        loaStoreMetadata.setNppi(true);
        loaStoreMetadata.setReceivedDate("2023-01-01");

        return loaStoreMetadata;
    }



}

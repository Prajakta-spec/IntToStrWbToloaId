/*
 * Copyright (C) 2020, Liberty Mutual Group
 *
 * Created on 4/2/20, 11:23 AM
 */

package com.lmig.globalspecialty.surety.grsindividualdocmgmtapi.common;

import com.lmig.globalspecialty.surety.grsindividualdocmgmtapi.common.constants.Constants;
import com.lmig.globalspecialty.surety.grsindividualdocmgmtapi.loa.metadata.entity.store.LoaStoreMetadata;
import com.lmig.globalspecialty.surety.grsindividualdocmgmtapi.loa.metadata.entity.update.LoaPatchMetadata;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class BaseLoaIntegrationTest {

    public HttpEntity<MultiValueMap<String, Object>> prepareMetadataForDocuments(Resource document,
                                                                                 Integer categoryId, Integer subCategoryId,
                                                                                 String loaId, String receivedDate,
                                                                                 String notes, Boolean nppi,
                                                                                 String documentResidency,String paymentDate, String checkEftNum, Boolean reissue) {
        MultiValueMap<String, Object> envoyStoreBody = new LinkedMultiValueMap<>();
        envoyStoreBody.add(Constants.LOA_MULTIPART_FILE_PARAMETER, document);
        envoyStoreBody.add(Constants.CATEGORY_ID_PARAMETER, categoryId);
        envoyStoreBody.add(Constants.SUB_CATEGORY_ID_PARAMETER, subCategoryId);
        envoyStoreBody.add(Constants.LOA_ID_PATH_PARAMETER, loaId);
        envoyStoreBody.add(Constants.RECEIVED_DATE_PARAMETER, receivedDate);
        envoyStoreBody.add(Constants.NOTES_PARAMETER, notes);
        envoyStoreBody.add(Constants.NPPI_PARAMETER, nppi);
        envoyStoreBody.add(Constants.PAYMENT_DATE_PARAMETER, paymentDate);
        envoyStoreBody.add(Constants.CHECK_EFT_NUM_PARAMETER, checkEftNum);
        envoyStoreBody.add(Constants.REISSUE_PARAMETER, reissue);

        if (documentResidency != null) {
            envoyStoreBody.add(Constants.DOCUMENT_RESIDENCY_PARAMETER, documentResidency);
        }

        MultiValueMap<String, String> envoyStoreHeader = new LinkedMultiValueMap<>();
        envoyStoreHeader.add("Content-Type", MediaType.MULTIPART_FORM_DATA_VALUE);

        return new HttpEntity<>(envoyStoreBody, envoyStoreHeader);
    }

    public HttpEntity<LoaPatchMetadata> prepareLoaPatchMetadata(Integer categoryId, Integer subCategoryId, String loaId,
                                                                String receivedDate, String documentName, String notes,
                                                                Boolean nppi,String paymentDate, String checkEftNum, Boolean reissue) {
        LoaPatchMetadata loaPatchMetadata = new LoaPatchMetadata();
        loaPatchMetadata.setCategoryId(categoryId);
        loaPatchMetadata.setSubCategoryId(subCategoryId);
        loaPatchMetadata.setIndividualId(loaId);
        loaPatchMetadata.setReceivedDate(receivedDate);
        loaPatchMetadata.setDocumentName(documentName);
        loaPatchMetadata.setNotes(notes);
        loaPatchMetadata.setNppi(nppi);
        loaPatchMetadata.setPaymentDate(paymentDate);
        loaPatchMetadata.setCheckEftNum(checkEftNum);
        loaPatchMetadata.setReissue(reissue);

        return new HttpEntity<>(loaPatchMetadata);
    }

    public HttpEntity<LoaStoreMetadata> prepareLoaStoreMetadata(String uniqueDocId, Integer categoryId, Integer subCategoryId, String loaId,
                                                                String receivedDate, String documentName, Double documentSizeInBytes, String notes,
                                                                Boolean nppi, String paymentDate, String checkEftNum, Boolean reissue) {
        LoaStoreMetadata loaStoreMetadata = new LoaStoreMetadata();
        loaStoreMetadata.setUniqueDocId(uniqueDocId);
        if (null != categoryId) {
            loaStoreMetadata.setCategoryId(categoryId);
        }
        if (null != subCategoryId) {
            loaStoreMetadata.setSubCategoryId(subCategoryId);
        }
        loaStoreMetadata.setCreatedById(loaId);
        loaStoreMetadata.setReceivedDate(receivedDate);
        loaStoreMetadata.setDocumentName(documentName);
        loaStoreMetadata.setDocumentSizeInBytes(documentSizeInBytes);
        loaStoreMetadata.setNotes(notes);
        loaStoreMetadata.setNppi(nppi);
        loaStoreMetadata.setPaymentDate(paymentDate);
        loaStoreMetadata.setCheckEftNum(checkEftNum);
        loaStoreMetadata.setReissue(reissue);

        return new HttpEntity<>(loaStoreMetadata);
    }

    public HttpEntity<MultiValueMap<String, Object>> prepareMetadataForDocumentsWithWbUserIdAsString(Resource document,
                                                                                                     Integer categoryId, Integer subCategoryId,
                                                                                                     String loaId, String receivedDate,
                                                                                                     String notes, Boolean nppi,
                                                                                                     String documentResidency,String paymentDate, String checkEftNum, Boolean reissue) {
        MultiValueMap<String, Object> envoyStoreBody = new LinkedMultiValueMap<>();
        envoyStoreBody.add(Constants.LOA_MULTIPART_FILE_PARAMETER, document);
        envoyStoreBody.add(Constants.CATEGORY_ID_PARAMETER, categoryId);
        envoyStoreBody.add(Constants.SUB_CATEGORY_ID_PARAMETER, subCategoryId);
        envoyStoreBody.add(Constants.LOA_ID_PATH_PARAMETER, loaId);
        envoyStoreBody.add(Constants.RECEIVED_DATE_PARAMETER, receivedDate);
        envoyStoreBody.add(Constants.NOTES_PARAMETER, notes);
        envoyStoreBody.add(Constants.NPPI_PARAMETER, nppi);
        envoyStoreBody.add(Constants.PAYMENT_DATE_PARAMETER, paymentDate);
        envoyStoreBody.add(Constants.CHECK_EFT_NUM_PARAMETER, checkEftNum);
        envoyStoreBody.add(Constants.REISSUE_PARAMETER, reissue);

        if (documentResidency != null) {
            envoyStoreBody.add(Constants.DOCUMENT_RESIDENCY_PARAMETER, documentResidency);
        }

        MultiValueMap<String, String> envoyStoreHeader = new LinkedMultiValueMap<>();
        envoyStoreHeader.add("Content-Type", MediaType.MULTIPART_FORM_DATA_VALUE);

        return new HttpEntity<>(envoyStoreBody, envoyStoreHeader);
    }

    public HttpEntity<MultiValueMap<String, Object>> prepareMetadataForDocumentsWithNoWbUserId(Resource document,
                                                                                               Integer categoryId, Integer subCategoryId, String receivedDate,
                                                                                               String notes, Boolean nppi,
                                                                                               String documentResidency,String paymentDate, String checkEftNum, Boolean reissue) {
        MultiValueMap<String, Object> envoyStoreBody = new LinkedMultiValueMap<>();
        envoyStoreBody.add(Constants.LOA_MULTIPART_FILE_PARAMETER, document);
        envoyStoreBody.add(Constants.CATEGORY_ID_PARAMETER, categoryId);
        envoyStoreBody.add(Constants.SUB_CATEGORY_ID_PARAMETER, subCategoryId);
        envoyStoreBody.add(Constants.RECEIVED_DATE_PARAMETER, receivedDate);
        envoyStoreBody.add(Constants.NOTES_PARAMETER, notes);
        envoyStoreBody.add(Constants.NPPI_PARAMETER, nppi);
        envoyStoreBody.add(Constants.PAYMENT_DATE_PARAMETER, paymentDate);
        envoyStoreBody.add(Constants.CHECK_EFT_NUM_PARAMETER, checkEftNum);
        envoyStoreBody.add(Constants.REISSUE_PARAMETER, reissue);

        if (documentResidency != null) {
            envoyStoreBody.add(Constants.DOCUMENT_RESIDENCY_PARAMETER, documentResidency);
        }

        MultiValueMap<String, String> envoyStoreHeader = new LinkedMultiValueMap<>();
        envoyStoreHeader.add("Content-Type", MediaType.MULTIPART_FORM_DATA_VALUE);

        return new HttpEntity<>(envoyStoreBody, envoyStoreHeader);
    }

}

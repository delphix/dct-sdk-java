/*
 * Delphix DCT API
 * Delphix DCT API
 *
 * The version of the OpenAPI document: 3.3.0
 * Contact: support@delphix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.delphix.dct.api;

import com.delphix.dct.ApiException;
import com.delphix.dct.models.DeleteTag;
import com.delphix.dct.models.DeleteVDBParameters;
import com.delphix.dct.models.DeleteVDBResponse;
import com.delphix.dct.models.DisableVDBParameters;
import com.delphix.dct.models.DisableVDBResponse;
import com.delphix.dct.models.EnableVDBParameters;
import com.delphix.dct.models.EnableVDBResponse;
import com.delphix.dct.models.ListBookmarksByVDBResponse;
import com.delphix.dct.models.ListSnapshotsResponse;
import com.delphix.dct.models.ListVDBsResponse;
import com.delphix.dct.models.PermissionEnum;
import com.delphix.dct.models.ProvisionVDBByLocationDefaultsRequest;
import com.delphix.dct.models.ProvisionVDBByLocationParameters;
import com.delphix.dct.models.ProvisionVDBBySnapshotDefaultsRequest;
import com.delphix.dct.models.ProvisionVDBBySnapshotParameters;
import com.delphix.dct.models.ProvisionVDBByTimestampDefaultsRequest;
import com.delphix.dct.models.ProvisionVDBByTimestampParameters;
import com.delphix.dct.models.ProvisionVDBFromBookmarkDefaultsRequest;
import com.delphix.dct.models.ProvisionVDBFromBookmarkParameters;
import com.delphix.dct.models.ProvisionVDBResponse;
import com.delphix.dct.models.RefreshVDBByLocationParameters;
import com.delphix.dct.models.RefreshVDBByLocationResponse;
import com.delphix.dct.models.RefreshVDBBySnapshotParameters;
import com.delphix.dct.models.RefreshVDBBySnapshotResponse;
import com.delphix.dct.models.RefreshVDBByTimestampParameters;
import com.delphix.dct.models.RefreshVDBByTimestampResponse;
import com.delphix.dct.models.RefreshVDBFromBookmarkParameters;
import com.delphix.dct.models.RefreshVDBFromBookmarkResponse;
import com.delphix.dct.models.RollbackVDBBySnapshotParameters;
import com.delphix.dct.models.RollbackVDBBySnapshotResponse;
import com.delphix.dct.models.RollbackVDBByTimestampParameters;
import com.delphix.dct.models.RollbackVDBByTimestampResponse;
import com.delphix.dct.models.RollbackVDBFromBookmarkParameters;
import com.delphix.dct.models.RollbackVDBFromBookmarkResponse;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchBookmarksByVDBResponse;
import com.delphix.dct.models.SearchVDBsResponse;
import com.delphix.dct.models.SnapshotVDBResponse;
import com.delphix.dct.models.StartVDBResponse;
import com.delphix.dct.models.StopVDBResponse;
import com.delphix.dct.models.SwitchTimeflowParameters;
import com.delphix.dct.models.SwitchTimeflowResponse;
import com.delphix.dct.models.TagsRequest;
import com.delphix.dct.models.TagsResponse;
import com.delphix.dct.models.UpdateVDBParameters;
import com.delphix.dct.models.UpdateVDBResponse;
import com.delphix.dct.models.VDB;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VdbsApi
 */
@Ignore
public class VdbsApiTest {

    private final VdbsApi api = new VdbsApi();

    
    /**
     * Create tags for a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVdbTagsTest() throws ApiException {
        String vdbId = null;
        TagsRequest tagsRequest = null;
        TagsResponse response = api.createVdbTags(vdbId, tagsRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVdbTest() throws ApiException {
        String vdbId = null;
        DeleteVDBParameters deleteVDBParameters = null;
        DeleteVDBResponse response = api.deleteVdb(vdbId, deleteVDBParameters);

        // TODO: test validations
    }
    
    /**
     * Delete tags for a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVdbTagsTest() throws ApiException {
        String vdbId = null;
        DeleteTag deleteTag = null;
        api.deleteVdbTags(vdbId, deleteTag);

        // TODO: test validations
    }
    
    /**
     * Disable a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void disableVdbTest() throws ApiException {
        String vdbId = null;
        DisableVDBParameters disableVDBParameters = null;
        DisableVDBResponse response = api.disableVdb(vdbId, disableVDBParameters);

        // TODO: test validations
    }
    
    /**
     * Enable a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableVdbTest() throws ApiException {
        String vdbId = null;
        EnableVDBParameters enableVDBParameters = null;
        EnableVDBResponse response = api.enableVdb(vdbId, enableVDBParameters);

        // TODO: test validations
    }
    
    /**
     * List Bookmarks compatible with this VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookmarksByVdbTest() throws ApiException {
        String vdbId = null;
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListBookmarksByVDBResponse response = api.getBookmarksByVdb(vdbId, limit, cursor, sort);

        // TODO: test validations
    }
    
    /**
     * Get tags for a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagsVdbTest() throws ApiException {
        String vdbId = null;
        TagsResponse response = api.getTagsVdb(vdbId);

        // TODO: test validations
    }
    
    /**
     * Get a VDB by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVdbByIdTest() throws ApiException {
        String vdbId = null;
        VDB response = api.getVdbById(vdbId);

        // TODO: test validations
    }
    
    /**
     * List Snapshots for a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVdbSnapshotsTest() throws ApiException {
        String vdbId = null;
        Integer limit = null;
        String cursor = null;
        ListSnapshotsResponse response = api.getVdbSnapshots(vdbId, limit, cursor);

        // TODO: test validations
    }
    
    /**
     * List all vdbs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVdbsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        PermissionEnum permission = null;
        ListVDBsResponse response = api.getVdbs(limit, cursor, sort, permission);

        // TODO: test validations
    }
    
    /**
     * Provision a new VDB by location.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provisionVdbByLocationTest() throws ApiException {
        ProvisionVDBByLocationParameters provisionVDBByLocationParameters = null;
        ProvisionVDBResponse response = api.provisionVdbByLocation(provisionVDBByLocationParameters);

        // TODO: test validations
    }
    
    /**
     * Get default provision parameters for provisioning a new VDB by location.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provisionVdbByLocationDefaultsTest() throws ApiException {
        ProvisionVDBByLocationDefaultsRequest provisionVDBByLocationDefaultsRequest = null;
        ProvisionVDBByLocationParameters response = api.provisionVdbByLocationDefaults(provisionVDBByLocationDefaultsRequest);

        // TODO: test validations
    }
    
    /**
     * Provision a new VDB by snapshot.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provisionVdbBySnapshotTest() throws ApiException {
        ProvisionVDBBySnapshotParameters provisionVDBBySnapshotParameters = null;
        ProvisionVDBResponse response = api.provisionVdbBySnapshot(provisionVDBBySnapshotParameters);

        // TODO: test validations
    }
    
    /**
     * Get default provision parameters for provisioning a new VDB by snapshot.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provisionVdbBySnapshotDefaultsTest() throws ApiException {
        ProvisionVDBBySnapshotDefaultsRequest provisionVDBBySnapshotDefaultsRequest = null;
        ProvisionVDBBySnapshotParameters response = api.provisionVdbBySnapshotDefaults(provisionVDBBySnapshotDefaultsRequest);

        // TODO: test validations
    }
    
    /**
     * Provision a new VDB by timestamp.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provisionVdbByTimestampTest() throws ApiException {
        ProvisionVDBByTimestampParameters provisionVDBByTimestampParameters = null;
        ProvisionVDBResponse response = api.provisionVdbByTimestamp(provisionVDBByTimestampParameters);

        // TODO: test validations
    }
    
    /**
     * Get default provision parameters for provisioning a new VDB by timestamp.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provisionVdbByTimestampDefaultsTest() throws ApiException {
        ProvisionVDBByTimestampDefaultsRequest provisionVDBByTimestampDefaultsRequest = null;
        ProvisionVDBByTimestampParameters response = api.provisionVdbByTimestampDefaults(provisionVDBByTimestampDefaultsRequest);

        // TODO: test validations
    }
    
    /**
     * Provision a new VDB from a bookmark with a single VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provisionVdbFromBookmarkTest() throws ApiException {
        ProvisionVDBFromBookmarkParameters provisionVDBFromBookmarkParameters = null;
        ProvisionVDBResponse response = api.provisionVdbFromBookmark(provisionVDBFromBookmarkParameters);

        // TODO: test validations
    }
    
    /**
     * Get default provision parameters for provisioning a new VDB from a bookmark.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void provisionVdbFromBookmarkDefaultsTest() throws ApiException {
        ProvisionVDBFromBookmarkDefaultsRequest provisionVDBFromBookmarkDefaultsRequest = null;
        ProvisionVDBFromBookmarkParameters response = api.provisionVdbFromBookmarkDefaults(provisionVDBFromBookmarkDefaultsRequest);

        // TODO: test validations
    }
    
    /**
     * Refresh a VDB by location.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshVdbByLocationTest() throws ApiException {
        String vdbId = null;
        RefreshVDBByLocationParameters refreshVDBByLocationParameters = null;
        RefreshVDBByLocationResponse response = api.refreshVdbByLocation(vdbId, refreshVDBByLocationParameters);

        // TODO: test validations
    }
    
    /**
     * Refresh a VDB by snapshot.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshVdbBySnapshotTest() throws ApiException {
        String vdbId = null;
        RefreshVDBBySnapshotParameters refreshVDBBySnapshotParameters = null;
        RefreshVDBBySnapshotResponse response = api.refreshVdbBySnapshot(vdbId, refreshVDBBySnapshotParameters);

        // TODO: test validations
    }
    
    /**
     * Refresh a VDB by timestamp.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshVdbByTimestampTest() throws ApiException {
        String vdbId = null;
        RefreshVDBByTimestampParameters refreshVDBByTimestampParameters = null;
        RefreshVDBByTimestampResponse response = api.refreshVdbByTimestamp(vdbId, refreshVDBByTimestampParameters);

        // TODO: test validations
    }
    
    /**
     * Refresh a VDB from bookmark with a single VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshVdbFromBookmarkTest() throws ApiException {
        String vdbId = null;
        RefreshVDBFromBookmarkParameters refreshVDBFromBookmarkParameters = null;
        RefreshVDBFromBookmarkResponse response = api.refreshVdbFromBookmark(vdbId, refreshVDBFromBookmarkParameters);

        // TODO: test validations
    }
    
    /**
     * Rollback a VDB by snapshot.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rollbackVdbBySnapshotTest() throws ApiException {
        String vdbId = null;
        RollbackVDBBySnapshotParameters rollbackVDBBySnapshotParameters = null;
        RollbackVDBBySnapshotResponse response = api.rollbackVdbBySnapshot(vdbId, rollbackVDBBySnapshotParameters);

        // TODO: test validations
    }
    
    /**
     * Rollback a VDB by timestamp.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rollbackVdbByTimestampTest() throws ApiException {
        String vdbId = null;
        RollbackVDBByTimestampParameters rollbackVDBByTimestampParameters = null;
        RollbackVDBByTimestampResponse response = api.rollbackVdbByTimestamp(vdbId, rollbackVDBByTimestampParameters);

        // TODO: test validations
    }
    
    /**
     * Rollback a VDB from a bookmark with only the same VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rollbackVdbFromBookmarkTest() throws ApiException {
        String vdbId = null;
        RollbackVDBFromBookmarkParameters rollbackVDBFromBookmarkParameters = null;
        RollbackVDBFromBookmarkResponse response = api.rollbackVdbFromBookmark(vdbId, rollbackVDBFromBookmarkParameters);

        // TODO: test validations
    }
    
    /**
     * Search Bookmarks compatible with this VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchBookmarksByVdbTest() throws ApiException {
        String vdbId = null;
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchBookmarksByVDBResponse response = api.searchBookmarksByVdb(vdbId, limit, cursor, sort, searchBody);

        // TODO: test validations
    }
    
    /**
     * Search for VDBs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchVdbsTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        PermissionEnum permission = null;
        SearchBody searchBody = null;
        SearchVDBsResponse response = api.searchVdbs(limit, cursor, sort, permission, searchBody);

        // TODO: test validations
    }
    
    /**
     * Snapshot a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void snapshotVdbTest() throws ApiException {
        String vdbId = null;
        SnapshotVDBResponse response = api.snapshotVdb(vdbId);

        // TODO: test validations
    }
    
    /**
     * Start a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startVdbTest() throws ApiException {
        String vdbId = null;
        StartVDBResponse response = api.startVdb(vdbId);

        // TODO: test validations
    }
    
    /**
     * Stop a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopVdbTest() throws ApiException {
        String vdbId = null;
        StopVDBResponse response = api.stopVdb(vdbId);

        // TODO: test validations
    }
    
    /**
     * Switches the current timeflow of a VDB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void switchTimeflowTest() throws ApiException {
        String vdbId = null;
        SwitchTimeflowParameters switchTimeflowParameters = null;
        SwitchTimeflowResponse response = api.switchTimeflow(vdbId, switchTimeflowParameters);

        // TODO: test validations
    }
    
    /**
     * Update values of a VDB
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVdbByIdTest() throws ApiException {
        String vdbId = null;
        UpdateVDBParameters updateVDBParameters = null;
        UpdateVDBResponse response = api.updateVdbById(vdbId, updateVDBParameters);

        // TODO: test validations
    }
    
}

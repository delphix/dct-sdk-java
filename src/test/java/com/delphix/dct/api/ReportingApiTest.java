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
import com.delphix.dct.models.ApiUsageReportResponse;
import com.delphix.dct.models.DSourceConsumptionReportResponse;
import com.delphix.dct.models.DSourceUsageReportResponse;
import com.delphix.dct.models.DeleteTag;
import com.delphix.dct.models.ListReportingScheduleResponse;
import org.threeten.bp.OffsetDateTime;
import com.delphix.dct.models.ProductInfo;
import com.delphix.dct.models.ReportingSchedule;
import com.delphix.dct.models.ReportingScheduleCreateParameters;
import com.delphix.dct.models.SearchBody;
import com.delphix.dct.models.SearchReportingScheduleResponse;
import com.delphix.dct.models.TagsRequest;
import com.delphix.dct.models.TagsResponse;
import com.delphix.dct.models.VDBInventoryReportResponse;
import com.delphix.dct.models.VirtualizationStorageSummaryReportResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingApi
 */
@Ignore
public class ReportingApiTest {

    private final ReportingApi api = new ReportingApi();

    
    /**
     * Create a new report schedule.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReportingScheduleTest() throws ApiException {
        ReportingScheduleCreateParameters reportingScheduleCreateParameters = null;
        ReportingSchedule response = api.createReportingSchedule(reportingScheduleCreateParameters);

        // TODO: test validations
    }
    
    /**
     * Create tags for a report schedule.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReportingScheduleTagsTest() throws ApiException {
        Integer reportId = null;
        TagsRequest tagsRequest = null;
        TagsResponse response = api.createReportingScheduleTags(reportId, tagsRequest);

        // TODO: test validations
    }
    
    /**
     * Delete report schedule by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReportingScheduleTest() throws ApiException {
        Integer reportId = null;
        api.deleteReportingSchedule(reportId);

        // TODO: test validations
    }
    
    /**
     * Delete tags for a report schedule.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReportingScheduleTagTest() throws ApiException {
        Integer reportId = null;
        DeleteTag deleteTag = null;
        api.deleteReportingScheduleTag(reportId, deleteTag);

        // TODO: test validations
    }
    
    /**
     * Gets the report of API usage metrics over a given time period. This API returns at the most 10000 results in the response to protect against the server running out of memory. Users might not hit this limit with the default report without any &#39;apiUsageReportGroupByParam&#39; param but can hit this limit if the groupBy is by too granular like by &#39;client_name&#39; or &#39;user_agent&#39; only. Hence it is advisable to use startDate and endDate to &#39;limit&#39; the scope of the report.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApiUsageReportTest() throws ApiException {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String apiMetricKind = null;
        List<String> groupBy = null;
        List<String> clientName = null;
        List<String> userAgent = null;
        List<String> dctVersion = null;
        ApiUsageReportResponse response = api.getApiUsageReport(startDate, endDate, apiMetricKind, groupBy, clientName, userAgent, dctVersion);

        // TODO: test validations
    }
    
    /**
     * Gets the consumption report for virtualization engine dSources.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDsourceConsumptionReportTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        DSourceConsumptionReportResponse response = api.getDsourceConsumptionReport(limit, cursor, sort);

        // TODO: test validations
    }
    
    /**
     * Gets the usage report for virtualization engine dSources.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDsourceUsageReportTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        DSourceUsageReportResponse response = api.getDsourceUsageReport(limit, cursor, sort);

        // TODO: test validations
    }
    
    /**
     * Returns the DCT Product Information.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductInfoTest() throws ApiException {
        ProductInfo response = api.getProductInfo();

        // TODO: test validations
    }
    
    /**
     * Returns a report schedule by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportingScheduleByIdTest() throws ApiException {
        Integer reportId = null;
        ReportingSchedule response = api.getReportingScheduleById(reportId);

        // TODO: test validations
    }
    
    /**
     * Get tags for a report schedule.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportingScheduleTagsTest() throws ApiException {
        Integer reportId = null;
        TagsResponse response = api.getReportingScheduleTags(reportId);

        // TODO: test validations
    }
    
    /**
     * List all report schedules.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportingSchedulesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        ListReportingScheduleResponse response = api.getReportingSchedules(limit, cursor, sort);

        // TODO: test validations
    }
    
    /**
     * Gets the inventory report for virtualization engine VDBs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVdbInventoryReportTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        VDBInventoryReportResponse response = api.getVdbInventoryReport(limit, cursor, sort);

        // TODO: test validations
    }
    
    /**
     * Gets the storage summary report for virtualization engines.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVirtualizationStorageSummaryReportTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        VirtualizationStorageSummaryReportResponse response = api.getVirtualizationStorageSummaryReport(limit, cursor, sort);

        // TODO: test validations
    }
    
    /**
     * Search the consumption report for virtualization engine DSources.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchDsourceConsumptionReportTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        DSourceConsumptionReportResponse response = api.searchDsourceConsumptionReport(limit, cursor, sort, searchBody);

        // TODO: test validations
    }
    
    /**
     * Search the usage report for virtualization engine dSources.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchDsourceUsageReportTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        DSourceUsageReportResponse response = api.searchDsourceUsageReport(limit, cursor, sort, searchBody);

        // TODO: test validations
    }
    
    /**
     * Search for report schedules.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchReportingSchedulesTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        SearchReportingScheduleResponse response = api.searchReportingSchedules(limit, cursor, sort, searchBody);

        // TODO: test validations
    }
    
    /**
     * Search the inventory report for virtualization engine VDBs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchVdbInventoryReportTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        VDBInventoryReportResponse response = api.searchVdbInventoryReport(limit, cursor, sort, searchBody);

        // TODO: test validations
    }
    
    /**
     * Search the storage summary report for virtualization engines.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchVirtualizationStorageSummaryReportTest() throws ApiException {
        Integer limit = null;
        String cursor = null;
        String sort = null;
        SearchBody searchBody = null;
        VirtualizationStorageSummaryReportResponse response = api.searchVirtualizationStorageSummaryReport(limit, cursor, sort, searchBody);

        // TODO: test validations
    }
    
    /**
     * Update a reporting schedule by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReportingScheduleTest() throws ApiException {
        Integer reportId = null;
        ReportingSchedule reportingSchedule = null;
        ReportingSchedule response = api.updateReportingSchedule(reportId, reportingSchedule);

        // TODO: test validations
    }
    
}

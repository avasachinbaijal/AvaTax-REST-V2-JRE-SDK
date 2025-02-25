package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 * Swagger name: AvaTaxClient
 */

/**
 * Represents an item in your company's product catalog.
 */
public class ItemModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID number of this item.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this item.
     */
    public void setId(Long value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company that owns this item.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company that owns this item.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String itemCode;

    /**
     * Getter for itemCode
     *
     * A unique code representing this item.
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Setter for itemCode
     *
     * A unique code representing this item.
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    private Integer taxCodeId;

    /**
     * Getter for taxCodeId
     *
     * DEPRECATED - Date: 11/13/2018, Version: 18.12, Message: For identifying an `Item` with `Avalara TaxCode`, please call the [CreateItemClassification API] with your ItemCode and the Avalara TaxCode.
    * The unique ID number of the tax code that is applied when selling this item.
    * When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public Integer getTaxCodeId() {
        return this.taxCodeId;
    }

    /**
     * Setter for taxCodeId
     *
     * DEPRECATED - Date: 11/13/2018, Version: 18.12, Message: For identifying an `Item` with `Avalara TaxCode`, please call the [CreateItemClassification API] with your ItemCode and the Avalara TaxCode.
    * The unique ID number of the tax code that is applied when selling this item.
    * When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public void setTaxCodeId(Integer value) {
        this.taxCodeId = value;
    }

    private String taxCode;

    /**
     * Getter for taxCode
     *
     * DEPRECATED - Date: 11/13/2018, Version: 18.12, Message: For identifying an `Item` with `Avalara TaxCode`, please call the [CreateItemClassification API] with your ItemCode and the Avalara TaxCode.
    * The unique code string of the Tax Code that is applied when selling this item.
    * When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * DEPRECATED - Date: 11/13/2018, Version: 18.12, Message: For identifying an `Item` with `Avalara TaxCode`, please call the [CreateItemClassification API] with your ItemCode and the Avalara TaxCode.
    * The unique code string of the Tax Code that is applied when selling this item.
    * When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * A friendly description of this item in your product catalog.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A friendly description of this item in your product catalog.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String itemGroup;

    /**
     * Getter for itemGroup
     *
     * A way to group similar items.
     */
    public String getItemGroup() {
        return this.itemGroup;
    }

    /**
     * Setter for itemGroup
     *
     * A way to group similar items.
     */
    public void setItemGroup(String value) {
        this.itemGroup = value;
    }

    private String category;

    /**
     * Getter for category
     *
     * A category of product
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category
     *
     * A category of product
     */
    public void setCategory(String value) {
        this.category = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    private String source;

    /**
     * Getter for source
     *
     * Source of creation of this item
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Setter for source
     *
     * Source of creation of this item
     */
    public void setSource(String value) {
        this.source = value;
    }

    private String upc;

    /**
     * Getter for upc
     *
     * Universal unique code for item
     */
    public String getUpc() {
        return this.upc;
    }

    /**
     * Setter for upc
     *
     * Universal unique code for item
     */
    public void setUpc(String value) {
        this.upc = value;
    }

    private ArrayList<ClassificationModel> classifications;

    /**
     * Getter for classifications
     *
     * List of classifications that belong to this item.
    * A single classification consits of a productCode and a systemCode for a particular item.
     */
    public ArrayList<ClassificationModel> getClassifications() {
        return this.classifications;
    }

    /**
     * Setter for classifications
     *
     * List of classifications that belong to this item.
    * A single classification consits of a productCode and a systemCode for a particular item.
     */
    public void setClassifications(ArrayList<ClassificationModel> value) {
        this.classifications = value;
    }

    private ArrayList<ItemParameterModel> parameters;

    /**
     * Getter for parameters
     *
     * List of item parameters.
     */
    public ArrayList<ItemParameterModel> getParameters() {
        return this.parameters;
    }

    /**
     * Setter for parameters
     *
     * List of item parameters.
     */
    public void setParameters(ArrayList<ItemParameterModel> value) {
        this.parameters = value;
    }

    private ArrayList<ItemTagDetailModel> tags;

    /**
     * Getter for tags
     *
     * List of item tags.
     */
    public ArrayList<ItemTagDetailModel> getTags() {
        return this.tags;
    }

    /**
     * Setter for tags
     *
     * List of item tags.
     */
    public void setTags(ArrayList<ItemTagDetailModel> value) {
        this.tags = value;
    }

    /**
     * Returns a JSON string representation of ItemModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}

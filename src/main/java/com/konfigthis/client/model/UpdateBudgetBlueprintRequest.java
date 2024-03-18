/*
 * Budgets API
 *  The budgets API lets you manage your Brex budgets. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developer-access@brex.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.BudgetLimit;
import com.konfigthis.client.model.LimitType;
import com.konfigthis.client.model.PeriodType;
import com.konfigthis.client.model.SpendType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 *  Blueprint for provisioning Budgets for a Budget Program. 
 */
@ApiModel(description = " Blueprint for provisioning Budgets for a Budget Program. ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateBudgetBlueprintRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_BUDGET_ID = "parent_budget_id";
  @SerializedName(SERIALIZED_NAME_PARENT_BUDGET_ID)
  private String parentBudgetId;

  public static final String SERIALIZED_NAME_OWNER_USER_IDS = "owner_user_ids";
  @SerializedName(SERIALIZED_NAME_OWNER_USER_IDS)
  private List<String> ownerUserIds = null;

  public static final String SERIALIZED_NAME_PERIOD_TYPE = "period_type";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private PeriodType periodType;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private BudgetLimit limit;

  public static final String SERIALIZED_NAME_LIMIT_TYPE = "limit_type";
  @SerializedName(SERIALIZED_NAME_LIMIT_TYPE)
  private LimitType limitType;

  public static final String SERIALIZED_NAME_SPEND_TYPE = "spend_type";
  @SerializedName(SERIALIZED_NAME_SPEND_TYPE)
  private SpendType spendType;

  public UpdateBudgetBlueprintRequest() {
  }

  public UpdateBudgetBlueprintRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   *  Description of what the Budget is used for. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " Description of what the Budget is used for. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public UpdateBudgetBlueprintRequest id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   *  ID of budget blueprint to update, omit if adding new budget blueprint to budget program. 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ID of budget blueprint to update, omit if adding new budget blueprint to budget program. ")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public UpdateBudgetBlueprintRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   *  Name for the Budget. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " Name for the Budget. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public UpdateBudgetBlueprintRequest parentBudgetId(String parentBudgetId) {
    
    
    
    
    this.parentBudgetId = parentBudgetId;
    return this;
  }

   /**
   *  ID of parent Budget. 
   * @return parentBudgetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ID of parent Budget. ")

  public String getParentBudgetId() {
    return parentBudgetId;
  }


  public void setParentBudgetId(String parentBudgetId) {
    
    
    
    this.parentBudgetId = parentBudgetId;
  }


  public UpdateBudgetBlueprintRequest ownerUserIds(List<String> ownerUserIds) {
    
    
    
    
    this.ownerUserIds = ownerUserIds;
    return this;
  }

  public UpdateBudgetBlueprintRequest addOwnerUserIdsItem(String ownerUserIdsItem) {
    if (this.ownerUserIds == null) {
      this.ownerUserIds = new ArrayList<>();
    }
    this.ownerUserIds.add(ownerUserIdsItem);
    return this;
  }

   /**
   *  User IDs of the owners of the Budget. 
   * @return ownerUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " User IDs of the owners of the Budget. ")

  public List<String> getOwnerUserIds() {
    return ownerUserIds;
  }


  public void setOwnerUserIds(List<String> ownerUserIds) {
    
    
    
    this.ownerUserIds = ownerUserIds;
  }


  public UpdateBudgetBlueprintRequest periodType(PeriodType periodType) {
    
    
    
    
    this.periodType = periodType;
    return this;
  }

   /**
   * Get periodType
   * @return periodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PeriodType getPeriodType() {
    return periodType;
  }


  public void setPeriodType(PeriodType periodType) {
    
    
    
    this.periodType = periodType;
  }


  public UpdateBudgetBlueprintRequest startDate(LocalDate startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   *  The UTC date when the Budget should start counting. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " The UTC date when the Budget should start counting. ")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    
    
    
    this.startDate = startDate;
  }


  public UpdateBudgetBlueprintRequest endDate(LocalDate endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   *  The UTC date when the Budget should stop counting. 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " The UTC date when the Budget should stop counting. ")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    
    
    
    this.endDate = endDate;
  }


  public UpdateBudgetBlueprintRequest limit(BudgetLimit limit) {
    
    
    
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BudgetLimit getLimit() {
    return limit;
  }


  public void setLimit(BudgetLimit limit) {
    
    
    
    this.limit = limit;
  }


  public UpdateBudgetBlueprintRequest limitType(LimitType limitType) {
    
    
    
    
    this.limitType = limitType;
    return this;
  }

   /**
   * Get limitType
   * @return limitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LimitType getLimitType() {
    return limitType;
  }


  public void setLimitType(LimitType limitType) {
    
    
    
    this.limitType = limitType;
  }


  public UpdateBudgetBlueprintRequest spendType(SpendType spendType) {
    
    
    
    
    this.spendType = spendType;
    return this;
  }

   /**
   * Get spendType
   * @return spendType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpendType getSpendType() {
    return spendType;
  }


  public void setSpendType(SpendType spendType) {
    
    
    
    this.spendType = spendType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UpdateBudgetBlueprintRequest instance itself
   */
  public UpdateBudgetBlueprintRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBudgetBlueprintRequest updateBudgetBlueprintRequest = (UpdateBudgetBlueprintRequest) o;
    return Objects.equals(this.description, updateBudgetBlueprintRequest.description) &&
        Objects.equals(this.id, updateBudgetBlueprintRequest.id) &&
        Objects.equals(this.name, updateBudgetBlueprintRequest.name) &&
        Objects.equals(this.parentBudgetId, updateBudgetBlueprintRequest.parentBudgetId) &&
        Objects.equals(this.ownerUserIds, updateBudgetBlueprintRequest.ownerUserIds) &&
        Objects.equals(this.periodType, updateBudgetBlueprintRequest.periodType) &&
        Objects.equals(this.startDate, updateBudgetBlueprintRequest.startDate) &&
        Objects.equals(this.endDate, updateBudgetBlueprintRequest.endDate) &&
        Objects.equals(this.limit, updateBudgetBlueprintRequest.limit) &&
        Objects.equals(this.limitType, updateBudgetBlueprintRequest.limitType) &&
        Objects.equals(this.spendType, updateBudgetBlueprintRequest.spendType)&&
        Objects.equals(this.additionalProperties, updateBudgetBlueprintRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, parentBudgetId, ownerUserIds, periodType, startDate, endDate, limit, limitType, spendType, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBudgetBlueprintRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentBudgetId: ").append(toIndentedString(parentBudgetId)).append("\n");
    sb.append("    ownerUserIds: ").append(toIndentedString(ownerUserIds)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
    sb.append("    spendType: ").append(toIndentedString(spendType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("parent_budget_id");
    openapiFields.add("owner_user_ids");
    openapiFields.add("period_type");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("limit");
    openapiFields.add("limit_type");
    openapiFields.add("spend_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateBudgetBlueprintRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateBudgetBlueprintRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBudgetBlueprintRequest is not found in the empty JSON string", UpdateBudgetBlueprintRequest.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonNull() && (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonNull() && (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("parent_budget_id").isJsonNull() && (jsonObj.get("parent_budget_id") != null && !jsonObj.get("parent_budget_id").isJsonNull()) && !jsonObj.get("parent_budget_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_budget_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_budget_id").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("owner_user_ids") != null && !jsonObj.get("owner_user_ids").isJsonNull() && !jsonObj.get("owner_user_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_user_ids` to be an array in the JSON string or null but got `%s`", jsonObj.get("owner_user_ids").toString()));
      }
      // validate the optional field `period_type`
      if (jsonObj.get("period_type") != null && !jsonObj.get("period_type").isJsonNull()) {
        PeriodType.validateJsonObject(jsonObj.getAsJsonObject("period_type"));
      }
      // validate the optional field `limit`
      if (jsonObj.get("limit") != null && !jsonObj.get("limit").isJsonNull()) {
        BudgetLimit.validateJsonObject(jsonObj.getAsJsonObject("limit"));
      }
      // validate the optional field `limit_type`
      if (jsonObj.get("limit_type") != null && !jsonObj.get("limit_type").isJsonNull()) {
        LimitType.validateJsonObject(jsonObj.getAsJsonObject("limit_type"));
      }
      // validate the optional field `spend_type`
      if (jsonObj.get("spend_type") != null && !jsonObj.get("spend_type").isJsonNull()) {
        SpendType.validateJsonObject(jsonObj.getAsJsonObject("spend_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateBudgetBlueprintRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBudgetBlueprintRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBudgetBlueprintRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBudgetBlueprintRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBudgetBlueprintRequest>() {
           @Override
           public void write(JsonWriter out, UpdateBudgetBlueprintRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateBudgetBlueprintRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateBudgetBlueprintRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateBudgetBlueprintRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateBudgetBlueprintRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateBudgetBlueprintRequest
  */
  public static UpdateBudgetBlueprintRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBudgetBlueprintRequest.class);
  }

 /**
  * Convert an instance of UpdateBudgetBlueprintRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


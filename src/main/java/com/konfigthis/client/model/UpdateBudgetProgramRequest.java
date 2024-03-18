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
import com.konfigthis.client.model.CreateBudgetProgramRequestEmployeeFilter;
import com.konfigthis.client.model.UpdateBudgetBlueprintRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 *  Budget Program used to create budgets for eligible users. 
 */
@ApiModel(description = " Budget Program used to create budgets for eligible users. ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateBudgetProgramRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXISTING_BUDGET_IDS = "existing_budget_ids";
  @SerializedName(SERIALIZED_NAME_EXISTING_BUDGET_IDS)
  private List<String> existingBudgetIds = null;

  public static final String SERIALIZED_NAME_BUDGET_BLUEPRINTS = "budget_blueprints";
  @SerializedName(SERIALIZED_NAME_BUDGET_BLUEPRINTS)
  private List<UpdateBudgetBlueprintRequest> budgetBlueprints = null;

  public static final String SERIALIZED_NAME_EMPLOYEE_FILTER = "employee_filter";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_FILTER)
  private CreateBudgetProgramRequestEmployeeFilter employeeFilter;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public UpdateBudgetProgramRequest() {
  }

  public UpdateBudgetProgramRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public UpdateBudgetProgramRequest existingBudgetIds(List<String> existingBudgetIds) {
    
    
    
    
    this.existingBudgetIds = existingBudgetIds;
    return this;
  }

  public UpdateBudgetProgramRequest addExistingBudgetIdsItem(String existingBudgetIdsItem) {
    if (this.existingBudgetIds == null) {
      this.existingBudgetIds = new ArrayList<>();
    }
    this.existingBudgetIds.add(existingBudgetIdsItem);
    return this;
  }

   /**
   *  IDs for existing budgets associated with this Budget Program. 
   * @return existingBudgetIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " IDs for existing budgets associated with this Budget Program. ")

  public List<String> getExistingBudgetIds() {
    return existingBudgetIds;
  }


  public void setExistingBudgetIds(List<String> existingBudgetIds) {
    
    
    
    this.existingBudgetIds = existingBudgetIds;
  }


  public UpdateBudgetProgramRequest budgetBlueprints(List<UpdateBudgetBlueprintRequest> budgetBlueprints) {
    
    
    
    
    this.budgetBlueprints = budgetBlueprints;
    return this;
  }

  public UpdateBudgetProgramRequest addBudgetBlueprintsItem(UpdateBudgetBlueprintRequest budgetBlueprintsItem) {
    if (this.budgetBlueprints == null) {
      this.budgetBlueprints = new ArrayList<>();
    }
    this.budgetBlueprints.add(budgetBlueprintsItem);
    return this;
  }

   /**
   *  The Blueprints to update the budget program with. Blueprints without an ID are treated as new blueprints to be created. Blueprints that exist currently on the Budget Program, but are missing from the input, will be deleted. 
   * @return budgetBlueprints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " The Blueprints to update the budget program with. Blueprints without an ID are treated as new blueprints to be created. Blueprints that exist currently on the Budget Program, but are missing from the input, will be deleted. ")

  public List<UpdateBudgetBlueprintRequest> getBudgetBlueprints() {
    return budgetBlueprints;
  }


  public void setBudgetBlueprints(List<UpdateBudgetBlueprintRequest> budgetBlueprints) {
    
    
    
    this.budgetBlueprints = budgetBlueprints;
  }


  public UpdateBudgetProgramRequest employeeFilter(CreateBudgetProgramRequestEmployeeFilter employeeFilter) {
    
    
    
    
    this.employeeFilter = employeeFilter;
    return this;
  }

   /**
   * Get employeeFilter
   * @return employeeFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateBudgetProgramRequestEmployeeFilter getEmployeeFilter() {
    return employeeFilter;
  }


  public void setEmployeeFilter(CreateBudgetProgramRequestEmployeeFilter employeeFilter) {
    
    
    
    this.employeeFilter = employeeFilter;
  }


  public UpdateBudgetProgramRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
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
   * @return the UpdateBudgetProgramRequest instance itself
   */
  public UpdateBudgetProgramRequest putAdditionalProperty(String key, Object value) {
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
    UpdateBudgetProgramRequest updateBudgetProgramRequest = (UpdateBudgetProgramRequest) o;
    return Objects.equals(this.description, updateBudgetProgramRequest.description) &&
        Objects.equals(this.existingBudgetIds, updateBudgetProgramRequest.existingBudgetIds) &&
        Objects.equals(this.budgetBlueprints, updateBudgetProgramRequest.budgetBlueprints) &&
        Objects.equals(this.employeeFilter, updateBudgetProgramRequest.employeeFilter) &&
        Objects.equals(this.name, updateBudgetProgramRequest.name)&&
        Objects.equals(this.additionalProperties, updateBudgetProgramRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, existingBudgetIds, budgetBlueprints, employeeFilter, name, additionalProperties);
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
    sb.append("class UpdateBudgetProgramRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    existingBudgetIds: ").append(toIndentedString(existingBudgetIds)).append("\n");
    sb.append("    budgetBlueprints: ").append(toIndentedString(budgetBlueprints)).append("\n");
    sb.append("    employeeFilter: ").append(toIndentedString(employeeFilter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("existing_budget_ids");
    openapiFields.add("budget_blueprints");
    openapiFields.add("employee_filter");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateBudgetProgramRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateBudgetProgramRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBudgetProgramRequest is not found in the empty JSON string", UpdateBudgetProgramRequest.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("existing_budget_ids") != null && !jsonObj.get("existing_budget_ids").isJsonNull() && !jsonObj.get("existing_budget_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `existing_budget_ids` to be an array in the JSON string or null but got `%s`", jsonObj.get("existing_budget_ids").toString()));
      }
      if (jsonObj.get("budget_blueprints") != null && !jsonObj.get("budget_blueprints").isJsonNull()) {
        JsonArray jsonArraybudgetBlueprints = jsonObj.getAsJsonArray("budget_blueprints");
        if (jsonArraybudgetBlueprints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("budget_blueprints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `budget_blueprints` to be an array in the JSON string but got `%s`", jsonObj.get("budget_blueprints").toString()));
          }

          // validate the optional field `budget_blueprints` (array)
          for (int i = 0; i < jsonArraybudgetBlueprints.size(); i++) {
            UpdateBudgetBlueprintRequest.validateJsonObject(jsonArraybudgetBlueprints.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `employee_filter`
      if (jsonObj.get("employee_filter") != null && !jsonObj.get("employee_filter").isJsonNull()) {
        CreateBudgetProgramRequestEmployeeFilter.validateJsonObject(jsonObj.getAsJsonObject("employee_filter"));
      }
      if (!jsonObj.get("name").isJsonNull() && (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateBudgetProgramRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBudgetProgramRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBudgetProgramRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBudgetProgramRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBudgetProgramRequest>() {
           @Override
           public void write(JsonWriter out, UpdateBudgetProgramRequest value) throws IOException {
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
           public UpdateBudgetProgramRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateBudgetProgramRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateBudgetProgramRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateBudgetProgramRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateBudgetProgramRequest
  */
  public static UpdateBudgetProgramRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBudgetProgramRequest.class);
  }

 /**
  * Convert an instance of UpdateBudgetProgramRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


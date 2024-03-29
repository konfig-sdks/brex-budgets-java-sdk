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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 *  Determines if budget members are allowed to view the budget limit. 
 */
@JsonAdapter(BudgetLimitVisibilityType.Adapter.class)public enum BudgetLimitVisibilityType {
  
  SHARED("SHARED"),
  
  PRIVATE("PRIVATE");

  private String value;

  BudgetLimitVisibilityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BudgetLimitVisibilityType fromValue(String value) {
    for (BudgetLimitVisibilityType b : BudgetLimitVisibilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BudgetLimitVisibilityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BudgetLimitVisibilityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BudgetLimitVisibilityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BudgetLimitVisibilityType.fromValue(value);
    }
  }
}


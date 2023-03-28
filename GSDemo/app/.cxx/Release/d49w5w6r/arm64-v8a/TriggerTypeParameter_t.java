/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.asta.isoObject;

public final class TriggerTypeParameter_t {
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_FALSE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_FALSE", isoObject_wrapJNI.TRIGGER_PARAMETER_FALSE_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_TRUE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_TRUE", isoObject_wrapJNI.TRIGGER_PARAMETER_TRUE_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_RELEASED = new TriggerTypeParameter_t("TRIGGER_PARAMETER_RELEASED", isoObject_wrapJNI.TRIGGER_PARAMETER_RELEASED_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_PRESSED = new TriggerTypeParameter_t("TRIGGER_PARAMETER_PRESSED", isoObject_wrapJNI.TRIGGER_PARAMETER_PRESSED_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_LOW = new TriggerTypeParameter_t("TRIGGER_PARAMETER_LOW", isoObject_wrapJNI.TRIGGER_PARAMETER_LOW_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_HIGH = new TriggerTypeParameter_t("TRIGGER_PARAMETER_HIGH", isoObject_wrapJNI.TRIGGER_PARAMETER_HIGH_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_RISING_EDGE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_RISING_EDGE", isoObject_wrapJNI.TRIGGER_PARAMETER_RISING_EDGE_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_FALLING_EDGE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_FALLING_EDGE", isoObject_wrapJNI.TRIGGER_PARAMETER_FALLING_EDGE_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_ANY_EDGE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_ANY_EDGE", isoObject_wrapJNI.TRIGGER_PARAMETER_ANY_EDGE_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_RELATIVE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_RELATIVE", isoObject_wrapJNI.TRIGGER_PARAMETER_RELATIVE_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_ABSOLUTE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_ABSOLUTE", isoObject_wrapJNI.TRIGGER_PARAMETER_ABSOLUTE_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_VALUE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_VALUE", isoObject_wrapJNI.TRIGGER_PARAMETER_VALUE_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_MIN = new TriggerTypeParameter_t("TRIGGER_PARAMETER_MIN", isoObject_wrapJNI.TRIGGER_PARAMETER_MIN_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_MAX = new TriggerTypeParameter_t("TRIGGER_PARAMETER_MAX", isoObject_wrapJNI.TRIGGER_PARAMETER_MAX_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_MEAN = new TriggerTypeParameter_t("TRIGGER_PARAMETER_MEAN", isoObject_wrapJNI.TRIGGER_PARAMETER_MEAN_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_EQUAL_TO = new TriggerTypeParameter_t("TRIGGER_PARAMETER_EQUAL_TO", isoObject_wrapJNI.TRIGGER_PARAMETER_EQUAL_TO_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_GREATER_THAN = new TriggerTypeParameter_t("TRIGGER_PARAMETER_GREATER_THAN", isoObject_wrapJNI.TRIGGER_PARAMETER_GREATER_THAN_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_GREATER_THAN_OR_EQUAL_TO = new TriggerTypeParameter_t("TRIGGER_PARAMETER_GREATER_THAN_OR_EQUAL_TO", isoObject_wrapJNI.TRIGGER_PARAMETER_GREATER_THAN_OR_EQUAL_TO_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_LESS_THAN = new TriggerTypeParameter_t("TRIGGER_PARAMETER_LESS_THAN", isoObject_wrapJNI.TRIGGER_PARAMETER_LESS_THAN_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_LESS_THAN_OR_EQUAL_TO = new TriggerTypeParameter_t("TRIGGER_PARAMETER_LESS_THAN_OR_EQUAL_TO", isoObject_wrapJNI.TRIGGER_PARAMETER_LESS_THAN_OR_EQUAL_TO_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_NOT_EQUAL_TO = new TriggerTypeParameter_t("TRIGGER_PARAMETER_NOT_EQUAL_TO", isoObject_wrapJNI.TRIGGER_PARAMETER_NOT_EQUAL_TO_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_X = new TriggerTypeParameter_t("TRIGGER_PARAMETER_X", isoObject_wrapJNI.TRIGGER_PARAMETER_X_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_Y = new TriggerTypeParameter_t("TRIGGER_PARAMETER_Y", isoObject_wrapJNI.TRIGGER_PARAMETER_Y_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_Z = new TriggerTypeParameter_t("TRIGGER_PARAMETER_Z", isoObject_wrapJNI.TRIGGER_PARAMETER_Z_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_TIME = new TriggerTypeParameter_t("TRIGGER_PARAMETER_TIME", isoObject_wrapJNI.TRIGGER_PARAMETER_TIME_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_DATE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_DATE", isoObject_wrapJNI.TRIGGER_PARAMETER_DATE_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_RULE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_RULE", isoObject_wrapJNI.TRIGGER_PARAMETER_RULE_get());
  public final static TriggerTypeParameter_t TRIGGER_PARAMETER_UNAVAILABLE = new TriggerTypeParameter_t("TRIGGER_PARAMETER_UNAVAILABLE", isoObject_wrapJNI.TRIGGER_PARAMETER_UNAVAILABLE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TriggerTypeParameter_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TriggerTypeParameter_t.class + " with value " + swigValue);
  }

  private TriggerTypeParameter_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TriggerTypeParameter_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TriggerTypeParameter_t(String swigName, TriggerTypeParameter_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TriggerTypeParameter_t[] swigValues = { TRIGGER_PARAMETER_FALSE, TRIGGER_PARAMETER_TRUE, TRIGGER_PARAMETER_RELEASED, TRIGGER_PARAMETER_PRESSED, TRIGGER_PARAMETER_LOW, TRIGGER_PARAMETER_HIGH, TRIGGER_PARAMETER_RISING_EDGE, TRIGGER_PARAMETER_FALLING_EDGE, TRIGGER_PARAMETER_ANY_EDGE, TRIGGER_PARAMETER_RELATIVE, TRIGGER_PARAMETER_ABSOLUTE, TRIGGER_PARAMETER_VALUE, TRIGGER_PARAMETER_MIN, TRIGGER_PARAMETER_MAX, TRIGGER_PARAMETER_MEAN, TRIGGER_PARAMETER_EQUAL_TO, TRIGGER_PARAMETER_GREATER_THAN, TRIGGER_PARAMETER_GREATER_THAN_OR_EQUAL_TO, TRIGGER_PARAMETER_LESS_THAN, TRIGGER_PARAMETER_LESS_THAN_OR_EQUAL_TO, TRIGGER_PARAMETER_NOT_EQUAL_TO, TRIGGER_PARAMETER_X, TRIGGER_PARAMETER_Y, TRIGGER_PARAMETER_Z, TRIGGER_PARAMETER_TIME, TRIGGER_PARAMETER_DATE, TRIGGER_PARAMETER_RULE, TRIGGER_PARAMETER_UNAVAILABLE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.asta.isoObject;

public final class GeneralDataRequestDataCodeType {
  public final static GeneralDataRequestDataCodeType DIRECT_CONTROL_TRANSMITTER_ID_REQUEST = new GeneralDataRequestDataCodeType("DIRECT_CONTROL_TRANSMITTER_ID_REQUEST", isoObject_wrapJNI.DIRECT_CONTROL_TRANSMITTER_ID_REQUEST_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GeneralDataRequestDataCodeType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GeneralDataRequestDataCodeType.class + " with value " + swigValue);
  }

  private GeneralDataRequestDataCodeType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GeneralDataRequestDataCodeType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GeneralDataRequestDataCodeType(String swigName, GeneralDataRequestDataCodeType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GeneralDataRequestDataCodeType[] swigValues = { DIRECT_CONTROL_TRANSMITTER_ID_REQUEST };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


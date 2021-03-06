/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift7.TEnum;

public enum ThriftResourceType implements org.apache.thrift7.TEnum {
  UNKNOWN(1),
  MEM(2),
  NET(3);

  private final int value;

  private ThriftResourceType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftResourceType findByValue(int value) { 
    switch (value) {
      case 1:
        return UNKNOWN;
      case 2:
        return MEM;
      case 3:
        return NET;
      default:
        return null;
    }
  }
}

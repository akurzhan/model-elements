/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Represents a traffic source. In the DB this is a link with
   * terminal node at the begin. */
public class Origin extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Origin\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Represents a traffic source. In the DB this is a link with\\n   * terminal node at the begin.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"endId\",\"type\":\"string\",\"doc\":\"id of the node that traffic flows into from the origin\"}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  /** id of the node that traffic flows into from the origin */
  @Deprecated public java.lang.CharSequence endId;

  /**
   * Default constructor.
   */
  public Origin() {}

  /**
   * All-args constructor.
   */
  public Origin(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence endId) {
    this.id = id;
    this.name = name;
    this.endId = endId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return endId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: endId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'endId' field.
   * id of the node that traffic flows into from the origin   */
  public java.lang.CharSequence getEndId() {
    return endId;
  }

  /**
   * Sets the value of the 'endId' field.
   * id of the node that traffic flows into from the origin   * @param value the value to set.
   */
  public void setEndId(java.lang.CharSequence value) {
    this.endId = value;
  }

  /** Creates a new Origin RecordBuilder */
  public static edu.berkeley.path.model_elements_base.Origin.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.Origin.Builder();
  }
  
  /** Creates a new Origin RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.Origin.Builder newBuilder(edu.berkeley.path.model_elements_base.Origin.Builder other) {
    return new edu.berkeley.path.model_elements_base.Origin.Builder(other);
  }
  
  /** Creates a new Origin RecordBuilder by copying an existing Origin instance */
  public static edu.berkeley.path.model_elements_base.Origin.Builder newBuilder(edu.berkeley.path.model_elements_base.Origin other) {
    return new edu.berkeley.path.model_elements_base.Origin.Builder(other);
  }
  
  /**
   * RecordBuilder for Origin instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Origin>
    implements org.apache.avro.data.RecordBuilder<Origin> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence endId;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.Origin.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.Origin.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Origin instance */
    private Builder(edu.berkeley.path.model_elements_base.Origin other) {
            super(edu.berkeley.path.model_elements_base.Origin.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.endId)) {
        this.endId = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.endId);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.Origin.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.Origin.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.Origin.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.Origin.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'endId' field */
    public java.lang.CharSequence getEndId() {
      return endId;
    }
    
    /** Sets the value of the 'endId' field */
    public edu.berkeley.path.model_elements_base.Origin.Builder setEndId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.endId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'endId' field has been set */
    public boolean hasEndId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'endId' field */
    public edu.berkeley.path.model_elements_base.Origin.Builder clearEndId() {
      endId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Origin build() {
      try {
        Origin record = new Origin();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.endId = fieldSetFlags()[2] ? this.endId : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}

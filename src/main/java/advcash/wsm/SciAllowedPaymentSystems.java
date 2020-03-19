/**
 * SciAllowedPaymentSystems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class SciAllowedPaymentSystems implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SciAllowedPaymentSystems(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ADVANCED_CASH = "ADVANCED_CASH";
    public static final String _BITCOIN = "BITCOIN";
    public static final String _ECOIN = "ECOIN";
    public static final String _EGO_PAY = "EGO_PAY";
    public static final String _OKPAY = "OKPAY";
    public static final String _PAXUM = "PAXUM";
    public static final String _PAYEER = "PAYEER";
    public static final String _PERFECT_MONEY = "PERFECT_MONEY";
    public static final String _WALLET_ONE = "WALLET_ONE";
    public static final String _WEB_MONEY = "WEB_MONEY";
    public static final String _YANDEX_MONEY = "YANDEX_MONEY";
    public static final String _PSB_RETAIL = "PSB_RETAIL";
    public static final String _SVYAZNOY_BANK = "SVYAZNOY_BANK";
    public static final String _SBER_ONLINE = "SBER_ONLINE";
    public static final String _ALFACLICK = "ALFACLICK";
    public static final String _PRIVAT24 = "PRIVAT24";
    public static final String _QIWI = "QIWI";
    public static final String _WEX = "WEX";
    public static final String _RUSSIAN_STANDARD_BANK = "RUSSIAN_STANDARD_BANK";
    public static final String _EXMO = "EXMO";
    public static final String _PAYZA = "PAYZA";
    public static final String _EPESE = "EPESE";
    public static final String _ECOIN_VOUCHER = "ECOIN_VOUCHER";
    public static final String _EPAY = "EPAY";
    public static final String _LITECOIN = "LITECOIN";
    public static final String _BITCOIN_CASH = "BITCOIN_CASH";
    public static final String _RIPPLE = "RIPPLE";
    public static final String _ETHEREUM = "ETHEREUM";
    public static final String _ZCASH = "ZCASH";
    public static final String _USDTETHER = "USDTETHER";
    public static final String _VISA = "VISA";
    public static final String _MASTERCARD = "MASTERCARD";
    public static final String _MIR = "MIR";
    public static final SciAllowedPaymentSystems ADVANCED_CASH = new SciAllowedPaymentSystems(_ADVANCED_CASH);
    public static final SciAllowedPaymentSystems BITCOIN = new SciAllowedPaymentSystems(_BITCOIN);
    public static final SciAllowedPaymentSystems ECOIN = new SciAllowedPaymentSystems(_ECOIN);
    public static final SciAllowedPaymentSystems EGO_PAY = new SciAllowedPaymentSystems(_EGO_PAY);
    public static final SciAllowedPaymentSystems OKPAY = new SciAllowedPaymentSystems(_OKPAY);
    public static final SciAllowedPaymentSystems PAXUM = new SciAllowedPaymentSystems(_PAXUM);
    public static final SciAllowedPaymentSystems PAYEER = new SciAllowedPaymentSystems(_PAYEER);
    public static final SciAllowedPaymentSystems PERFECT_MONEY = new SciAllowedPaymentSystems(_PERFECT_MONEY);
    public static final SciAllowedPaymentSystems WALLET_ONE = new SciAllowedPaymentSystems(_WALLET_ONE);
    public static final SciAllowedPaymentSystems WEB_MONEY = new SciAllowedPaymentSystems(_WEB_MONEY);
    public static final SciAllowedPaymentSystems YANDEX_MONEY = new SciAllowedPaymentSystems(_YANDEX_MONEY);
    public static final SciAllowedPaymentSystems PSB_RETAIL = new SciAllowedPaymentSystems(_PSB_RETAIL);
    public static final SciAllowedPaymentSystems SVYAZNOY_BANK = new SciAllowedPaymentSystems(_SVYAZNOY_BANK);
    public static final SciAllowedPaymentSystems SBER_ONLINE = new SciAllowedPaymentSystems(_SBER_ONLINE);
    public static final SciAllowedPaymentSystems ALFACLICK = new SciAllowedPaymentSystems(_ALFACLICK);
    public static final SciAllowedPaymentSystems PRIVAT24 = new SciAllowedPaymentSystems(_PRIVAT24);
    public static final SciAllowedPaymentSystems QIWI = new SciAllowedPaymentSystems(_QIWI);
    public static final SciAllowedPaymentSystems WEX = new SciAllowedPaymentSystems(_WEX);
    public static final SciAllowedPaymentSystems RUSSIAN_STANDARD_BANK = new SciAllowedPaymentSystems(_RUSSIAN_STANDARD_BANK);
    public static final SciAllowedPaymentSystems EXMO = new SciAllowedPaymentSystems(_EXMO);
    public static final SciAllowedPaymentSystems PAYZA = new SciAllowedPaymentSystems(_PAYZA);
    public static final SciAllowedPaymentSystems EPESE = new SciAllowedPaymentSystems(_EPESE);
    public static final SciAllowedPaymentSystems ECOIN_VOUCHER = new SciAllowedPaymentSystems(_ECOIN_VOUCHER);
    public static final SciAllowedPaymentSystems EPAY = new SciAllowedPaymentSystems(_EPAY);
    public static final SciAllowedPaymentSystems LITECOIN = new SciAllowedPaymentSystems(_LITECOIN);
    public static final SciAllowedPaymentSystems BITCOIN_CASH = new SciAllowedPaymentSystems(_BITCOIN_CASH);
    public static final SciAllowedPaymentSystems RIPPLE = new SciAllowedPaymentSystems(_RIPPLE);
    public static final SciAllowedPaymentSystems ETHEREUM = new SciAllowedPaymentSystems(_ETHEREUM);
    public static final SciAllowedPaymentSystems ZCASH = new SciAllowedPaymentSystems(_ZCASH);
    public static final SciAllowedPaymentSystems USDTETHER = new SciAllowedPaymentSystems(_USDTETHER);
    public static final SciAllowedPaymentSystems VISA = new SciAllowedPaymentSystems(_VISA);
    public static final SciAllowedPaymentSystems MASTERCARD = new SciAllowedPaymentSystems(_MASTERCARD);
    public static final SciAllowedPaymentSystems MIR = new SciAllowedPaymentSystems(_MIR);
    public String getValue() { return _value_;}
    public static SciAllowedPaymentSystems fromValue(String value)
          throws IllegalArgumentException {
        SciAllowedPaymentSystems enumeration = (SciAllowedPaymentSystems)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static SciAllowedPaymentSystems fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SciAllowedPaymentSystems.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "sciAllowedPaymentSystems"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

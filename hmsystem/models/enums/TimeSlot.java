package hmsystem.models.enums;
public enum TimeSlot {
    SLOT_0("0000 to 0030"),
    SLOT_1("0030 to 0100"),
    SLOT_2("0100 to 0130"),
    SLOT_3("0130 to 0200"),
    SLOT_4("0200 to 0230"),
    SLOT_5("0230 to 0300"),
    SLOT_6("0300 to 0330"),
    SLOT_7("0330 to 0400"),
    SLOT_8("0400 to 0430"),
    SLOT_9("0430 to 0500"),
    SLOT_10("0500 to 0530"),
    SLOT_11("0530 to 0600"),
    SLOT_12("0600 to 0630"),
    SLOT_13("0630 to 0700"),
    SLOT_14("0700 to 0730"),
    SLOT_15("0730 to 0800"),
    SLOT_16("0800 to 0830"),
    SLOT_17("0830 to 0900"),
    SLOT_18("0900 to 0930"),
    SLOT_19("0930 to 1000"),
    SLOT_20("1000 to 1030"),
    SLOT_21("1030 to 1100"),
    SLOT_22("1100 to 1130"),
    SLOT_23("1130 to 1200"),
    SLOT_24("1200 to 1230"),
    SLOT_25("1230 to 1300"),
    SLOT_26("1300 to 1330"),
    SLOT_27("1330 to 1400"),
    SLOT_28("1400 to 1430"),
    SLOT_29("1430 to 1500"),
    SLOT_30("1500 to 1530"),
    SLOT_31("1530 to 1600"),
    SLOT_32("1600 to 1630"),
    SLOT_33("1630 to 1700"),
    SLOT_34("1700 to 1730"),
    SLOT_35("1730 to 1800"),
    SLOT_36("1800 to 1830"),
    SLOT_37("1830 to 1900"),
    SLOT_38("1900 to 1930"),
    SLOT_39("1930 to 2000"),
    SLOT_40("2000 to 2030"),
    SLOT_41("2030 to 2100"),
    SLOT_42("2100 to 2130"),
    SLOT_43("2130 to 2200"),
    SLOT_44("2200 to 2230"),
    SLOT_45("2230 to 2300"),
    SLOT_46("2300 to 2330"),
    SLOT_47("2330 to 0000");

    private final String timeRange;

    TimeSlot(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getTimeRange() {
        return timeRange;
    }
}
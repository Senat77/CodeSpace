package com.alpha.practicalwork27.work12;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {

    private PhoneRecord[] records = new PhoneRecord[8];
    private int count ;

    private final PhoneRecordByNameComparator byNameComparator = new PhoneRecordByNameComparator();
    private final PhoneRecordByPhoneComparator byPhoneComparator = new PhoneRecordByPhoneComparator();

    public void addPhoneNumber(String name, String phone) {
        if(count < records.length)
            records[count++] = new PhoneRecord(name, phone);
    }

    public void printPhoneBook() {
        Arrays.stream(records).limit(count).forEach(System.out::println);
    }

    public void sortByName() {
        Arrays.sort(records, byNameComparator);
    }

    public void sortByPhoneNumber() {
        Arrays.sort(records, byPhoneComparator);
    }

    public void sortByNameAndPhone() {
        Arrays.sort(records, byNameComparator.thenComparing(byPhoneComparator));
    }

    class PhoneRecordByNameComparator implements Comparator<PhoneRecord> {
        @Override
        public int compare(PhoneRecord o1, PhoneRecord o2) {
            return (o1 != null && o2 != null) ? o1.record.compareTo(o2.record) : 0;
        }
    }

    class PhoneRecordByPhoneComparator implements Comparator<PhoneRecord> {
        @Override
        public int compare(PhoneRecord o1, PhoneRecord o2) {
            return (o1 != null && o2 != null) ? o1.phone.compareTo(o2.phone) : 0;
        }
    }

    class PhoneRecord {
        private String record;
        private String phone;

        public PhoneRecord(String record, String phone) {
            this.record = record;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "PhoneRecord : " +
                    "record='" + record + '\'' +
                    ", phone='" + phone + '\'';
        }
    }
}

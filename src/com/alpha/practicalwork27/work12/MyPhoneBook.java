package com.alpha.practicalwork27.work12;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {

    private PhoneRecord[] records = new PhoneRecord[8];
    private int count ;

    public void addPhoneNumber(String name, String phone) {
        if(count < records.length)
            records[count++] = new PhoneRecord(name, phone);
    }

    public void printPhoneBook() {
        Arrays.stream(records).limit(count).forEach(System.out::println);
    }

    public void sortByName() {
        Arrays.sort(records, new PhoneRecordByNameComparator());
    }

    public void sortByPhoneNumber() {
        Arrays.sort(records, new PhoneRecordByPhoneComparator());
    }

    public void sortByNameAndPhone() {
        Arrays.sort(records, new PhoneRecordByNameComparator().thenComparing(new PhoneRecordByPhoneComparator()));
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

        public String getRecord() {
            return record;
        }

        public void setRecord(String record) {
            this.record = record;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
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

package com.alpha.practicalwork27.work1;

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
        Arrays.sort(records, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                PhoneRecord pr1 = (PhoneRecord) o1;
                PhoneRecord pr2 = (PhoneRecord) o2;
                return compare(pr1.record , pr2.record);
            }
        });
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
            return "PhoneRecord:" +
                    "record='" + record + '\'' +
                    ", phone='" + phone + '\'';
        }
    }
}
